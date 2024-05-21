package fr.univrouen.cv24v2.exception;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/**
 * Contrôleur pour gérer les erreurs survenues dans l'application.
 * <p>
 * Ce contrôleur est utilisé pour capturer et gérer les exceptions survenues dans l'application.
 * Il fournit des méthodes pour gérer les erreurs spécifiques, telles que les erreurs de page non trouvée,
 * ainsi que les erreurs générales.
 * </p>
 */
@RestControllerAdvice
public class ErrorController {
    /**
     * Gère les exceptions de type ChangeSetPersister.NotFoundException.
     * <p>
     * Cette méthode est invoquée lorsqu'une exception de type NotFoundException est levée dans l'application.
     * Elle renvoie un message d'erreur approprié indiquant qu'une page n'a pas été trouvée.
     * </p>
     *
     * @param ex L'exception NotFoundException qui a été levée.
     * @return Un message d'erreur indiquant qu'une page n'a pas été trouvée.
     */
    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public String handleNotFoundException(ChangeSetPersister.NotFoundException ex) {
        return "Erreur: Page non trouvée: Une erreur est survenue";
    }

    /**
     * Gère toutes les exceptions génériques.
     * <p>
     * Cette méthode est invoquée lorsqu'une exception générale non traitée est levée dans l'application.
     * Elle renvoie un message d'erreur générique avec le message de l'exception.
     * </p>
     *
     * @param ex      L'exception qui a été levée.
     * @return Un message d'erreur générique avec le message de l'exception.
     */
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex) {
        return new ResponseEntity<>(createErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceAlreadyExistException.class)
    public ResponseEntity<Object> handleResourceAlreadyExistException(ResourceAlreadyExistException ex) {
        return new ResponseEntity<>(createErrorResponse(HttpStatus.CONFLICT, ex.getMessage()), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        return new ResponseEntity<>(createErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Erreur interne du serveur : " + ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ErrorResponse createErrorResponse(HttpStatus status, String message) {
        return new ErrorResponse(status.value(), message);
    }
    // Classe interne pour structurer les réponses d'erreur
    public static class ErrorResponse {
        private int status;
        private String message;

        public ErrorResponse(int status, String message) {
            this.status = status;
            this.message = message;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }


}
