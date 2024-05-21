package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.LangueVivanteEntity;
import fr.univrouen.cv24v2.model.LangueVivante;
/**
 * Mapper utilisé pour convertir des objets entre les entités LangueVivanteEntity et LangueVivante.
 */
public class LangueVivanteMapper {
    /**
     * Convertit un objet LangueVivante en LangueVivanteEntity.
     *
     * @param source l'objet LangueVivante source à convertir.
     * @return l'objet LangueVivanteEntity converti.
     */
    public static LangueVivanteEntity convertToEntity(LangueVivante source) {
        LangueVivanteEntity target = new LangueVivanteEntity();
        target.setLang(source.getLang());
        target.setCert(source.getCert());
        target.setNivs(source.getNivs());
        target.setNivi(source.getNivi());
        return target;
    }
    /**
     * Convertit un objet LangueVivanteEntity en LangueVivante.
     *
     * @param source l'objet LangueVivanteEntity source à convertir.
     * @return l'objet LangueVivante converti.
     */
    public static LangueVivante convertToXml(LangueVivanteEntity source) {
        LangueVivante target = new LangueVivante();
        target.setLang(source.getLang());
        target.setCert(source.getCert());
        target.setNivs(source.getNivs());
        target.setNivi(source.getNivi());
        return target;
    }

}
