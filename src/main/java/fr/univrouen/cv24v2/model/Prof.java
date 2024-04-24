package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "cv24:prof", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
public class Prof {

    @XmlElement(name = "cv24:detail")
    private List<DetailExperience> detail;

    // Getters and setters

    public List<DetailExperience> getDetail() {
        return detail;
    }

    public void setDetail(List<DetailExperience> detail) {
        this.detail = detail;
    }
}

