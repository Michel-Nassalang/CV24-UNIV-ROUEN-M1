package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.*;

import java.util.Date;

/**
 * Modèle pour représenter un diplôme dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Diplome {

    /**
     * Date d'obtention du diplôme.
     */
    @XmlElement(name = "date", required = true, namespace = "http://univ.fr/cv24")
    private Date date;

    /**
     * Institut où le diplôme a été obtenu.
     */
    @XmlElement(name = "institut", namespace = "http://univ.fr/cv24")
    private String institut;

    /**
     * Titre du diplôme.
     */
    @XmlElement(name = "titre", required = true, namespace = "http://univ.fr/cv24")
    private String titre;

    /**
     * Niveau du diplôme.
     */
    @XmlAttribute(name = "niveau", required = true)
    private int niveau;

    // Getters and setters

    /**
     * Retourne la date d'obtention du diplôme.
     *
     * @return la date d'obtention du diplôme.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Définit la date d'obtention du diplôme.
     *
     * @param date la date d'obtention du diplôme.
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Retourne l'institut où le diplôme a été obtenu.
     *
     * @return l'institut où le diplôme a été obtenu.
     */
    public String getInstitut() {
        return institut;
    }

    /**
     * Définit l'institut où le diplôme a été obtenu.
     *
     * @param institut l'institut où le diplôme a été obtenu.
     */
    public void setInstitut(String institut) {
        this.institut = institut;
    }

    /**
     * Retourne le titre du diplôme.
     *
     * @return le titre du diplôme.
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit le titre du diplôme.
     *
     * @param titre le titre du diplôme.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * Retourne le niveau du diplôme.
     *
     * @return le niveau du diplôme.
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     * Définit le niveau du diplôme.
     *
     * @param niveau le niveau du diplôme.
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}