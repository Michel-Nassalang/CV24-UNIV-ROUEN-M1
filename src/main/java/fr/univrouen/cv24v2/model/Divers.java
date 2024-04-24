package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "cv24:divers", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
public class Divers {

    @XmlElement(name = "cv24:lv")
    private List<LangueVivante> lv;

    @XmlElement(name = "cv24:autre")
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

