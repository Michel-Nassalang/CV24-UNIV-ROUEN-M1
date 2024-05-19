package fr.univrouen.cv24v2.controller;

import fr.univrouen.cv24v2.entity.Cv24Entity;
import fr.univrouen.cv24v2.model.CvList;
import fr.univrouen.cv24v2.model.ResumeCv;
import fr.univrouen.cv24v2.model.StatusResponse;
import fr.univrouen.cv24v2.repository.Cv24Repository;
import fr.univrouen.cv24v2.transformer.TransformerListCVToXML;
import fr.univrouen.cv24v2.transformer.TransformerXslt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.TransformerException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(path="/cv24")
public class Cv24GetController {

    @Autowired
    private Cv24Repository cv24Repository;





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

    @GetMapping(value="/resume", produces = MediaType.TEXT_HTML_VALUE)
    public @ResponseBody Object resumehtml(Model model) throws TransformerException {
        Iterable<Cv24Entity> cv24Entities = cv24Repository.findAll();
        List<ResumeCv> resumexmls = StreamSupport.stream(cv24Entities.spliterator(), false)
                .map(ResumeCv::new)
                .collect(Collectors.toList());
        CvList listxml = new CvList();
        listxml.setCvList(resumexmls);
        return TransformerXslt.listCv24toHTML(listxml);

    }

}
