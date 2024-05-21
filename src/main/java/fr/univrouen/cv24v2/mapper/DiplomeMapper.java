package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.DiplomeEntity;
import fr.univrouen.cv24v2.model.Diplome;
/**
 * Mapper utilisé pour convertir des objets entre les entités DiplomeEntity et Diplome.
 * <p>
 * Cette classe fournit des méthodes statiques pour convertir un objet Diplome en DiplomeEntity et vice versa.
 * </p>
 *
 * @since 2024-05-21
 */
public class DiplomeMapper {
    /**
     * Convertit un objet Diplome en DiplomeEntity.
     *
     * @param source l'objet Diplome source à convertir.
     * @return l'objet DiplomeEntity converti.
     */
    public static DiplomeEntity convertToEntity(Diplome source) {
        DiplomeEntity target = new DiplomeEntity();
        target.setDate(source.getDate());
        target.setInstitut(source.getInstitut());
        target.setTitre(source.getTitre());
        target.setNiveau(source.getNiveau());
        return target;
    }
    /**
     * Convertit un objet DiplomeEntity en Diplome.
     *
     * @param source l'objet DiplomeEntity source à convertir.
     * @return l'objet Diplome converti.
     */
    public static Diplome convertToXml(DiplomeEntity source) {
        Diplome target = new Diplome();
        target.setDate(source.getDate());
        target.setInstitut(source.getInstitut());
        target.setTitre(source.getTitre());
        target.setNiveau(source.getNiveau());
        return target;
    }

}
