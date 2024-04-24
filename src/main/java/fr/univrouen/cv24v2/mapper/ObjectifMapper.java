package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.ObjectifEntity;
import fr.univrouen.cv24v2.model.Objectif;

public class ObjectifMapper {

    public static ObjectifEntity convertToEntity(Objectif source) {
        ObjectifEntity target = new ObjectifEntity();
        target.setValue(source.getValue());
        target.setStatut(source.getStatut());
        return target;
    }

    public static Objectif convertToXml(ObjectifEntity source) {
        Objectif target = new Objectif();
        target.setValue(source.getValue());
        target.setStatut(source.getStatut());
        return target;
    }


}
