package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.List;

/**
 * Représente une entité pour les compétences dans le système.
 * <p>
 * Cette entité est mappée à la table "competences" dans la base de données et contient des champs
 * pour l'identifiant ainsi que des relations avec les entités {@link DiplomeEntity} et {@link CertifEntity}.
 * </p>
 *
 * <p>Note: Cette classe utilise JPA (Java Persistence API) pour la persistance des données.</p>
 *
 * @see DiplomeEntity
 * @see CertifEntity
 * @see jakarta.persistence.Entity
 * @see jakarta.persistence.Table
 * @see jakarta.persistence.Id
 * @see jakarta.persistence.GeneratedValue
 * @see jakarta.persistence.GenerationType
 * @see jakarta.persistence.OneToMany
 * @see jakarta.persistence.CascadeType
 * @since 2024-05-21
 */
@Entity
@Table(name = "competences")
public class CompetencesEntity {
    /**
     * Identifiant unique de la compétence.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Liste des diplômes associés à cette compétence.
     * <p>
     * Cette relation est définie par le champ "competences" dans l'entité {@link DiplomeEntity}.
     * La suppression en cascade et la suppression des orphelins sont activées.
     * </p>
     */
    @OneToMany(mappedBy = "competences", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiplomeEntity> diplome;
    /**
     * Liste des certifications associées à cette compétence.
     * <p>
     * Cette relation est définie par le champ "competences" dans l'entité {@link CertifEntity}.
     * La suppression en cascade et la suppression des orphelins sont activées.
     * </p>
     */
    @OneToMany(mappedBy = "competences", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CertifEntity> certif;

    // Getters and setters
    /**
     * Retourne l'identifiant de la compétence.
     *
     * @return l'identifiant de la compétence.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant de la compétence.
     *
     * @param id l'identifiant de la compétence.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne la liste des diplômes associés à cette compétence.
     *
     * @return la liste des diplômes associés à cette compétence.
     */
    public List<DiplomeEntity> getDiplome() {
        return diplome;
    }
    /**
     * Définit la liste des diplômes associés à cette compétence.
     *
     * @param diplome la liste des diplômes à associer à cette compétence.
     */
    public void setDiplome(List<DiplomeEntity> diplome) {
        this.diplome = diplome;
    }
    /**
     * Retourne la liste des certifications associées à cette compétence.
     *
     * @return la liste des certifications associées à cette compétence.
     */
    public List<CertifEntity> getCertif() {
        return certif;
    }
    /**
     * Définit la liste des certifications associées à cette compétence.
     *
     * @param certif la liste des certifications à associer à cette compétence.
     */
    public void setCertif(List<CertifEntity> certif) {
        this.certif = certif;
    }
}

