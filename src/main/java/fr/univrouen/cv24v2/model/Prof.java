package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "prof", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
class Prof {

    @XmlElement(name = "detail")
    private List<DetailExperience> detail;

    // Getters and setters

    public List<DetailExperience> getDetail() {
        return detail;
    }

    public void setDetail(List<DetailExperience> detail) {
        this.detail = detail;
    }
}

