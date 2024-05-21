package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

/**
 * Modèle pour représenter les informations d'identité dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Identite {

    /**
     * Genre de l'identité.
     */
    @XmlElement(name = "genre", namespace = "http://univ.fr/cv24")
    private String genre;

    /**
     * Nom de l'identité.
     */
    @XmlElement(name = "nom", namespace = "http://univ.fr/cv24")
    private String nom;

    /**
     * Prénom de l'identité.
     */
    @XmlElement(name = "prenom", namespace = "http://univ.fr/cv24")
    private String prenom;

    /**
     * Téléphone de l'identité.
     */
    @XmlElement(name = "tel", namespace = "http://univ.fr/cv24")
    private String tel;

    /**
     * Adresse email de l'identité.
     */
    @XmlElement(name = "mel", namespace = "http://univ.fr/cv24")
    private String mel;

    // Getters and setters

    /**
     * Retourne le genre de l'identité.
     *
     * @return le genre de l'identité.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Définit le genre de l'identité.
     *
     * @param genre le genre de l'identité.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Retourne le nom de l'identité.
     *
     * @return le nom de l'identité.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'identité.
     *
     * @param nom le nom de l'identité.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne le prénom de l'identité.
     *
     * @return le prénom de l'identité.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit le prénom de l'identité.
     *
     * @param prenom le prénom de l'identité.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Retourne le téléphone de l'identité.
     *
     * @return le téléphone de l'identité.
     */
    public String getTel() {
        return tel;
    }

    /**
     * Définit le téléphone de l'identité.
     *
     * @param tel le téléphone de l'identité.
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Retourne l'adresse email de l'identité.
     *
     * @return l'adresse email de l'identité.
     */
    public String getMel() {
        return mel;
    }

    /**
     * Définit l'adresse email de l'identité.
     *
     * @param mel l'adresse email de l'identité.
     */
    public void setMel(String mel) {
        this.mel = mel;
    }
}