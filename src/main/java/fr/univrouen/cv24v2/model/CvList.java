package fr.univrouen.cv24v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
/**
 * Modèle pour représenter une liste de CV dans le système.
 * <p>
 * Cette classe est utilisée pour encapsuler une liste de CV sous forme de résumés.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlRootElement(name = "cv24-list", namespace = "http://univ.fr/cv24")
@XmlAccessorType(XmlAccessType.FIELD)
public class CvList {
    /**
     * La liste des résumés de CV.
     */
    @XmlElement(name = "resumeCV", namespace = "http://univ.fr/cv24")
    private List<ResumeCv> cvList;
    /**
     * Récupère la liste des résumés de CV.
     *
     * @return la liste des résumés de CV.
     */
    public List<ResumeCv> getCvList() {
        return cvList;
    }
    /**
     * Définit la liste des résumés de CV.
     *
     * @param cvList la liste des résumés de CV à définir.
     */
    public void setCvList(List<ResumeCv> cvList) {
        this.cvList = cvList;
    }
}

