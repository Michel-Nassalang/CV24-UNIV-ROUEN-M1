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

//    @GetMapping("/insert")
//    public String showCreateForm(Model model) {
//        Cv24 cv24 = new Cv24();
//        cv24.setIdentite(new Identite());
//        cv24.setObjectif(new Objectif());
//        cv24.setProf(new Prof());
//        cv24.setCompetences(new Competences());
//        cv24.setDivers(new Divers());
//        model.addAttribute("cv24", cv24);
//        return "cv/Create";
//    }

//    @PostMapping("/insert")
//    public String createCv(@ModelAttribute("cv24") Cv24 cv24, BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            return "cv/Create";
//        }
//
//        // Enregistrer le CV dans la base de données
//        // ...
//
//        return "redirect:/cv24/html?id={id}";
//    }

}
