package fr.univrouen.cv24v2.model;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import fr.univrouen.cv24v2.entity.DiplomeEntity;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

/**
 * Modèle pour représenter un résumé d'un CV dans le système.
 * <p>
 * Cette classe est utilisée pour représenter des données dans le format XML.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ResumeCv {
    /**
     * L'identifiant du CV.
     */
    @XmlElement(name = "id", namespace = "http://univ.fr/cv24")
    private Integer id;
    /**
     * L'identité du candidat.
     */
    @XmlElement(name = "identite", namespace = "http://univ.fr/cv24")
    private String identite;
    /**
     * L'objectif du candidat.
     */
    @XmlElement(name = "objectif", namespace = "http://univ.fr/cv24")
    private String objectif;
    /**
     * Le diplôme le plus élevé du candidat.
     */
    @XmlElement(name = "diplome", namespace = "http://univ.fr/cv24")
    private String diplome;

    /**
     * Constructeur prenant une entité Cv24Entity pour initialiser les champs du résumé du CV.
     *
     * @param entity l'entité Cv24Entity à partir de laquelle créer le résumé du CV.
     */
    public ResumeCv(Cv24Entity entity) {

        this.id = entity.getId();
        this.identite = entity.getIdentite().getGenre() + " " + entity.getIdentite().getPrenom() + " " + entity.getIdentite().getNom();
        this.objectif = entity.getObjectif().getValue();
        this.diplome = getHighestDiploma(entity);
    }
    /**
     * Obtient le diplôme le plus élevé du candidat à partir de l'entité Cv24Entity.
     *
     * @param entity l'entité Cv24Entity représentant le CV du candidat.
     * @return le titre du diplôme le plus élevé.
     */
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
