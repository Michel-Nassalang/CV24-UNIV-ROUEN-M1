package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
public class Diplome {

    @XmlElement(name = "date", required = true, namespace = "http://univ.fr/cv24")
    private Date date;

    @XmlElement(name = "institut", namespace = "http://univ.fr/cv24")
    private String institut;

    @XmlElement(name = "titre", required = true, namespace = "http://univ.fr/cv24")
    private String titre;

    @XmlAttribute(name = "niveau", required = true)
    private int niveau;

    // Getters and setters

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInstitut() {
        return institut;
    }

    public void setInstitut(String institut) {
        this.institut = institut;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}


