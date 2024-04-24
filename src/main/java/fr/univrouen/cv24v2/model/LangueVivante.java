package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "cv24:lv", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
public class LangueVivante {

    @XmlAttribute(name = "lang", required = true)
    private String lang;

    @XmlAttribute(name = "cert", required = true)
    private String cert;

    @XmlAttribute(name = "nivs")
    private String nivs;

    @XmlAttribute(name = "nivi")
    private int nivi;

    // Getters and setters

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public String getNivs() {
        return nivs;
    }

    public void setNivs(String nivs) {
        this.nivs = nivs;
    }

    public int getNivi() {
        return nivi;
    }

    public void setNivi(int nivi) {
        this.nivi = nivi;
    }
}


