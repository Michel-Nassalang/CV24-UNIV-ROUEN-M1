package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

/**
 * Modèle pour représenter l'objectif dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Objectif {

    /**
     * Valeur de l'objectif.
     */
    @XmlValue
    private String value;

    /**
     * Statut de l'objectif.
     */
    @XmlAttribute(name = "statut", required = true)
    private String statut;

    // Getters and setters

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


