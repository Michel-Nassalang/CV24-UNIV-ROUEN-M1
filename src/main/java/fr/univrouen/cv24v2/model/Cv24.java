package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "cv24", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)

public class Cv24 {

    @XmlElement(name = "cv24:identite")
    private Identite identite;

    @XmlElement(name = "cv24:objectif")
    private Objectif objectif;

    @XmlElement(name = "cv24:prof")
    private Prof prof;

    @XmlElement(name = "cv24:competences")
    private Competences competences;

    @XmlElement(name = "cv24:divers")
    private Divers divers;

    // Getters and setters

    public Identite getIdentite() {
        return identite;
    }

    public void setIdentite(Identite identite) {
        this.identite = identite;
    }

    public Objectif getObjectif() {
        return objectif;
    }

    public void setObjectif(Objectif objectif) {
        this.objectif = objectif;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public Competences getCompetences() {
        return competences;
    }

    public void setCompetences(Competences competences) {
        this.competences = competences;
    }

    public Divers getDivers() {
        return divers;
    }

    public void setDivers(Divers divers) {
        this.divers = divers;
    }
}



