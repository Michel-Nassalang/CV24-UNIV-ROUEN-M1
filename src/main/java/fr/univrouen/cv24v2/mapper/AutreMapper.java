package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.AutreEntity;
import fr.univrouen.cv24v2.model.Autre;

public class AutreMapper {

    public static AutreEntity convertToEntity(Autre source) {
        AutreEntity target = new AutreEntity();
        target.setTitre(source.getTitre());
        target.setComment(source.getComment());
        return target;
    }
    public static Autre convertToXml(AutreEntity source) {
        Autre target = new Autre();
        target.setTitre(source.getTitre());
        target.setComment(source.getComment());
        return target;
    }

}
