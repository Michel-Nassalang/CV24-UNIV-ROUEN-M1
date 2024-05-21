package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

/**
 * Modèle pour représenter les informations professionnelles dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Prof {

    /**
     * Liste des détails d'expérience professionnelle.
     */
    @XmlElement(name = "detail", namespace = "http://univ.fr/cv24")
    private List<DetailExperience> detail;

    // Getters and setters

    /**
     * Retourne la liste des détails d'expérience professionnelle.
     *
     * @return la liste des détails d'expérience professionnelle.
     */
    public List<DetailExperience> getDetail() {
        return detail;
    }

    /**
     * Définit la liste des détails d'expérience professionnelle.
     *
     * @param detail la liste des détails d'expérience professionnelle.
     */
    public void setDetail(List<DetailExperience> detail) {
        this.detail = detail;
    }
}