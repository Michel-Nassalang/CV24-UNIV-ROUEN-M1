package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.AutreEntity;
import fr.univrouen.cv24v2.entity.DiversEntity;
import fr.univrouen.cv24v2.entity.LangueVivanteEntity;
import fr.univrouen.cv24v2.model.Autre;
import fr.univrouen.cv24v2.model.Divers;
import fr.univrouen.cv24v2.model.LangueVivante;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Mapper utilisé pour convertir des objets entre les entités DiversEntity et Divers.
 */
public class DiversMapper {
    /**
     * Convertit un objet Divers en DiversEntity.
     *
     * @param source l'objet Divers source à convertir.
     * @return l'objet DiversEntity converti.
     */
    public static DiversEntity convertToEntity(Divers source) {
        DiversEntity target = new DiversEntity();

        // Convertir les langues vivantes
        List<LangueVivante> lvList = source.getLv();
        if (lvList != null) {
            List<LangueVivanteEntity> lvEntityList = lvList.stream()
                    .map(lv -> {
                        LangueVivanteEntity lvEntity = LangueVivanteMapper.convertToEntity(lv);
                        lvEntity.setDivers(target); // Associer la divers au langue vivante
                        return lvEntity;
                    })
                    .collect(Collectors.toList());
            target.setLv(lvEntityList);
        }

        // Convertir les autres éléments
        List<Autre> autreList = source.getAutre();
        if (autreList != null) {
            List<AutreEntity> autreEntityList = autreList.stream()
                    .map(autre -> {
                        AutreEntity autreEntity = AutreMapper.convertToEntity(autre);
                        autreEntity.setDivers(target); // Associer la divers à l'autre
                        return autreEntity;
                    })
                    .collect(Collectors.toList());
            target.setAutre(autreEntityList);
        }
        return target;
    }
    /**
     * Convertit un objet DiversEntity en Divers.
     *
     * @param source l'objet DiversEntity source à convertir.
     * @return l'objet Divers converti.
     */
    public static Divers convertToXml(DiversEntity source) {
        Divers target = new Divers();

        // Convertir les langues vivantes
        List<LangueVivanteEntity> lvEntityList = source.getLv();
        if (lvEntityList != null) {
            List<LangueVivante> lvList = lvEntityList.stream()
                    .map(LangueVivanteMapper::convertToXml)
                    .collect(Collectors.toList());
            target.setLv(lvList);
        }

        // Convertir les autres éléments
        List<AutreEntity> autreEntityList = source.getAutre();
        if (autreEntityList != null) {
            List<Autre> autreList = autreEntityList.stream()
                    .map(AutreMapper::convertToXml)
                    .collect(Collectors.toList());
            target.setAutre(autreList);
        }

        return target;
    }


}
