package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.CertifEntity;
import fr.univrouen.cv24v2.model.Certif;

public class CertifMapper {

    public static CertifEntity convertToEntity(Certif source) {
        CertifEntity target = new CertifEntity();
        target.setDatedeb(source.getDatedeb());
        target.setDatefin(source.getDatefin());
        target.setTitre(source.getTitre());
        return target;
    }

    public static Certif convertToXml(CertifEntity source) {
        Certif target = new Certif();
        target.setDatedeb(source.getDatedeb());
        target.setDatefin(source.getDatefin());
        target.setTitre(source.getTitre());
        return target;
    }
}
