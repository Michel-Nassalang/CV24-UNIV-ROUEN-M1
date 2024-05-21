package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
/**
 * Représente une entité pour les informations additionnelles associées à un utilisateur dans le système.
 * <p>
 * Cette entité est mappée à la table "autre" dans la base de données et contient des champs pour le titre,
 * un commentaire et une relation avec une autre entité nommée {@link DiversEntity}.
 * </p>
 *
 * <p>Note: Cette classe utilise JPA (Java Persistence API) pour la persistance des données.</p>
 *
 * @see DiversEntity
 * @see jakarta.persistence.Entity
 * @see jakarta.persistence.Table
 * @see jakarta.persistence.Id
 * @see jakarta.persistence.GeneratedValue
 * @see jakarta.persistence.GenerationType
 * @see jakarta.persistence.Column
 * @see jakarta.persistence.ManyToOne
 * @see jakarta.persistence.JoinColumn
 * @see jakarta.persistence.FetchType
 * @see jakarta.persistence.CascadeType
 * @since 2024-05-21
 */
@Entity
@Table(name = "autre")
public class AutreEntity {
    /**
     * Identifiant unique de l'entité.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Titre de l'entité.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "titre", nullable = false)
    private String titre;
    /**
     * Commentaire associé à l'entité.
     */
    @Column(name = "comment")
    private String comment;
    /**
     * Relation plusieurs-à-un avec l'entité {@link DiversEntity}.
     * <p>
     * Cette relation est définie par la clé étrangère "divers_id".
     * </p>
     */
    @ManyToOne
    @JoinColumn(name = "divers_id")
    private DiversEntity divers;


    // Getters and setters
    /**
     * Retourne l'identifiant de l'entité.
     *
     * @return l'identifiant de l'entité.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant de l'entité.
     *
     * @param id l'identifiant de l'entité.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne le titre de l'entité.
     *
     * @return le titre de l'entité.
     */
    public String getTitre() {
        return titre;
    }
    /**
     * Définit le titre de l'entité.
     *
     * @param titre le titre de l'entité.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }
    /**
     * Retourne le commentaire de l'entité.
     *
     * @return le commentaire de l'entité.
     */
    public String getComment() {
        return comment;
    }
    /**
     * Définit le commentaire de l'entité.
     *
     * @param comment le commentaire de l'entité.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    /**
     * Retourne l'entité {@link DiversEntity} associée.
     *
     * @return l'entité {@link DiversEntity} associée.
     */
    public DiversEntity getDivers() {
        return divers;
    }
    /**
     * Définit l'entité {@link DiversEntity} associée.
     *
     * @param divers l'entité {@link DiversEntity} à associer.
     */
    public void setDivers(DiversEntity divers) {
        this.divers = divers;
    }
}

