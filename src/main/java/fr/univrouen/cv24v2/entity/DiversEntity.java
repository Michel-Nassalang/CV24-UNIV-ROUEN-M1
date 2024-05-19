package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "divers")
public class DiversEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "divers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LangueVivanteEntity> lv;

    @OneToMany(mappedBy = "divers", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AutreEntity> autre;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<LangueVivanteEntity> getLv() {
        return lv;
    }

    public void setLv(List<LangueVivanteEntity> lv) {
        this.lv = lv;
    }

    public List<AutreEntity> getAutre() {
        return autre;
    }

    public void setAutre(List<AutreEntity> autre) {
        this.autre = autre;
    }
}

