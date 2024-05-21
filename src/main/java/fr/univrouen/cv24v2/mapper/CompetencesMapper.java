package fr.univrouen.cv24v2.mapper;

import fr.univrouen.cv24v2.entity.CertifEntity;
import fr.univrouen.cv24v2.entity.CompetencesEntity;
import fr.univrouen.cv24v2.entity.DiplomeEntity;
import fr.univrouen.cv24v2.model.Certif;
import fr.univrouen.cv24v2.model.Competences;
import fr.univrouen.cv24v2.model.Diplome;

import java.util.List;
import java.util.stream.Collectors;
/**
 * Mapper utilisé pour convertir des objets entre les entités CompetencesEntity et les modèles Competences.
 * <p>
 * Cette classe fournit des méthodes statiques pour convertir un objet Competences en CompetencesEntity et vice versa.
 * </p>
 *
 * @since 2024-05-21
 */
public class CompetencesMapper {
    /**
     * Convertit un objet Competences en CompetencesEntity.
     *
     * @param source l'objet Competences source à convertir.
     * @return l'objet CompetencesEntity converti.
     */
    public static CompetencesEntity convertToEntity(Competences source) {
        CompetencesEntity target = new CompetencesEntity();

        // Convertir les diplômes
        List<Diplome> diplomeList = source.getDiplome();
        if (diplomeList != null) {
            List<DiplomeEntity> diplomeEntityList = diplomeList.stream()
                    .map(diplome -> {
                        DiplomeEntity diplomeEntity = DiplomeMapper.convertToEntity(diplome);
                        diplomeEntity.setCompetences(target); // Associer les compétences au diplôme
                        return diplomeEntity;
                    })
                    .collect(Collectors.toList());
            target.setDiplome(diplomeEntityList);
        }

        // Convertir les certifications
        List<Certif> certifList = source.getCertif();
        if (certifList != null) {
            List<CertifEntity> certifEntityList = certifList.stream()
                    .map(certif -> {
                        CertifEntity certifEntity = CertifMapper.convertToEntity(certif);
                        certifEntity.setCompetences(target); // Associer les compétences à la certification
                        return certifEntity;
                    })
                    .collect(Collectors.toList());
            target.setCertif(certifEntityList);
        }
        return target;
    }
    /**
     * Convertit un objet CompetencesEntity en Competences.
     *
     * @param source l'objet CompetencesEntity source à convertir.
     * @return l'objet Competences converti.
     */
    public static Competences convertToXml(CompetencesEntity source) {
        Competences target = new Competences();

        // Convertir les diplômes
        List<DiplomeEntity> diplomeEntityList = source.getDiplome();
        if (diplomeEntityList != null) {
            List<Diplome> diplomeList = diplomeEntityList.stream()
                    .map(DiplomeMapper::convertToXml)
                    .collect(Collectors.toList());
            target.setDiplome(diplomeList);
        }

        // Convertir les certifications
        List<CertifEntity> certifEntityList = source.getCertif();
        if (certifEntityList != null) {
            List<Certif> certifList = certifEntityList.stream()
                    .map(CertifMapper::convertToXml)
                    .collect(Collectors.toList());
            target.setCertif(certifList);
        }
        return target;
    }

}
