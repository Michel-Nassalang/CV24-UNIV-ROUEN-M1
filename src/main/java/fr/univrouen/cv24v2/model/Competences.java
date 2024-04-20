package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "competences", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
class Competences {

    @XmlElement(name = "diplome")
    private List<Diplome> diplome;

    @XmlElement(name = "certif")
    private List<Certif> certif;

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
// Getters and setters
}

