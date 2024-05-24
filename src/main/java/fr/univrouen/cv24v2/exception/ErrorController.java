package fr.univrouen.cv24v2.exception;

import fr.univrouen.cv24v2.model.StatusResponse;
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
    public ResponseEntity<StatusResponse>  handleNotFoundException(ChangeSetPersister.NotFoundException ex) {
        StatusResponse response = new StatusResponse(String.valueOf(HttpStatus.NOT_FOUND), "Erreur: Page non trouvée: Une erreur est survenue");
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .header("Content-Type", "application/xml")
                .body(response);
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
    public ResponseEntity<StatusResponse>  handleResourceNotFoundException(ResourceNotFoundException ex) {
        StatusResponse response = createErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .header("Content-Type", "application/xml")
                .body(response);
    }

    @ExceptionHandler(ResourceAlreadyExistException.class)
    public ResponseEntity<StatusResponse>  handleResourceAlreadyExistException(ResourceAlreadyExistException ex) {
        StatusResponse response = createErrorResponse(HttpStatus.CONFLICT, ex.getMessage());
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .header("Content-Type", "application/xml")
                .body(response);
    }

    @ExceptionHandler(InvalidSearchCriteriaException.class)
    public ResponseEntity<StatusResponse>  handleInvalidSearchCriteriaException(InvalidSearchCriteriaException ex) {
        StatusResponse response = createErrorResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .header("Content-Type", "application/xml")
                .body(response);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<StatusResponse> handleAllExceptions(Exception ex, WebRequest request) {
        StatusResponse response = createErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Erreur interne du serveur : " + ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .header("Content-Type", "application/xml")
                .body(response);
    }

    private StatusResponse createErrorResponse(HttpStatus status, String message) {
        return new StatusResponse(String.valueOf(status.value()), message);
    }


}
