package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.*;

import java.util.List;
/**
 * Modèle pour représenter les compétences dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Competences {
    /**
     * Liste des diplômes associés aux compétences.
     */
    @XmlElement(name = "diplome", namespace = "http://univ.fr/cv24")
    private List<Diplome> diplome;
    /**
     * Liste des certifications associées aux compétences.
     */
    @XmlElement(name = "certif", namespace = "http://univ.fr/cv24")
    private List<Certif> certif;

    // Getters and setters
    /**
     * Retourne la liste des diplômes associés aux compétences.
     *
     * @return la liste des diplômes associés aux compétences.
     */
    public List<Diplome> getDiplome() {
    return diplome;
}
    /**
     * Définit la liste des diplômes associés aux compétences.
     *
     * @param diplome la liste des diplômes associés aux compétences.
     */
    public void setDiplome(List<Diplome> diplome) {
        this.diplome = diplome;
    }
    /**
     * Retourne la liste des certifications associées aux compétences.
     *
     * @return la liste des certifications associées aux compétences.
     */
    public List<Certif> getCertif() {
        return certif;
    }
    /**
     * Définit la liste des certifications associées aux compétences.
     *
     * @param certif la liste des certifications associées aux compétences.
     */
    public void setCertif(List<Certif> certif) {
        this.certif = certif;
    }
}

