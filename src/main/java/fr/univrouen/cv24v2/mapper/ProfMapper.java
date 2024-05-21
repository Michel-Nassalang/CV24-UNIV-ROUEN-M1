package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.DetailExperienceEntity;
import fr.univrouen.cv24v2.entity.ProfEntity;
import fr.univrouen.cv24v2.model.DetailExperience;
import fr.univrouen.cv24v2.model.Prof;

import java.util.List;
import java.util.stream.Collectors;
/**
 * Mapper utilisé pour convertir des objets entre les entités ProfEntity et Prof.
 */
public class ProfMapper {
    /**
     * Convertit un objet Prof en ProfEntity.
     *
     * @param source l'objet Prof source à convertir.
     * @return l'objet ProfEntity converti.
     */
    public static ProfEntity convertToEntity(Prof source) {
        ProfEntity target = new ProfEntity();

        // Convertir les détails d'expérience
        List<DetailExperience> detailList = source.getDetail();
        if (detailList != null) {
            List<DetailExperienceEntity> detailEntityList = detailList.stream()
                    .map(detail -> {
                        DetailExperienceEntity detailEntity = DetailExperienceMapper.convertToEntity(detail);
                        detailEntity.setProf(target); // Associer le professeur au détail d'expérience
                        return detailEntity;
                    })
                    .collect(Collectors.toList());

            target.setDetail(detailEntityList);
        }
        return target;
    }
    /**
     * Convertit un objet ProfEntity en Prof.
     *
     * @param source l'objet ProfEntity source à convertir.
     * @return l'objet Prof converti.
     */
    public static Prof convertToXml(ProfEntity source) {
        Prof target = new Prof();

        // Convertir les détails d'expérience
        List<DetailExperienceEntity> detailEntityList = source.getDetail();
        if (detailEntityList != null) {
            List<DetailExperience> detailList = detailEntityList.stream()
                    .map(DetailExperienceMapper::convertToXml)
                    .collect(Collectors.toList());
            target.setDetail(detailList);
        }
        return target;
    }

}
