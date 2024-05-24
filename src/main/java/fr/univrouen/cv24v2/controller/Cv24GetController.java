package fr.univrouen.cv24v2.controller;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import fr.univrouen.cv24v2.exception.InvalidSearchCriteriaException;
import fr.univrouen.cv24v2.model.CvList;
import fr.univrouen.cv24v2.model.ResumeCv;
import fr.univrouen.cv24v2.model.StatusResponse;
import fr.univrouen.cv24v2.repository.Cv24Repository;
import fr.univrouen.cv24v2.transformer.TransformerListCVToXML;
import fr.univrouen.cv24v2.transformer.TransformerXslt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.TransformerException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Contrôleur REST pour gérer les requêtes relatives aux CV.
 * <p>
 * Ce contrôleur fournit des endpoints pour obtenir des résumés de CV en format XML ou HTML.
 * </p>
 */
@RestController
@RequestMapping(path="/cv24")
public class Cv24GetController {

    @Autowired
    private Cv24Repository cv24Repository;

    /**
     * Endpoint pour obtenir un résumé des CV au format XML.
     * <p>
     * Ce endpoint récupère tous les CV, les transforme en résumés, et renvoie la liste en format XML.
     * </p>
     *
     * @return Un String contenant les résumés des CV en format XML.
     */
    @GetMapping(value = "/resume/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody String resumexml() {
        Iterable<Cv24Entity> cv24Entities = cv24Repository.findAll();
        List<ResumeCv> resumexmls = StreamSupport.stream(cv24Entities.spliterator(), false)
                .map(ResumeCv::new)
                .collect(Collectors.toList());
        CvList listxml = new CvList();
        listxml.setCvList(resumexmls);
        return TransformerListCVToXML.convertToXml(listxml);
    }

    /**
     * Endpoint pour obtenir un résumé des CV au format HTML.
     * <p>
     * Ce endpoint récupère tous les CV, les transforme en résumés, et renvoie la liste en format HTML.
     * </p>
     * @return Un objet contenant les résumés des CV en format HTML.
     * @throws TransformerException Si une erreur survient lors de la transformation en HTML.
     */
    @GetMapping(value="/resume", produces = MediaType.TEXT_HTML_VALUE)
    public @ResponseBody Object resumehtml() throws TransformerException {
        Iterable<Cv24Entity> cv24Entities = cv24Repository.findAll();
        List<ResumeCv> resumexmls = StreamSupport.stream(cv24Entities.spliterator(), false)
                .map(ResumeCv::new)
                .collect(Collectors.toList());
        CvList listxml = new CvList();
        listxml.setCvList(resumexmls);
        return TransformerXslt.listCv24toHTML(listxml);

    }


    /**
     * Endpoint pour rechercher des CV selon un critère d'objectif.
     * <p>
     * Cette méthode permet de rechercher des CV dont l'objectif contient le mot-clé spécifié dans la requête.
     * Les résultats sont renvoyés sous forme d'un flux XML.
     * </p>
     *
     * @param objectif Le mot-clé à rechercher dans les objectifs des CV.
     * @return Un objet contenant la liste des résumés de CV correspondants au format XML.
     *         Si aucun CV ne correspond au critère de recherche, un objet StatusResponse avec le statut "NONE" est renvoyé.
     *         Si le critère de recherche est invalide (chaîne vide ou null), une exception InvalidSearchCriteriaException est levée.
     */
    @GetMapping(value ="/search", produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Object searchCVs(@RequestParam String objectif) {

        if ((objectif == null || objectif.isEmpty())) {
            return new InvalidSearchCriteriaException("Au moins un critère de recherche (date ou objectif) doit être fourni.");
        }

        Iterable<Cv24Entity> cv24Entities = cv24Repository.findByCriteria(objectif);
        List<ResumeCv> resumexmls = StreamSupport.stream(cv24Entities.spliterator(), false)
                .map(ResumeCv::new)
                .collect(Collectors.toList());
        CvList listxml = new CvList();
        listxml.setCvList(resumexmls);

        if (resumexmls.isEmpty()) {
            return new StatusResponse("NONE", "Liste vide ...");
        } else {
            return TransformerListCVToXML.convertToXml(listxml);
        }
    }

}
