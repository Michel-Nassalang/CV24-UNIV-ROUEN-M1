package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement(name = "cv24:certif", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
public class Certif {

    @XmlElement(name = "cv24:datedeb", required = true)
    private Date datedeb;

    @XmlElement(name = "cv24:datefin")
    private Date datefin;

    @XmlElement(name = "cv24:titre", required = true)
    private String titre;

    // Getters and setters

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public Date getDatedeb() {
        return datedeb;
    }

    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
