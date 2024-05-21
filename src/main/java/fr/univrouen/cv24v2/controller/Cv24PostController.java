package fr.univrouen.cv24v2.controller;

import fr.univrouen.cv24v2.service.Cv24Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Contrôleur REST pour gérer les requêtes POST et DELETE relatives aux CV.
 * <p>
 * Ce contrôleur fournit des endpoints pour insérer et supprimer des CV.
 * </p>
 */
@RestController
@RequestMapping(path="/cv24")
public class Cv24PostController {

    @Autowired
    private Cv24Service cv24Service;

    /**
     * Endpoint pour insérer un nouveau CV.
     * <p>
     * Ce endpoint reçoit un flux XML représentant un CV et l'insère dans la base de données.
     * </p>
     *
     * @param flux Le flux XML représentant le CV à insérer.
     * @return Un objet représentant le résultat de l'insertion, incluant le statut et l'ID du CV inséré si réussi.
     * @throws ParserConfigurationException Si une erreur de configuration du parseur se produit.
     */
    @RequestMapping(value = "/insert", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public Object insertCv24(@RequestBody String flux) throws ParserConfigurationException {
        // Appel du service chargé de l'insertion du CV24
        return this.cv24Service.insertCv(flux);
    }

    /**
     * Endpoint pour supprimer un CV par son ID.
     * <p>
     * Ce endpoint supprime le CV correspondant à l'ID fourni de la base de données.
     * </p>
     *
     * @param id L'ID du CV à supprimer.
     * @return Un objet représentant le résultat de la suppression, incluant le statut et l'ID du CV supprimé si réussi.
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Object deleteCv24(@PathVariable int id){

        // Vérification de l'existence du cv et suppression
        return this.cv24Service.deleteCv(id);
    }

}
