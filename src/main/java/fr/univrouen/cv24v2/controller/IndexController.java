package fr.univrouen.cv24v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Contrôleur gérant les requêtes liées à l'index et à l'aide.
 * <p>
 * Ce contrôleur gère les requêtes GET pour l'index de l'application et la page d'aide.
 * Il utilise des annotations Spring MVC pour mapper les requêtes aux méthodes appropriées.
 * </p>
 */
@Controller
public class IndexController {

    /**
     * Gère la requête GET pour l'index de l'application.
     * <p>
     * Cette méthode renvoie la vue "Index" avec les informations des développeurs.
     * Les informations des développeurs sont ajoutées au modèle pour être affichées dans la vue.
     * </p>
     *
     * @param model Le modèle utilisé pour transmettre des données à la vue.
     * @return Le nom de la vue à afficher (dans ce cas, "Index").
     */
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dev1","NASSALANG Michel");

        model.addAttribute("dev2","BRAHIMI Sid Ahmed");
        return "Index";
    }

    /**
     * Gère la requête GET pour la page d'aide.
     * <p>
     * Cette méthode renvoie la vue "help", qui fournit des informations d'aide sur l'utilisation de l'application.
     * </p>
     *
     * @param model Le modèle utilisé pour transmettre des données à la vue.
     * @return Le nom de la vue à afficher (dans ce cas, "help").
     */
    @GetMapping("/help")
    public String help(Model model) {
        return "help";
    }

}
