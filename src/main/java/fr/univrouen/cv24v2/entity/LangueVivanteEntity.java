package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
/**
 * Représente une entité pour les informations de langue vivante associée à un utilisateur dans le système.
 * <p>
 * Cette entité est mappée à la table "langue_vivante" dans la base de données et contient des champs pour
 * l'identifiant, la langue, la certification, le niveau de compréhension et le niveau d'expression.
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
 * @since 2024-05-21
 */
@Entity
@Table(name = "langue_vivante")
public class LangueVivanteEntity {
    /**
     * Identifiant unique de la langue vivante.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Langue parlée par l'utilisateur.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "lang", nullable = false)
    private String lang;
    /**
     * Certification obtenue pour la langue.
     * <p>
     * Ce champ ne peut pas être nul.
     * </p>
     */
    @Column(name = "cert", nullable = false)
    private String cert;
    /**
     * Niveau de compréhension écrite de la langue.
     */
    @Column(name = "nivs")
    private String nivs;
    /**
     * Niveau d'expression orale de la langue.
     */
    @Column(name = "nivi")
    private int nivi;
    /**
     * Relation plusieurs-à-un avec l'entité {@link DiversEntity}.
     * <p>
     * Cette relation est définie par la clé étrangère "divers_id".
     * </p>
     */
    @ManyToOne(targetEntity = DiversEntity.class)
    @JoinColumn(name = "divers_id")
    private DiversEntity divers;

    // Getters and setters
    /**
     * Retourne l'identifiant de la langue vivante.
     *
     * @return l'identifiant de la langue vivante.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant de la langue vivante.
     *
     * @param id l'identifiant de la langue vivante.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne la langue parlée par l'utilisateur.
     *
     * @return la langue parlée par l'utilisateur.
     */
    public String getLang() {
        return lang;
    }
    /**
     * Définit la langue parlée par l'utilisateur.
     *
     * @param lang la langue parlée par l'utilisateur.
     */
    public void setLang(String lang) {
        this.lang = lang;
    }
    /**
     * Retourne la certification obtenue pour la langue.
     *
     * @return la certification obtenue pour la langue.
     */
    public String getCert() {
        return cert;
    }
    /**
     * Définit la certification obtenue pour la langue.
     *
     * @param cert la certification obtenue pour la langue.
     */
    public void setCert(String cert) {
        this.cert = cert;
    }
    /**
     * Retourne le niveau de compréhension écrite de la langue.
     *
     * @return le niveau de compréhension écrite de la langue.
     */
    public String getNivs() {
        return nivs;
    }
    /**
     * Définit le niveau de compréhension écrite de la langue.
     *
     * @param nivs le niveau de compréhension écrite de la langue.
     */
    public void setNivs(String nivs) {
        this.nivs = nivs;
    }
    /**
     * Retourne le niveau d'expression orale de la langue.
     *
     * @return le niveau d'expression orale de la langue.
     */
    public int getNivi() {
        return nivi;
    }
    /**
     * Définit le niveau d'expression orale de la langue.
     *
     * @param nivi le niveau d'expression orale de la langue.
     */
    public void setNivi(int nivi) {
        this.nivi = nivi;
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

