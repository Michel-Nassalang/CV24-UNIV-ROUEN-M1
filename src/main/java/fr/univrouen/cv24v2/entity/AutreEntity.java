package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "autre")
public class AutreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titre", nullable = false)
    private String titre;

    @Column(name = "comment")
    private String comment;
//
    @ManyToOne
    @JoinColumn(name = "divers_id")
    private DiversEntity divers;


    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public DiversEntity getDivers() {
        return divers;
    }

    public void setDivers(DiversEntity divers) {
        this.divers = divers;
    }
}

