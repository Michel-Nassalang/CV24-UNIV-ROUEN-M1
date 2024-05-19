package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "competences")
public class CompetencesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "competences", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DiplomeEntity> diplome;

    @OneToMany(mappedBy = "competences", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CertifEntity> certif;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<DiplomeEntity> getDiplome() {
        return diplome;
    }

    public void setDiplome(List<DiplomeEntity> diplome) {
        this.diplome = diplome;
    }

    public List<CertifEntity> getCertif() {
        return certif;
    }

    public void setCertif(List<CertifEntity> certif) {
        this.certif = certif;
    }
}

