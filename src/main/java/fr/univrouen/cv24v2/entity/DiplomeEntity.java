package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.Date;
/**
 * Représente une entité pour les informations d'un diplôme dans le système.
 * <p>
 * Cette entité est mappée à la table "diplome" dans la base de données et contient des champs pour
 * l'identifiant, la date, l'institut, le titre et le niveau du diplôme, ainsi qu'une relation
 * avec l'entité {@link CompetencesEntity}.
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
 * @see jakarta.persistence.ManyToOne
 * @see jakarta.persistence.JoinColumn
 * @since 2024-05-21
 */
@Entity
@Table(name = "diplome")
public class DiplomeEntity {
    /**
     * Identifiant unique du diplôme.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Date d'obtention du diplôme.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "date", nullable = false)
    private Date date;
    /**
     * Institut d'obtention du diplôme.
     */
    @Column(name = "institut")
    private String institut;
    /**
     * Titre du diplôme.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "titre", nullable = false)
    private String titre;
    /**
     * Niveau du diplôme.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "niveau", nullable = false)
    private int niveau;
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
     * Retourne l'entité {@link CompetencesEntity} associée au diplôme.
     *
     * @return l'entité {@link CompetencesEntity} associée au diplôme.
     */
    public CompetencesEntity getCompetences() {
        return competences;
    }
    /**
     * Définit l'entité {@link CompetencesEntity} associée au diplôme.
     *
     * @param competences l'entité {@link CompetencesEntity} associée au diplôme.
     */
    public void setCompetences(CompetencesEntity competences) {
        this.competences = competences;
    }
    /**
     * Retourne l'identifiant du diplôme.
     *
     * @return l'identifiant du diplôme.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant du diplôme.
     *
     * @param id l'identifiant du diplôme.
     */
    public void setId(Integer id) {
        this.id = id;
    }
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
     * Retourne l'institut d'obtention du diplôme.
     *
     * @return l'institut d'obtention du diplôme.
     */
    public String getInstitut() {
        return institut;
    }
    /**
     * Définit l'institut d'obtention du diplôme.
     *
     * @param institut l'institut d'obtention du diplôme.
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

