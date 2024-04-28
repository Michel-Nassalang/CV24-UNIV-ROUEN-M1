package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Competences {

    @XmlElement(name = "diplome", namespace = "http://univ.fr/cv24")
    private List<Diplome> diplome;

    @XmlElement(name = "certif", namespace = "http://univ.fr/cv24")
    private List<Certif> certif;

// Getters and setters
public List<Diplome> getDiplome() {
    return diplome;
}

    public void setDiplome(List<Diplome> diplome) {
        this.diplome = diplome;
    }

    public List<Certif> getCertif() {
        return certif;
    }

    public void setCertif(List<Certif> certif) {
        this.certif = certif;
    }
}

