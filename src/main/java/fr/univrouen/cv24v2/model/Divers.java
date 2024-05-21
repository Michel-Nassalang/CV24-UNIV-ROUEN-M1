package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;
/**
 * Modèle pour représenter les informations diverses dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Divers {

    /**
     * Liste des langues vivantes.
     */
    @XmlElement(name = "lv", namespace = "http://univ.fr/cv24")
    private List<LangueVivante> lv;

    /**
     * Liste des autres informations.
     */
    @XmlElement(name = "autre", namespace = "http://univ.fr/cv24")
    private List<Autre> autre;

    // Getters and setters

    /**
     * Retourne la liste des langues vivantes.
     *
     * @return la liste des langues vivantes.
     */
    public List<LangueVivante> getLv() {
        return lv;
    }

    /**
     * Définit la liste des langues vivantes.
     *
     * @param lv la liste des langues vivantes.
     */
    public void setLv(List<LangueVivante> lv) {
        this.lv = lv;
    }

    /**
     * Retourne la liste des autres informations.
     *
     * @return la liste des autres informations.
     */
    public List<Autre> getAutre() {
        return autre;
    }

    /**
     * Définit la liste des autres informations.
     *
     * @param autre la liste des autres informations.
     */
    public void setAutre(List<Autre> autre) {
        this.autre = autre;
    }
}