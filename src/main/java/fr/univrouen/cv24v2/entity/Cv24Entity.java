package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;

/**
 * Représente une entité pour les informations complètes d'un CV dans le système.
 * <p>
 * Cette entité est mappée à la table "cv24" dans la base de données et contient des champs pour
 * l'identifiant unique du CV, ainsi que des relations avec les entités {@link IdentiteEntity},
 * {@link ObjectifEntity}, {@link ProfEntity}, {@link CompetencesEntity}, et {@link DiversEntity}.
 * </p>
 *
 * <p>Note: Cette classe utilise JPA (Java Persistence API) pour la persistance des données.</p>
 *
 * @see IdentiteEntity
 * @see ObjectifEntity
 * @see ProfEntity
 * @see CompetencesEntity
 * @see DiversEntity
 * @see jakarta.persistence.Entity
 * @see jakarta.persistence.Table
 * @see jakarta.persistence.Id
 * @see jakarta.persistence.GeneratedValue
 * @see jakarta.persistence.GenerationType
 * @see jakarta.persistence.OneToOne
 * @see jakarta.persistence.JoinColumn
 * @see jakarta.persistence.CascadeType
 * @since 2024-05-21
 */
@Entity
@Table(name = "cv24")
public class Cv24Entity {
    /**
     * Identifiant unique du CV.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Identité de la personne associée au CV.
     * <p>
     * Cette relation est définie par la clé étrangère "identite_id".
     * La suppression en cascade est activée.
     * </p>
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "identite_id")
    private IdentiteEntity identite;
    /**
     * Objectif professionnel de la personne associée au CV.
     * <p>
     * Cette relation est définie par la clé étrangère "objectif_id".
     * La suppression en cascade est activée.
     * </p>
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "objectif_id")
    private ObjectifEntity objectif;
    /**
     * Informations professionnelles de la personne associée au CV.
     * <p>
     * Cette relation est définie par la clé étrangère "prof_id".
     * La suppression en cascade est activée.
     * </p>
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prof_id")
    private ProfEntity prof;
    /**
     * Compétences de la personne associée au CV.
     * <p>
     * Cette relation est définie par la clé étrangère "competences_id".
     * La suppression en cascade est activée.
     * </p>
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "competences_id")
    private CompetencesEntity competences;
    /**
     * Informations diverses de la personne associée au CV.
     * <p>
     * Cette relation est définie par la clé étrangère "divers_id".
     * La suppression en cascade est activée.
     * </p>
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "divers_id")
    private DiversEntity divers;

    // Getters and setters
    /**
     * Retourne l'identifiant du CV.
     *
     * @return l'identifiant du CV.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant du CV.
     *
     * @param id l'identifiant du CV.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne l'identité associée au CV.
     *
     * @return l'identité associée au CV.
     */
    public IdentiteEntity getIdentite() {
        return identite;
    }
    /**
     * Définit l'identité associée au CV.
     *
     * @param identite l'identité associée au CV.
     */
    public void setIdentite(IdentiteEntity identite) {
        this.identite = identite;
    }
    /**
     * Retourne l'objectif professionnel associé au CV.
     *
     * @return l'objectif professionnel associé au CV.
     */
    public ObjectifEntity getObjectif() {
        return objectif;
    }
    /**
     * Définit l'objectif professionnel associé au CV.
     *
     * @param objectif l'objectif professionnel associé au CV.
     */
    public void setObjectif(ObjectifEntity objectif) {
        this.objectif = objectif;
    }
    /**
     * Retourne les informations professionnelles associées au CV.
     *
     * @return les informations professionnelles associées au CV.
     */
    public ProfEntity getProf() {
        return prof;
    }
    /**
     * Définit les informations professionnelles associées au CV.
     *
     * @param prof les informations professionnelles associées au CV.
     */
    public void setProf(ProfEntity prof) {
        this.prof = prof;
    }
    /**
     * Retourne les compétences associées au CV.
     *
     * @return les compétences associées au CV.
     */
    public CompetencesEntity getCompetences() {
        return competences;
    }
    /**
     * Définit les compétences associées au CV.
     *
     * @param competences les compétences associées au CV.
     */
    public void setCompetences(CompetencesEntity competences) {
        this.competences = competences;
    }
    /**
     * Retourne les informations diverses associées au CV.
     *
     * @return les informations diverses associées au CV.
     */
    public DiversEntity getDivers() {
        return divers;
    }
    /**
     * Définit les informations diverses associées au CV.
     *
     * @param divers les informations diverses associées au CV.
     */
    public void setDivers(DiversEntity divers) {
        this.divers = divers;
    }
}


