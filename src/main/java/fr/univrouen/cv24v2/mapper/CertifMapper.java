package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.CertifEntity;
import fr.univrouen.cv24v2.model.Certif;
/**
 * Mapper utilisé pour convertir des objets entre les entités CertifEntity et les modèles Certif.
 * <p>
 * Cette classe fournit des méthodes statiques pour convertir un objet Certif en CertifEntity et vice versa.
 * </p>
 *
 * @since 2024-05-21
 */
public class CertifMapper {
    /**
     * Convertit un objet Certif en CertifEntity.
     *
     * @param source l'objet Certif source à convertir.
     * @return l'objet CertifEntity converti.
     */
    public static CertifEntity convertToEntity(Certif source) {
        CertifEntity target = new CertifEntity();
        target.setDatedeb(source.getDatedeb());
        target.setDatefin(source.getDatefin());
        target.setTitre(source.getTitre());
        return target;
    }
    /**
     * Convertit un objet CertifEntity en Certif.
     *
     * @param source l'objet CertifEntity source à convertir.
     * @return l'objet Certif converti.
     */
    public static Certif convertToXml(CertifEntity source) {
        Certif target = new Certif();
        target.setDatedeb(source.getDatedeb());
        target.setDatefin(source.getDatefin());
        target.setTitre(source.getTitre());
        return target;
    }
}
