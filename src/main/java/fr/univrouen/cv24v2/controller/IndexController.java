package fr.univrouen.cv24v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("dev1","NASSALANG Michel");

        model.addAttribute("dev2","BRAHIMI Sid Ahmed");
        return "Index";
    }


    @GetMapping("/help")
    public String help(Model model) {
        return "help";
    }


}
