package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.DetailExperienceEntity;
import fr.univrouen.cv24v2.entity.ProfEntity;
import fr.univrouen.cv24v2.model.DetailExperience;
import fr.univrouen.cv24v2.model.Prof;

import java.util.List;
import java.util.stream.Collectors;

public class ProfMapper {

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
