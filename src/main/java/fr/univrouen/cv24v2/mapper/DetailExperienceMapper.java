package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.DetailExperienceEntity;
import fr.univrouen.cv24v2.model.DetailExperience;

public class DetailExperienceMapper {

    public static DetailExperienceEntity convertToEntity(DetailExperience source) {
        DetailExperienceEntity target = new DetailExperienceEntity();
        target.setDatedeb(source.getDatedeb());
        target.setDatefin(source.getDatefin());
        target.setTitre(source.getTitre());
        return target;
    }

    public static DetailExperience convertToXml(DetailExperienceEntity source) {
        DetailExperience target = new DetailExperience();
        target.setDatedeb(source.getDatedeb());
        target.setDatefin(source.getDatefin());
        target.setTitre(source.getTitre());
        return target;
    }

}
