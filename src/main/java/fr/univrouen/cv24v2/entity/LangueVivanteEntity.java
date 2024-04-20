package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "langue_vivante")
public class LangueVivanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "lang", nullable = false)
    private String lang;

    @Column(name = "cert", nullable = false)
    private String cert;

    @Column(name = "nivs")
    private String nivs;

    @Column(name = "nivi")
    private int nivi;

    @ManyToOne(targetEntity = DiversEntity.class)
    @JoinColumn(name = "divers_id")
    private DiversEntity divers;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public DiversEntity getDivers() {
        return divers;
    }

    public void setDivers(DiversEntity divers) {
        this.divers = divers;
    }
}

