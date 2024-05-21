package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

/**
 * Modèle pour représenter des informations additionnelles dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Autre {
    /**
     * Titre des informations.
     */
    @XmlAttribute(name = "titre", required = true)
    private String titre;
    /**
     * Commentaire associé aux informations.
     */
    @XmlAttribute(name = "comment")
    private String comment;

    // Getters and setters
    /**
     * Retourne le titre des informations.
     *
     * @return le titre des informations.
     */
    public String getTitre() {
        return titre;
    }
    /**
     * Définit le titre des informations.
     *
     * @param titre le titre des informations.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }
    /**
     * Retourne le commentaire associé aux informations.
     *
     * @return le commentaire associé aux informations.
     */
    public String getComment() {
        return comment;
    }
    /**
     * Définit le commentaire associé aux informations.
     *
     * @param comment le commentaire associé aux informations.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

}
