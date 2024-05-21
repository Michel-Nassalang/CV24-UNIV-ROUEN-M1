package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

/**
 * Modèle pour représenter les détails d'une expérience dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DetailExperience {

    /**
     * Date de début de l'expérience.
     */
    @XmlElement(name = "datedeb", required = true, namespace = "http://univ.fr/cv24")
    private Date datedeb;

    /**
     * Date de fin de l'expérience.
     */
    @XmlElement(name = "datefin", namespace = "http://univ.fr/cv24")
    private Date datefin;

    /**
     * Titre de l'expérience.
     */
    @XmlElement(name = "titre", required = true, namespace = "http://univ.fr/cv24")
    private String titre;

    // Getters and setters

    /**
     * Retourne la date de début de l'expérience.
     *
     * @return la date de début de l'expérience.
     */
    public Date getDatedeb() {
        return datedeb;
    }

    /**
     * Définit la date de début de l'expérience.
     *
     * @param datedeb la date de début de l'expérience.
     */
    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }

    /**
     * Retourne la date de fin de l'expérience.
     *
     * @return la date de fin de l'expérience.
     */
    public Date getDatefin() {
        return datefin;
    }

    /**
     * Définit la date de fin de l'expérience.
     *
     * @param datefin la date de fin de l'expérience.
     */
    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    /**
     * Retourne le titre de l'expérience.
     *
     * @return le titre de l'expérience.
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit le titre de l'expérience.
     *
     * @param titre le titre de l'expérience.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }
}