package fr.univrouen.cv24v2.controller;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ErrorController {
    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public String handleNotFoundException(ChangeSetPersister.NotFoundException ex) {
        return "Erreur: Page non trouvée: Une erreur est survenue";
    }

    // Pour les erreurs générales
    @ExceptionHandler(Exception.class)
    public String handleAllExceptions(Exception ex, WebRequest request) {
        return ex.getMessage();
    }


}
