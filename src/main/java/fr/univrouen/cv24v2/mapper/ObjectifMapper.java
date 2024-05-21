package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.ObjectifEntity;
import fr.univrouen.cv24v2.model.Objectif;
/**
 * Mapper utilisé pour convertir des objets entre les entités ObjectifEntity et Objectif.
 */
public class ObjectifMapper {
    /**
     * Convertit un objet Objectif en ObjectifEntity.
     *
     * @param source l'objet Objectif source à convertir.
     * @return l'objet ObjectifEntity converti.
     */
    public static ObjectifEntity convertToEntity(Objectif source) {
        ObjectifEntity target = new ObjectifEntity();
        target.setValue(source.getValue());
        target.setStatut(source.getStatut());
        return target;
    }
    /**
     * Convertit un objet ObjectifEntity en Objectif.
     *
     * @param source l'objet ObjectifEntity source à convertir.
     * @return l'objet Objectif converti.
     */
    public static Objectif convertToXml(ObjectifEntity source) {
        Objectif target = new Objectif();
        target.setValue(source.getValue());
        target.setStatut(source.getStatut());
        return target;
    }

}
