package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.Date;
/**
 * Représente une entité pour les détails d'une expérience professionnelle dans le système.
 * <p>
 * Cette entité est mappée à la table "detail_experience" dans la base de données et contient des champs
 * pour l'identifiant unique de l'expérience, les dates de début et de fin, le titre de l'expérience, ainsi
 * qu'une relation avec l'entité {@link ProfEntity}.
 * </p>
 *
 * <p>Note: Cette classe utilise JPA (Java Persistence API) pour la persistance des données.</p>
 *
 * @see ProfEntity
 * @see jakarta.persistence.Entity
 * @see jakarta.persistence.Table
 * @see jakarta.persistence.Id
 * @see jakarta.persistence.GeneratedValue
 * @see jakarta.persistence.GenerationType
 * @see jakarta.persistence.Column
 * @see jakarta.persistence.Temporal
 * @see jakarta.persistence.TemporalType
 * @see jakarta.persistence.ManyToOne
 * @see jakarta.persistence.JoinColumn
 * @since 2024-05-21
 */
@Entity
@Table(name = "detail_experience")
public class DetailExperienceEntity {
    /**
     * Identifiant unique de l'expérience professionnelle.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Date de début de l'expérience professionnelle.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "datedeb", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datedeb;
    /**
     * Date de fin de l'expérience professionnelle.
     */
    @Column(name = "datefin")
    @Temporal(TemporalType.DATE)
    private Date datefin;
    /**
     * Titre de l'expérience professionnelle.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "titre", nullable = false)
    private String titre;
    /**
     * Relation plusieurs-à-un avec l'entité {@link ProfEntity}.
     * <p>
     * Cette relation est définie par la clé étrangère "prof_id".
     * </p>
     */
    @ManyToOne(targetEntity = ProfEntity.class)
    @JoinColumn(name = "prof_id")
    private ProfEntity prof;

    // Getters and setters
    /**
     * Retourne l'identifiant de l'expérience professionnelle.
     *
     * @return l'identifiant de l'expérience professionnelle.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant de l'expérience professionnelle.
     *
     * @param id l'identifiant de l'expérience professionnelle.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne la date de début de l'expérience professionnelle.
     *
     * @return la date de début de l'expérience professionnelle.
     */
    public Date getDatedeb() {
        return datedeb;
    }
    /**
     * Définit la date de début de l'expérience professionnelle.
     *
     * @param datedeb la date de début de l'expérience professionnelle.
     */
    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }
    /**
     * Retourne la date de fin de l'expérience professionnelle.
     *
     * @return la date de fin de l'expérience professionnelle.
     */
    public Date getDatefin() {
        return datefin;
    }
    /**
     * Définit la date de fin de l'expérience professionnelle.
     *
     * @param datefin la date de fin de l'expérience professionnelle.
     */
    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }
    /**
     * Retourne le titre de l'expérience professionnelle.
     *
     * @return le titre de l'expérience professionnelle.
     */
    public String getTitre() {
        return titre;
    }
    /**
     * Définit le titre de l'expérience professionnelle.
     *
     * @param titre le titre de l'expérience professionnelle.
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }
    /**
     * Retourne l'entité {@link ProfEntity} associée à l'expérience professionnelle.
     *
     * @return l'entité {@link ProfEntity} associée à l'expérience professionnelle.
     */
    public ProfEntity getProf() {
        return prof;
    }
    /**
     * Définit l'entité {@link ProfEntity} associée à l'expérience professionnelle.
     *
     * @param prof l'entité {@link ProfEntity} associée à l'expérience professionnelle.
     */
    public void setProf(ProfEntity prof) {
        this.prof = prof;
    }
}

