package fr.univrouen.cv24v2.service;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import fr.univrouen.cv24v2.mapper.Cv24Mapper;
import fr.univrouen.cv24v2.model.Cv24;
import fr.univrouen.cv24v2.model.StatusResponse;
import fr.univrouen.cv24v2.repository.Cv24Repository;
import fr.univrouen.cv24v2.transformer.TransformerXmlToCv24;
import fr.univrouen.cv24v2.validator.ValidatorCv24;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.parsers.ParserConfigurationException;
import java.util.Optional;

@Service
@Transactional(
        isolation = Isolation.READ_COMMITTED,
        propagation = Propagation.REQUIRED,
        timeout = 30)
public class Cv24Service {

    @Autowired
    private Cv24Repository cvRepository;

    @Transactional
    public Object insertCv(String flux) throws ParserConfigurationException {

        // Validation du Cv24
        String validation = ValidatorCv24.validateCv24(flux);

        // Conversion du Cv24 XML en modèle JAXB
        Cv24 cv24 = TransformerXmlToCv24.convertXmlToCv24(flux);

        // Vérification de la validation et insertion de données
        if(validation.equals("valid")){
            // Conversion du modèle Cv24 JAXB en entité CV24
            Cv24Entity cv24Entity = Cv24Mapper.convertToEntity(cv24);

            // Vérification des duplicata
            Optional<Cv24Entity> existingCv = cvRepository.findByGenreAndPrenomAndNom(
                    cv24Entity.getIdentite().getGenre(),
                    cv24Entity.getIdentite().getPrenom(),
                    cv24Entity.getIdentite().getNom()
            );

            if (existingCv.isPresent()) {
                return new StatusResponse("ERROR", "DUPLICATED");
            }

            // Persistance du CV24
            Cv24Entity result = cvRepository.save(cv24Entity);
            int id = result.getId();
            return new StatusResponse(id, "INSERTED");
        } else {
            return new StatusResponse("ERROR", "INVALID" + validation);
        }
    }

    public Object deleteCv(int id){

        // Vérification de l'existence du cv et suppression
        if (cvRepository.existsById(id)) {
            cvRepository.deleteById(id);
            return new StatusResponse(id, "DELETED");
        }else {
            return new StatusResponse(id, "Error: Cv non trouvé");
        }
    }

}
