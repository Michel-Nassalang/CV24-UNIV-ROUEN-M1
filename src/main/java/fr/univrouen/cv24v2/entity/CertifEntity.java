package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.Date;
/**
 * Représente une entité pour les informations relatives à une certification dans le système.
 * <p>
 * Cette entité est mappée à la table "certif" dans la base de données et contient des champs pour
 * la date de début, la date de fin, le titre de la certification et une relation avec une autre
 * entité nommée {@link CompetencesEntity}.
 * </p>
 *
 * <p>Note: Cette classe utilise JPA (Java Persistence API) pour la persistance des données.</p>
 *
 * @see CompetencesEntity
 * @see jakarta.persistence.Entity
 * @see jakarta.persistence.Table
 * @see jakarta.persistence.Id
 * @see jakarta.persistence.GeneratedValue
 * @see jakarta.persistence.GenerationType
 * @see jakarta.persistence.Column
 * @since 2024-05-21
 */
@Entity
@Table(name = "certif")
public class CertifEntity {
    /**
     * Identifiant unique de la certification.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Date de début de validité de la certification.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "datedeb", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datedeb;
    /**
     * Date de fin de validité de la certification.
     */
    @Column(name = "datefin")
    @Temporal(TemporalType.DATE)
    private Date datefin;
    /**
     * Titre de la certification.
     * <p>
     * Ce champ ne peut pas être nul et sa longueur est limitée à 255 caractères.
     * </p>
     */
    @Column(name = "titre", nullable = false, length = 255)
    private String titre;
    /**
     * Relation plusieurs-à-un avec l'entité {@link CompetencesEntity}.
     * <p>
     * Cette relation est définie par la clé étrangère "competences_id".
     * </p>
     */
    @ManyToOne(targetEntity = CompetencesEntity.class)
    @JoinColumn(name = "competences_id")
    private CompetencesEntity competences;

// Getters and setters
    /**
     * Récupère les compétences associées à cette certification.
     *
     * @return Les compétences associées à cette certification.
     */
    public CompetencesEntity getCompetences() {
        return competences;
    }
    /**
     * Définit les compétences associées à cette certification.
     *
     * @param competences Les compétences associées à cette certification.
     */
    public void setCompetences(CompetencesEntity competences) {
        this.competences = competences;
    }
    /**
     * Récupère l'ID de la certification.
     *
     * @return L'ID de la certification.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'ID de la certification.
     *
     * @param id L'ID de la certification.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Récupère la date de début de validité de la certification.
     *
     * @return La date de début de validité de la certification.
     */
    public Date getDatedeb() {
        return datedeb;
    }
    /**
     * Définit la date de début de validité de la certification.
     *
     * @param datedeb La date de début de validité de la certification.
     */
    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }
    /**
     * Récupère la date de fin de validité de la certification.
     *
     * @return La date de fin de validité de la certification.
     */
    public Date getDatefin() {
        return datefin;
    }
    /**
     * Définit la date de fin de validité de la certification.
     *
     * @param datefin La date de fin de validité de la certification.
     */
    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }
    /**
     * Récupère le titre de la certification.
     *
     * @return Le titre de la certification.
     */
    public String getTitre() {
        return titre;
    }
    /**
     * Définit le titre de la certification.
     *
     * @param titre Le titre de la certification.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }
}

