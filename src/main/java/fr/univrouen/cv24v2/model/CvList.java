package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "cv24-list", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
public class CvList {

    @XmlElement(name = "resumeCV", namespace = "http://univ.fr/cv24")
    private List<ResumeCv> cvList;

    public List<ResumeCv> getCvList() {
        return cvList;
    }

    public void setCvList(List<ResumeCv> cvList) {
        this.cvList = cvList;
    }
}

