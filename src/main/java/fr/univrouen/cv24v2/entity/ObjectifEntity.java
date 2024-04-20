package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "objectif")
public class ObjectifEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "value", length = 255)
    private String value;

    @Column(name = "statut", nullable = false)
    private String statut;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}

