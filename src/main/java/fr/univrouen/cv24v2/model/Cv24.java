package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;
/**
 * Modèle pour représenter un CV dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlRootElement(name = "cv24", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cv24 {
    /**
     * Identité associée au CV.
     */
    @XmlElement(name = "identite", namespace = "http://univ.fr/cv24")
    private Identite identite;
    /**
     * Objectif associé au CV.
     */
    @XmlElement(name = "objectif", namespace = "http://univ.fr/cv24")
    private Objectif objectif;
    /**
     * Expériences professionnelles associées au CV.
     */
    @XmlElement(name = "prof", namespace = "http://univ.fr/cv24")
    private Prof prof;
    /**
     * Compétences associées au CV.
     */
    @XmlElement(name = "competences", namespace = "http://univ.fr/cv24")
    private Competences competences;
    /**
     * Diverses informations associées au CV.
     */
    @XmlElement(name = "divers", namespace = "http://univ.fr/cv24")
    private Divers divers;

    // Getters and setters
    /**
     * Retourne l'identité associée au CV.
     *
     * @return l'identité associée au CV.
     */
    public Identite getIdentite() {
        return identite;
    }
    /**
     * Définit l'identité associée au CV.
     *
     * @param identite l'identité associée au CV.
     */
    public void setIdentite(Identite identite) {
        this.identite = identite;
    }
    /**
     * Retourne l'objectif associé au CV.
     *
     * @return l'objectif associé au CV.
     */
    public Objectif getObjectif() {
        return objectif;
    }
    /**
     * Définit l'objectif associé au CV.
     *
     * @param objectif l'objectif associé au CV.
     */
    public void setObjectif(Objectif objectif) {
        this.objectif = objectif;
    }
    /**
     * Retourne les experiences professionnelles associées au CV.
     *
     * @return lles experiences professionnelles associées au CV.
     */
    public Prof getProf() {
        return prof;
    }
    /**
     * Définit les experiences professionnelles associées au CV.
     *
     * @param prof lles experiences professionnelles associées au CV.
     */
    public void setProf(Prof prof) {
        this.prof = prof;
    }
    /**
     * Retourne les compétences associées au CV.
     *
     * @return les compétences associées au CV.
     */
    public Competences getCompetences() {
        return competences;
    }
    /**
     * Définit les compétences associées au CV.
     *
     * @param competences les compétences associées au CV.
     */
    public void setCompetences(Competences competences) {
        this.competences = competences;
    }
    /**
     * Retourne les informations diverses associées au CV.
     *
     * @return les informations diverses associées au CV.
     */
    public Divers getDivers() {
        return divers;
    }
    /**
     * Définit les informations diverses associées au CV.
     *
     * @param divers les informations diverses associées au CV.
     */
    public void setDivers(Divers divers) {
        this.divers = divers;
    }

}



