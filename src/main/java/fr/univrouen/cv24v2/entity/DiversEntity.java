package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.List;
/**
 * Représente une entité pour les informations diverses associées à un utilisateur dans le système.
 * <p>
 * Cette entité est mappée à la table "divers" dans la base de données et contient des champs pour
 * l'identifiant, une liste de langues vivantes ({@link LangueVivanteEntity}) et une liste d'autres informations ({@link AutreEntity}).
 * </p>
 *
 * <p>Note: Cette classe utilise JPA (Java Persistence API) pour la persistance des données.</p>
 *
 * @see LangueVivanteEntity
 * @see AutreEntity
 * @see jakarta.persistence.Entity
 * @see jakarta.persistence.Table
 * @see jakarta.persistence.Id
 * @see jakarta.persistence.GeneratedValue
 * @see jakarta.persistence.GenerationType
 * @see jakarta.persistence.OneToMany
 * @see jakarta.persistence.CascadeType
 * @see jakarta.persistence.JoinColumn
 * @since 2024-05-21
 */
@Entity
@Table(name = "divers")
public class DiversEntity {
    /**
     * Identifiant unique des informations diverses.
     * <p>
     * Ce champ est auto-généré par la base de données.
     * </p>
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Liste des langues vivantes associées à l'utilisateur.
     * <p>
     * Cette relation est définie par le champ "divers" dans l'entité {@link LangueVivanteEntity}.
     * </p>
     */
    @OneToMany(mappedBy = "divers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LangueVivanteEntity> lv;
    /**
     * Liste d'autres informations associées à l'utilisateur.
     * <p>
     * Cette relation est définie par le champ "divers" dans l'entité {@link AutreEntity}.
     * </p>
     */
    @OneToMany(mappedBy = "divers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AutreEntity> autre;

    // Getters and setters
    /**
     * Retourne l'identifiant des informations diverses.
     *
     * @return l'identifiant des informations diverses.
     */
    public Integer getId() {
        return id;
    }
    /**
     * Définit l'identifiant des informations diverses.
     *
     * @param id l'identifiant des informations diverses.
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Retourne la liste des langues vivantes associées à l'utilisateur.
     *
     * @return la liste des langues vivantes associées à l'utilisateur.
     */
    public List<LangueVivanteEntity> getLv() {
        return lv;
    }
    /**
     * Définit la liste des langues vivantes associées à l'utilisateur.
     *
     * @param lv la liste des langues vivantes associées à l'utilisateur.
     */
    public void setLv(List<LangueVivanteEntity> lv) {
        this.lv = lv;
    }
    /**
     * Retourne la liste d'autres informations associées à l'utilisateur.
     *
     * @return la liste d'autres informations associées à l'utilisateur.
     */
    public List<AutreEntity> getAutre() {
        return autre;
    }
    /**
     * Définit la liste d'autres informations associées à l'utilisateur.
     *
     * @param autre la liste d'autres informations associées à l'utilisateur.
     */
    public void setAutre(List<AutreEntity> autre) {
        this.autre = autre;
    }
}

