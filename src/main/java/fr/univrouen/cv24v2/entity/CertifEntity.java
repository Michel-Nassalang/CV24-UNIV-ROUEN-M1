package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "certif")
public class CertifEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "datedeb", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datedeb;

    @Column(name = "datefin")
    @Temporal(TemporalType.DATE)
    private Date datefin;

    @Column(name = "titre", nullable = false, length = 255)
    private String titre;

    @ManyToOne(targetEntity = CompetencesEntity.class)
    @JoinColumn(name = "competences_id")
    private CompetencesEntity competences;

// Getters and setters

    public CompetencesEntity getCompetences() {
        return competences;
    }

    public void setCompetences(CompetencesEntity competences) {
        this.competences = competences;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

