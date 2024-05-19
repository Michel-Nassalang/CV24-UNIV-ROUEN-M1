package fr.univrouen.cv24v2.controller;

import fr.univrouen.cv24v2.service.Cv24Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.parsers.ParserConfigurationException;

@RestController
@RequestMapping(path="/cv24")
public class Cv24PostController {

    @Autowired
    private Cv24Service cv24Service;



    @RequestMapping(value = "/insert", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Object insertCv24(@RequestBody String flux) throws ParserConfigurationException {
        // Appel du service chargé de l'insertion du CV24
        return this.cv24Service.insertCv(flux);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Object deleteCv24(@PathVariable int id){

        // Vérification de l'existence du cv et suppression
        return this.cv24Service.deleteCv(id);
    }

}
