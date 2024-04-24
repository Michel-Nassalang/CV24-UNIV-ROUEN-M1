package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.*;
import fr.univrouen.cv24v2.model.*;

public class Cv24Mapper {

    public static Cv24Entity convertToEntity(Cv24 source) {
        Cv24Entity target = new Cv24Entity();

        Identite identite = source.getIdentite();
        if (identite != null) {
            IdentiteEntity identiteEntity = IdentiteMapper.convertToEntity(identite);
            target.setIdentite(identiteEntity);
        }

        Objectif objectif = source.getObjectif();
        if (objectif != null) {
            ObjectifEntity objectifEntity = ObjectifMapper.convertToEntity(objectif);
            target.setObjectif(objectifEntity);
        }

        Prof prof = source.getProf();
        if (prof != null) {
            ProfEntity profEntity = ProfMapper.convertToEntity(prof);
            target.setProf(profEntity);
        }

        Competences competences = source.getCompetences();
        if (competences != null) {
            CompetencesEntity competencesEntity = CompetencesMapper.convertToEntity(competences);
            target.setCompetences(competencesEntity);
        }

        Divers divers = source.getDivers();
        if (divers != null) {
            DiversEntity diversEntity = DiversMapper.convertToEntity(divers);
            target.setDivers(diversEntity);
        }
        return target;
    }

    public static Cv24 convertToXml(Cv24Entity source) {
        Cv24 target = new Cv24();

        IdentiteEntity identiteEntity = source.getIdentite();
        if (identiteEntity != null) {
            Identite identite = IdentiteMapper.convertToXml(identiteEntity);
            target.setIdentite(identite);
        }

        ObjectifEntity objectifEntity = source.getObjectif();
        if (objectifEntity != null) {
            Objectif objectif = ObjectifMapper.convertToXml(objectifEntity);
            target.setObjectif(objectif);
        }

        ProfEntity profEntity = source.getProf();
        if (profEntity != null) {
            Prof prof = ProfMapper.convertToXml(profEntity);
            target.setProf(prof);
        }

        CompetencesEntity competencesEntity = source.getCompetences();
        if (competencesEntity != null) {
            Competences competences = CompetencesMapper.convertToXml(competencesEntity);
            target.setCompetences(competences);
        }

        DiversEntity diversEntity = source.getDivers();
        if (diversEntity != null) {
            Divers divers = DiversMapper.convertToXml(diversEntity);
            target.setDivers(divers);
        }

        return target;
    }


}
