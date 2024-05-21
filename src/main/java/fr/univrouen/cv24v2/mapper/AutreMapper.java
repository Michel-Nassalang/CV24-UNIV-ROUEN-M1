package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.AutreEntity;
import fr.univrouen.cv24v2.model.Autre;
/**
 * Mapper utilisé pour convertir des objets entre les entités AutreEntity et les modèles Autre.
 * <p>
 * Cette classe fournit des méthodes statiques pour convertir un objet Autre en AutreEntity et vice versa.
 * </p>
 *
 * @since 2024-05-21
 */
public class AutreMapper {
    /**
     * Convertit un objet Autre en AutreEntity.
     *
     * @param source l'objet Autre source à convertir.
     * @return l'objet AutreEntity converti.
     */
    public static AutreEntity convertToEntity(Autre source) {
        AutreEntity target = new AutreEntity();
        target.setTitre(source.getTitre());
        target.setComment(source.getComment());
        return target;
    }
    /**
     * Convertit un objet AutreEntity en Autre.
     *
     * @param source l'objet AutreEntity source à convertir.
     * @return l'objet Autre converti.
     */
    public static Autre convertToXml(AutreEntity source) {
        Autre target = new Autre();
        target.setTitre(source.getTitre());
        target.setComment(source.getComment());
        return target;
    }

}
