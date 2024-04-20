package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement(name = "detail", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
class DetailExperience {

    @XmlElement(name = "datedeb", required = true)
    private Date datedeb;

    @XmlElement(name = "datefin")
    private Date datefin;

    @XmlElement(name = "titre", required = true)
    private String titre;

    // Getters and setters

    public Date getDatedeb() {
        return datedeb;
    }

    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}

