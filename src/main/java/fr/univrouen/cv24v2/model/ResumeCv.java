package fr.univrouen.cv24v2.model;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import fr.univrouen.cv24v2.entity.DiplomeEntity;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResumeCv {

    @XmlElement(name = "id", namespace = "http://univ.fr/cv24")
    private Integer id;

    @XmlElement(name = "identite", namespace = "http://univ.fr/cv24")
    private String identite;

    @XmlElement(name = "objectif", namespace = "http://univ.fr/cv24")
    private String objectif;

    @XmlElement(name = "diplome", namespace = "http://univ.fr/cv24")
    private String diplome;

    public ResumeCv(Cv24Entity entity) {

        this.id = entity.getId();
        this.identite = entity.getIdentite().getGenre() + " " + entity.getIdentite().getPrenom() + " " + entity.getIdentite().getNom();
        this.objectif = entity.getObjectif().getValue();
        this.diplome = getHighestDiploma(entity);
    }

    private String getHighestDiploma(Cv24Entity entity) {
        String highestDiploma = "";
        int highestlevel = 0;

        for (DiplomeEntity diplome : entity.getCompetences().getDiplome()) {
            int level = diplome.getNiveau();
            if (level > highestlevel) {
                highestlevel = level;
                highestDiploma = diplome.getTitre();
            }
        }

        return highestDiploma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentite() {
        return identite;
    }

    public void setIdentite(String identite) {
        this.identite = identite;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }
}
