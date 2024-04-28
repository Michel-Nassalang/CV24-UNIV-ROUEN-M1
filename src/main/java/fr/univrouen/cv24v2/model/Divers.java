package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class Divers {

    @XmlElement(name = "lv", namespace = "http://univ.fr/cv24")
    private List<LangueVivante> lv;

    @XmlElement(name = "autre", namespace = "http://univ.fr/cv24")
    private List<Autre> autre;

    // Getters and setters

    public List<LangueVivante> getLv() {
        return lv;
    }

    public void setLv(List<LangueVivante> lv) {
        this.lv = lv;
    }

    public List<Autre> getAutre() {
        return autre;
    }

    public void setAutre(List<Autre> autre) {
        this.autre = autre;
    }
}

