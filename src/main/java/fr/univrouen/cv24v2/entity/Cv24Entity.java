package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "cv24")
public class Cv24Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "identite_id")
    private IdentiteEntity identite;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "objectif_id")
    private ObjectifEntity objectif;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prof_id")
    private ProfEntity prof;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "competences_id")
    private CompetencesEntity competences;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "divers_id")
    private DiversEntity divers;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IdentiteEntity getIdentite() {
        return identite;
    }

    public void setIdentite(IdentiteEntity identite) {
        this.identite = identite;
    }

    public ObjectifEntity getObjectif() {
        return objectif;
    }

    public void setObjectif(ObjectifEntity objectif) {
        this.objectif = objectif;
    }

    public ProfEntity getProf() {
        return prof;
    }

    public void setProf(ProfEntity prof) {
        this.prof = prof;
    }

    public CompetencesEntity getCompetences() {
        return competences;
    }

    public void setCompetences(CompetencesEntity competences) {
        this.competences = competences;
    }

    public DiversEntity getDivers() {
        return divers;
    }

    public void setDivers(DiversEntity divers) {
        this.divers = divers;
    }
}


