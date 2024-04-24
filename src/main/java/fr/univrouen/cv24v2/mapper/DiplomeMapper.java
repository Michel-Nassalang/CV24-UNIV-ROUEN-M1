package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.DiplomeEntity;
import fr.univrouen.cv24v2.model.Diplome;

public class DiplomeMapper {

    public static DiplomeEntity convertToEntity(Diplome source) {
        DiplomeEntity target = new DiplomeEntity();
        target.setDate(source.getDate());
        target.setInstitut(source.getInstitut());
        target.setTitre(source.getTitre());
        target.setNiveau(source.getNiveau());
        return target;
    }

    public static Diplome convertToXml(DiplomeEntity source) {
        Diplome target = new Diplome();
        target.setDate(source.getDate());
        target.setInstitut(source.getInstitut());
        target.setTitre(source.getTitre());
        target.setNiveau(source.getNiveau());
        return target;
    }

}
