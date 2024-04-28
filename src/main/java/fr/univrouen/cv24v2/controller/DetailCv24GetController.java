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

@RestController
@RequestMapping(path="/cv24")
public class DetailCv24GetController {

    @Autowired
    private Cv24Repository cv24Repository;

    @RequestMapping(value="/xml", produces= MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody Object detailxml(@RequestParam int id) {
            Cv24Entity cv24Entity = cv24Repository.findById(id);
        if (cv24Entity!=null){
            return Cv24Mapper.convertToXml(cv24Entity);
        }else return new StatusResponse(id, "ERROR");
    }

    @RequestMapping(value="/html", produces= MediaType.TEXT_HTML_VALUE)
    public @ResponseBody Object detailhtml(@RequestParam int id) throws TransformerException {
        Cv24Entity cv24Entity = cv24Repository.findById(id);
        if (cv24Entity!=null){
            Cv24 cv = Cv24Mapper.convertToXml(cv24Entity);
            return TransformerXslt.Cv24toHTML(cv);
        }else return new StatusResponse(id, "ERROR");
    }

}
