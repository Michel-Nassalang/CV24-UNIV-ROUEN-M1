package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.DetailExperienceEntity;
import fr.univrouen.cv24v2.model.DetailExperience;
/**
 * Mapper utilisé pour convertir des objets entre les entités DetailExperienceEntity et DetailExperience.
 * <p>
 * Cette classe fournit des méthodes statiques pour convertir un objet DetailExperience en DetailExperienceEntity et vice versa.
 * </p>
 *
 * @since 2024-05-21
 */
public class DetailExperienceMapper {
    /**
     * Convertit un objet DetailExperience en DetailExperienceEntity.
     *
     * @param source l'objet DetailExperience source à convertir.
     * @return l'objet DetailExperienceEntity converti.
     */
    public static DetailExperienceEntity convertToEntity(DetailExperience source) {
        DetailExperienceEntity target = new DetailExperienceEntity();
        target.setDatedeb(source.getDatedeb());
        target.setDatefin(source.getDatefin());
        target.setTitre(source.getTitre());
        return target;
    }
    /**
     * Convertit un objet DetailExperienceEntity en DetailExperience.
     *
     * @param source l'objet DetailExperienceEntity source à convertir.
     * @return l'objet DetailExperience converti.
     */
    public static DetailExperience convertToXml(DetailExperienceEntity source) {
        DetailExperience target = new DetailExperience();
        target.setDatedeb(source.getDatedeb());
        target.setDatefin(source.getDatefin());
        target.setTitre(source.getTitre());
        return target;
    }

}
