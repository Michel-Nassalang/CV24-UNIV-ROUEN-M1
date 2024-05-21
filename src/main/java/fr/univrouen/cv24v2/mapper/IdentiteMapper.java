package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.IdentiteEntity;
import fr.univrouen.cv24v2.model.Identite;
/**
 * Mapper utilisé pour convertir des objets entre les entités IdentiteEntity et Identite.
 */
public class IdentiteMapper {
    /**
     * Convertit un objet Identite en IdentiteEntity.
     *
     * @param source l'objet Identite source à convertir.
     * @return l'objet IdentiteEntity converti.
     */
    public static IdentiteEntity convertToEntity(Identite source) {
        IdentiteEntity target = new IdentiteEntity();
        target.setGenre(source.getGenre());
        target.setNom(source.getNom());
        target.setPrenom(source.getPrenom());
        target.setTel(source.getTel());
        target.setMel(source.getMel());
        return target;
    }
    /**
     * Convertit un objet IdentiteEntity en Identite.
     *
     * @param source l'objet IdentiteEntity source à convertir.
     * @return l'objet Identite converti.
     */
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
