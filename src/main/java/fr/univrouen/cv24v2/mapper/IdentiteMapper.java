package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.IdentiteEntity;
import fr.univrouen.cv24v2.model.Identite;

public class IdentiteMapper {

    public static IdentiteEntity convertToEntity(Identite source) {
        IdentiteEntity target = new IdentiteEntity();
        target.setGenre(source.getGenre());
        target.setNom(source.getNom());
        target.setPrenom(source.getPrenom());
        target.setTel(source.getTel());
        target.setMel(source.getMel());
        return target;
    }

    public static Identite convertToXml(IdentiteEntity source) {
        Identite target = new Identite();
        target.setGenre(source.getGenre());
        target.setNom(source.getNom());
        target.setPrenom(source.getPrenom());
        target.setTel(source.getTel());
        target.setMel(source.getMel());
        return target;
    }

}
