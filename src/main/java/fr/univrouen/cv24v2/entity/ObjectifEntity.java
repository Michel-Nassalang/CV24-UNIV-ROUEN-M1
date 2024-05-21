package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
/**
 * Représente une entité pour l'objectif professionnel associé à un utilisateur dans le système.
 * <p>
 * Cette entité est mappée à la table "objectif" dans la base de données et contient des champs pour
 * l'identifiant, la valeur de l'objectif, et son statut.
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
@Table(name = "objectif")
public class ObjectifEntity {
    /**
     * Identifiant unique de l'objectif.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Valeur de l'objectif professionnel.
     * <p>
     * Ce champ peut contenir jusqu'à 255 caractères.
     * </p>
     */
    @Column(name = "value", length = 255)
    private String value;
    /**
     * Statut de l'objectif.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "statut", nullable = false)
    private String statut;

    // Getters and setters
    /**
     * Retourne l'identifiant de l'objectif.
     *
     * @return l'identifiant de l'objectif.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant de l'objectif.
     *
     * @param id l'identifiant de l'objectif.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne la valeur de l'objectif.
     *
     * @return la valeur de l'objectif.
     */
    public String getValue() {
        return value;
    }
    /**
     * Définit la valeur de l'objectif.
     *
     * @param value la valeur de l'objectif.
     */
    public void setValue(String value) {
        this.value = value;
    }
    /**
     * Retourne le statut de l'objectif.
     *
     * @return le statut de l'objectif.
     */
    public String getStatut() {
        return statut;
    }
    /**
     * Définit le statut de l'objectif.
     *
     * @param statut le statut de l'objectif.
     */
    public void setStatut(String statut) {
        this.statut = statut;
    }
}

