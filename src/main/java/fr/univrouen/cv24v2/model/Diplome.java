package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement(name = "cv24:diplome", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
public class Diplome {

    @XmlElement(name = "cv24:date", required = true)
    private Date date;

    @XmlElement(name = "cv24:institut")
    private String institut;

    @XmlElement(name = "cv24:titre", required = true)
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


