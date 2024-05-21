package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.Date;
/**
 * Modèle pour représenter une certification dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Certif {
    /**
     * Date de début de la certification.
     */
    @XmlElement(name = "datedeb", required = true, namespace = "http://univ.fr/cv24")
    private Date datedeb;
    /**
     * Date de fin de la certification.
     */
    @XmlElement(name = "datefin", namespace = "http://univ.fr/cv24")
    private Date datefin;
    /**
     * Titre de la certification.
     */
    @XmlElement(name = "titre", required = true, namespace = "http://univ.fr/cv24")
    private String titre;

    // Getters and setters
    /**
     * Retourne la date de début de la certification.
     *
     * @return la date de début de la certification.
     */
    public Date getDatefin() {
        return datefin;
    }
    /**
     * Définit la date de fin de la certification.
     *
     * @param datefin la date de fin de la certification.
     */
    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }
    /**
     * Retourne la date de fin de la certification.
     *
     * @return la date de fin de la certification.
     */
    public Date getDatedeb() {
        return datedeb;
    }
    /**
     * Définit la date de début de la certification.
     *
     * @param datedeb la date de début de la certification.
     */
    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }
    /**
     * Retourne le titre de la certification.
     *
     * @return le titre de la certification.
     */
    public String getTitre() {
        return titre;
    }
    /**
     * Définit le titre de la certification.
     *
     * @param titre le titre de la certification.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

}
