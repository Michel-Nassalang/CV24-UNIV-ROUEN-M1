package fr.univrouen.cv24v2.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cv24")
public class Cv24GetController {

    @GetMapping("/resume/xml")
    public String resumexml(Model model) {
        model.addAttribute("dev1","Michel Nassalang");

        model.addAttribute("dev2","Sid Ahmed Brahimi");
        return "Index";
    }

    @GetMapping("/resume")
    public String resumehtml(Model model) {
        model.addAttribute("dev1","Michel Nassalang");

        model.addAttribute("dev2","Sid Ahmed Brahimi");
        return "Index";
    }

}
