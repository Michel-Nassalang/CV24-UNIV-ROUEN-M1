package fr.univrouen.cv24v2.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "prof")
public class ProfEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetailExperienceEntity> detail;

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<DetailExperienceEntity> getDetail() {
        return detail;
    }

    public void setDetail(List<DetailExperienceEntity> detail) {
        this.detail = detail;
    }
}

