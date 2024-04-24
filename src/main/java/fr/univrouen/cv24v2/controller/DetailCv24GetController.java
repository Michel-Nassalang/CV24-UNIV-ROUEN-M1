package fr.univrouen.cv24v2.controller;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import fr.univrouen.cv24v2.mapper.Cv24Mapper;
import fr.univrouen.cv24v2.model.*;
import fr.univrouen.cv24v2.repository.Cv24Repository;
import fr.univrouen.cv24v2.transformer.TransformerXslt;
import fr.univrouen.cv24v2.validator.ValidatorCv24;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(path="/cv24")
public class DetailCv24GetController {

    @Autowired
    private Cv24Repository cv24Repository;

    @RequestMapping(value="/resume/test", produces= MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Cv24 test(@RequestParam int id) throws ParserConfigurationException {
        Cv24 cv = new Cv24();
        Identite  identite = new Identite();
        identite.setPrenom("Saliou");
        identite.setNom("Sarr");
        identite.setGenre("Mr");
        identite.setTel("0745564933");
        cv.setIdentite(identite);
        System.out.println( cv.getIdentite());
        LangueVivante instanceJAXB = new LangueVivante();
        instanceJAXB.setLang("Anglais");
        instanceJAXB.setCert("TOEIC");
        instanceJAXB.setNivs("Avancé");
        instanceJAXB.setNivi(800);
        Divers divers = new Divers();
        List<LangueVivante> lvList = new ArrayList<>();
        List<Autre> autreList = new ArrayList<>();
        lvList.add(instanceJAXB);
        Autre aut = new Autre();
        aut.setTitre("Mon titre");
        aut.setComment("Mon commentaire");
        autreList.add(aut);
        divers.setLv(lvList);
        divers.setAutre(autreList);
        cv.setDivers(divers);
        DetailExperience det = new DetailExperience();
        det.setDatedeb(new Date());
        det.setDatefin(new Date());
        det.setTitre("Développeur Java");
        Prof prof = new Prof();
        List<DetailExperience> detexp = new ArrayList<>();
        detexp.add(det);
        prof.setDetail(detexp);
        cv.setProf(prof);
        Cv24Entity cv24Entity = Cv24Mapper.convertToEntity(cv);
//        Boolean err = ValidatorCv24.validateCv24(cv);
//        System.out.println(err);
        System.out.println(cv24Entity.getId());
        System.out.println( cv24Entity.getIdentite().getNom());
        System.out.println(cv24Entity.getDivers().getLv().get(0).getLang());
        System.out.println(cv24Entity.getProf().getDetail().get(0).getTitre());
        return cv;
    }

    @RequestMapping(value="/xml", produces= MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Cv24 detailxml(@RequestParam int id) {
        Cv24Entity cv24Entity = cv24Repository.findById(id);
        Cv24 cv = Cv24Mapper.convertToXml(cv24Entity);
        return cv;
    }

    @RequestMapping(value="/html", produces= MediaType.TEXT_HTML_VALUE)
    public @ResponseBody String detailhtml(@RequestParam int id) throws TransformerException {
        Cv24Entity cv24Entity = cv24Repository.findById(id);
        if (cv24Entity!=null){
            Cv24 cv = Cv24Mapper.convertToXml(cv24Entity);
            String htmlXslt = TransformerXslt.Cv24toHTML(cv);
            return htmlXslt;
        }else return "Cv24 non trouvé";
    }

    @GetMapping("/resume/validate")
    public @ResponseBody  boolean validate() throws ParserConfigurationException {
        Cv24 cv = new Cv24();
        Identite  identite = new Identite();
        identite.setPrenom("Saliou");
        identite.setNom("Sarr");
        identite.setGenre("Mr");
        identite.setTel("0745564933");
        cv.setIdentite(identite);
//        Boolean err = ValidatorCv24.validateCv24(cv);
        Boolean err = false;
        return err;
    }

    @GetMapping("/resume/cvhtml")
    public @ResponseBody String cvHtml() throws ParserConfigurationException, TransformerException {
        Cv24 cv = new Cv24();
        Identite  identite = new Identite();
        identite.setPrenom("Saliou");
        identite.setNom("Sarr");
        identite.setGenre("Mr");
        identite.setTel("0745564933");
        cv.setIdentite(identite);
        String html = TransformerXslt.Cv24toHTML(cv);
        return html;
    }

}
