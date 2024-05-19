package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.*;
import fr.univrouen.cv24v2.model.*;

public class Cv24Mapper {

    public static Cv24Entity convertToEntity(Cv24 source) {
        Cv24Entity cv24 = new Cv24Entity();

        Identite identite = source.getIdentite();
        if (identite != null) {
            IdentiteEntity identiteEntity = IdentiteMapper.convertToEntity(identite);
            cv24.setIdentite(identiteEntity);
        }

        Objectif objectif = source.getObjectif();
        if (objectif != null) {
            ObjectifEntity objectifEntity = ObjectifMapper.convertToEntity(objectif);
            cv24.setObjectif(objectifEntity);
        }

        Prof prof = source.getProf();
        if (prof != null) {
            ProfEntity profEntity = ProfMapper.convertToEntity(prof);
            cv24.setProf(profEntity);
        }

        Competences competences = source.getCompetences();
        if (competences != null) {
            CompetencesEntity competencesEntity = CompetencesMapper.convertToEntity(competences);
            cv24.setCompetences(competencesEntity);
        }

        Divers divers = source.getDivers();
        if (divers != null) {
            DiversEntity diversEntity = DiversMapper.convertToEntity(divers);
            cv24.setDivers(diversEntity);
        }
        return cv24;
    }

    public static Cv24 convertToXml(Cv24Entity source) {
        Cv24 cv24 = new Cv24();

        IdentiteEntity identiteEntity = source.getIdentite();
        if (identiteEntity != null) {
            Identite identite = IdentiteMapper.convertToXml(identiteEntity);
            cv24.setIdentite(identite);
        }

        ObjectifEntity objectifEntity = source.getObjectif();
        if (objectifEntity != null) {
            Objectif objectif = ObjectifMapper.convertToXml(objectifEntity);
            cv24.setObjectif(objectif);
        }

        ProfEntity profEntity = source.getProf();
        if (profEntity != null) {
            Prof prof = ProfMapper.convertToXml(profEntity);
            cv24.setProf(prof);
        }

        CompetencesEntity competencesEntity = source.getCompetences();
        if (competencesEntity != null) {
            Competences competences = CompetencesMapper.convertToXml(competencesEntity);
            cv24.setCompetences(competences);
        }

        DiversEntity diversEntity = source.getDivers();
        if (diversEntity != null) {
            Divers divers = DiversMapper.convertToXml(diversEntity);
            cv24.setDivers(divers);
        }

        return cv24;
    }


}
