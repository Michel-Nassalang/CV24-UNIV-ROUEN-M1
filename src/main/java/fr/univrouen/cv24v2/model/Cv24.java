package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "cv24", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)

public class Cv24 {

    @XmlElement(name = "identite", namespace = "http://univ.fr/cv24")
    private Identite identite;

    @XmlElement(name = "objectif", namespace = "http://univ.fr/cv24")
    private Objectif objectif;

    @XmlElement(name = "prof", namespace = "http://univ.fr/cv24")
    private Prof prof;

    @XmlElement(name = "competences", namespace = "http://univ.fr/cv24")
    private Competences competences;

    @XmlElement(name = "divers", namespace = "http://univ.fr/cv24")
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



