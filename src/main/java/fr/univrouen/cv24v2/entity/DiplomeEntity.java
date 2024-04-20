package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "diplome")
public class DiplomeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "institut")
    private String institut;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "niveau", nullable = false)
    private int niveau;

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

