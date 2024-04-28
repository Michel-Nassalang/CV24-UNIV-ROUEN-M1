package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Objectif {

    @XmlValue
    private String value;

    @XmlAttribute(name = "statut", required = true)
    private String statut;

    // Getters and setters

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}


