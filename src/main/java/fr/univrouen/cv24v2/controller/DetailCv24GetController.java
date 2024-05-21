package fr.univrouen.cv24v2.controller;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import fr.univrouen.cv24v2.mapper.Cv24Mapper;
import fr.univrouen.cv24v2.model.*;
import fr.univrouen.cv24v2.model.StatusResponse;
import fr.univrouen.cv24v2.repository.Cv24Repository;
import fr.univrouen.cv24v2.transformer.TransformerXslt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.TransformerException;

/**
 * Contrôleur REST pour gérer les requêtes de détails de CV.
 * <p>
 * Ce contrôleur fournit des endpoints pour obtenir les détails d'un CV en XML ou en HTML.
 * </p>
 */
@RestController
@RequestMapping(path="/cv24")
public class DetailCv24GetController {

    @Autowired
    private Cv24Repository cv24Repository;

    /**
     * Endpoint pour obtenir les détails d'un CV en format XML.
     * <p>
     * Ce endpoint retourne les détails d'un CV en format XML correspondant à l'ID fourni.
     * </p>
     *
     * @param id L'ID du CV dont les détails sont à récupérer.
     * @return Les détails du CV en format XML ou un statut d'erreur si le CV n'est pas trouvé.
     */
    @RequestMapping(value="/xml", produces= MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Object detailxml(@RequestParam int id) {
            Cv24Entity cv24Entity = cv24Repository.findById(id);
        if (cv24Entity!=null){
            return Cv24Mapper.convertToXml(cv24Entity);
        }else return new StatusResponse(id, "ERROR");
    }

    /**
     * Endpoint pour obtenir les détails d'un CV en format HTML.
     * <p>
     * Ce endpoint retourne les détails d'un CV en format HTML correspondant à l'ID fourni.
     * </p>
     *
     * @param id L'ID du CV dont les détails sont à récupérer.
     * @return Les détails du CV en format HTML ou un statut d'erreur si le CV n'est pas trouvé.
     * @throws TransformerException Si une erreur se produit lors de la transformation en HTML.
     */
    @RequestMapping(value="/html", produces= MediaType.TEXT_HTML_VALUE)
    public @ResponseBody Object detailhtml(@RequestParam int id) throws TransformerException {
        Cv24Entity cv24Entity = cv24Repository.findById(id);
        if (cv24Entity!=null){
            Cv24 cv = Cv24Mapper.convertToXml(cv24Entity);
            return TransformerXslt.Cv24toHTML(cv);
        }else return new StatusResponse(id, "ERROR");
    }

}
