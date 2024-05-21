package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.*;

/**
 * Modèle pour représenter une langue vivante dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class LangueVivante {

    /**
     * Langue vivante.
     */
    @XmlAttribute(name = "lang", required = true)
    private String lang;

    /**
     * Certification de la langue vivante.
     */
    @XmlAttribute(name = "cert", required = true)
    private String cert;

    /**
     * Niveau de compétence orale.
     */
    @XmlAttribute(name = "nivs")
    private String nivs;

    /**
     * Niveau de compétence écrite.
     */
    @XmlAttribute(name = "nivi")
    private int nivi;

    // Getters and setters

    /**
     * Retourne la langue vivante.
     *
     * @return la langue vivante.
     */
    public String getLang() {
        return lang;
    }

    /**
     * Définit la langue vivante.
     *
     * @param lang la langue vivante.
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     * Retourne la certification de la langue vivante.
     *
     * @return la certification de la langue vivante.
     */
    public String getCert() {
        return cert;
    }

    /**
     * Définit la certification de la langue vivante.
     *
     * @param cert la certification de la langue vivante.
     */
    public void setCert(String cert) {
        this.cert = cert;
    }

    /**
     * Retourne le niveau de compétence orale.
     *
     * @return le niveau de compétence orale.
     */
    public String getNivs() {
        return nivs;
    }

    /**
     * Définit le niveau de compétence orale.
     *
     * @param nivs le niveau de compétence orale.
     */
    public void setNivs(String nivs) {
        this.nivs = nivs;
    }

    /**
     * Retourne le niveau de compétence écrite.
     *
     * @return le niveau de compétence écrite.
     */
    public int getNivi() {
        return nivi;
    }

    /**
     * Définit le niveau de compétence écrite.
     *
     * @param nivi le niveau de compétence écrite.
     */
    public void setNivi(int nivi) {
        this.nivi = nivi;
    }
}