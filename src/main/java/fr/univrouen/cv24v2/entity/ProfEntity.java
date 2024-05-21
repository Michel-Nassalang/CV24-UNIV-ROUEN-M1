package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.List;
/**
 * Représente une entité pour les informations professionnelles associées à un utilisateur dans le système.
 * <p>
 * Cette entité est mappée à la table "prof" dans la base de données et contient un champ pour
 * l'identifiant et une liste d'entités de détail d'expérience professionnelle.
 * </p>
 *
 * <p>Note: Cette classe utilise JPA (Java Persistence API) pour la persistance des données.</p>
 *
 * @see DetailExperienceEntity
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
@Table(name = "prof")
public class ProfEntity {
    /**
     * Identifiant unique de l'entité professionnelle.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Liste des détails d'expérience professionnelle associés à cette entité professionnelle.
     * <p>
     * Cette relation est définie par le champ "prof" dans l'entité {@link DetailExperienceEntity}.
     * </p>
     */
    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetailExperienceEntity> detail;

    // Getters and setters
    /**
     * Retourne l'identifiant de l'entité professionnelle.
     *
     * @return l'identifiant de l'entité professionnelle.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant de l'entité professionnelle.
     *
     * @param id l'identifiant de l'entité professionnelle.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne la liste des détails d'expérience professionnelle.
     *
     * @return la liste des détails d'expérience professionnelle.
     */
    public List<DetailExperienceEntity> getDetail() {
        return detail;
    }
    /**
     * Définit la liste des détails d'expérience professionnelle.
     *
     * @param detail la liste des détails d'expérience professionnelle.
     */
    public void setDetail(List<DetailExperienceEntity> detail) {
        this.detail = detail;
    }
}

