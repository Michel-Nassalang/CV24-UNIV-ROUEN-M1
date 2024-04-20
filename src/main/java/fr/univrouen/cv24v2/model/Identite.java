package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "identite", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
class Identite {


    @XmlElement(name = "genre")
    private String genre;

    @XmlElement(name = "nom")
    private String nom;

    @XmlElement(name = "prenom")
    private String prenom;

    @XmlElement(name = "tel")
    private String tel;

    @XmlElement(name = "mel")
    private String mel;

    // Getters and setters

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMel() {
        return mel;
    }

    public void setMel(String mel) {
        this.mel = mel;
    }
}

