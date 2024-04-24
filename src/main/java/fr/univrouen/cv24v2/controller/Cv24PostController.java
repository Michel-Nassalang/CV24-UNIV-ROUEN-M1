package fr.univrouen.cv24v2.controller;

import fr.univrouen.cv24v2.model.Cv24;
import fr.univrouen.cv24v2.transformer.TransformerXmlToCv24;
import fr.univrouen.cv24v2.validator.ValidatorCv24;
import org.springframework.web.bind.annotation.*;

import javax.xml.parsers.ParserConfigurationException;

@RestController
@RequestMapping(path="/cv24")
public class Cv24PostController {

    @RequestMapping(value = "/insert", method = RequestMethod.POST,
            consumes = "application/xml")
    public String insertCv24(@RequestBody String flux) throws ParserConfigurationException {
        Boolean validation = ValidatorCv24.validateCv24(flux);
        Cv24 cv24 = TransformerXmlToCv24.convertXmlToCv24(flux);
        if(cv24.getIdentite() != null){
            System.out.println(cv24.getIdentite().getNom());
        }if(cv24.getCompetences() !=null){
            System.out.println(cv24.getCompetences().toString());
        }
        System.out.println(validation);
        return ("<result><response> CV reçu : </response>"
                + flux + "</result>");
    }

}
