package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
/**
 * Représente une entité pour les informations d'identité d'un utilisateur dans le système.
 * <p>
 * Cette entité est mappée à la table "identite" dans la base de données et contient des champs pour
 * l'identifiant, le genre, le nom, le prénom, le numéro de téléphone et l'adresse email.
 * </p>
 *
 * <p>Note: Cette classe utilise JPA (Java Persistence API) pour la persistance des données.</p>
 *
 * @see jakarta.persistence.Entity
 * @see jakarta.persistence.Table
 * @see jakarta.persistence.Id
 * @see jakarta.persistence.GeneratedValue
 * @see jakarta.persistence.GenerationType
 * @see jakarta.persistence.Column
 * @since 2024-05-21
 */
@Entity
@Table(name = "identite")
public class IdentiteEntity {
    /**
     * Identifiant unique de l'identité.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Genre de l'utilisateur.
     */
    @Column(name = "genre")
    private String genre;
    /**
     * Nom de l'utilisateur.
     */
    @Column(name = "nom")
    private String nom;
    /**
     * Prénom de l'utilisateur.
     */
    @Column(name = "prenom")
    private String prenom;
    /**
     * Numéro de téléphone de l'utilisateur.
     */
    @Column(name = "tel")
    private String tel;
    /**
     * Adresse email de l'utilisateur.
     */
    @Column(name = "mel")
    private String mel;

    // Getters and setters
    /**
     * Retourne l'identifiant de l'identité.
     *
     * @return l'identifiant de l'identité.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant de l'identité.
     *
     * @param id l'identifiant de l'identité.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne le genre de l'utilisateur.
     *
     * @return le genre de l'utilisateur.
     */
    public String getGenre() {
        return genre;
    }
    /**
     * Définit le genre de l'utilisateur.
     *
     * @param genre le genre de l'utilisateur.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    /**
     * Retourne le nom de l'utilisateur.
     *
     * @return le nom de l'utilisateur.
     */
    public String getNom() {
        return nom;
    }
    /**
     * Définit le nom de l'utilisateur.
     *
     * @param nom le nom de l'utilisateur.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Retourne le prénom de l'utilisateur.
     *
     * @return le prénom de l'utilisateur.
     */
    public String getPrenom() {
        return prenom;
    }
    /**
     * Définit le prénom de l'utilisateur.
     *
     * @param prenom le prénom de l'utilisateur.
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    /**
     * Retourne le numéro de téléphone de l'utilisateur.
     *
     * @return le numéro de téléphone de l'utilisateur.
     */
    public String getTel() {
        return tel;
    }
    /**
     * Définit le numéro de téléphone de l'utilisateur.
     *
     * @param tel le numéro de téléphone de l'utilisateur.
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    /**
     * Retourne l'adresse email de l'utilisateur.
     *
     * @return l'adresse email de l'utilisateur.
     */
    public String getMel() {
        return mel;
    }
    /**
     * Définit l'adresse email de l'utilisateur.
     *
     * @param mel l'adresse email de l'utilisateur.
     */
    public void setMel(String mel) {
        this.mel = mel;
    }
}

