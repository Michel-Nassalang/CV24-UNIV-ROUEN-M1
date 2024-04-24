package fr.univrouen.cv24v2.controller;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public String handleNotFoundException(ChangeSetPersister.NotFoundException ex, Model model) {
        model.addAttribute("errorMessage", "La page que vous recherchez n'a pas été trouvée.");
        return "error/404";
    }

}
