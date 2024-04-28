package fr.univrouen.cv24v2.controller;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import fr.univrouen.cv24v2.mapper.Cv24Mapper;
import fr.univrouen.cv24v2.model.Cv24;
import fr.univrouen.cv24v2.model.StatusResponse;
import fr.univrouen.cv24v2.repository.Cv24Repository;
import fr.univrouen.cv24v2.transformer.TransformerXmlToCv24;
import fr.univrouen.cv24v2.validator.ValidatorCv24;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.parsers.ParserConfigurationException;

@RestController
@RequestMapping(path="/cv24")
public class Cv24PostController {
    private final Cv24Repository cvRepository;

    public Cv24PostController(Cv24Repository cvRepository) {
        this.cvRepository = cvRepository;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public StatusResponse insertCv24(@RequestBody String flux) throws ParserConfigurationException {
        // Validation du Cv
        Boolean validation = ValidatorCv24.validateCv24(flux);
        Cv24 cv24 = TransformerXmlToCv24.convertXmlToCv24(flux);
        // Validation ok -> Persiter dans la base le cv créé
        if(validation){
            Cv24Entity cv24Entity = Cv24Mapper.convertToEntity(cv24);
            // Persistance
            Cv24Entity result = cvRepository.save(cv24Entity);
            int id = result.getId();
            return new StatusResponse(id, "INSERTED");
        }else{
            return new StatusResponse("ERROR", "INVALID");
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody StatusResponse deleteCv24(@PathVariable int id){

        // Vérification de l'existence du cv et suppression
        if (cvRepository.existsById(id)) {
            cvRepository.deleteById(id);
            return new StatusResponse(id, "DELETED");
        }else {
            return new StatusResponse(id, "ERROR");
        }
    }

}
