package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Modèle pour représenter une réponse de statut dans le système.
 * <p>
 * Cette classe est utilisée pour encapsuler les informations sur le statut d'une opération, généralement lors de l'envoi de réponses HTTP.
 * </p>
 *
 * @since 2024-05-21
 */
@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class StatusResponse {
    /**
     * L'identifiant associé à la réponse.
     */
    @XmlElement(name = "id", nillable = true)
    private int id;
    /**
     * Le statut de la réponse.
     */
    @XmlElement(name = "status")
    private String status;
    /**
     * Les détails supplémentaires sur le statut, si disponibles.
     */
    @XmlElement(name = "detail")
    private String detail;
    /**
     * Constructeur par défaut.
     */
    public StatusResponse() {}
    /**
     * Constructeur avec l'identifiant et le statut.
     *
     * @param id     l'identifiant associé à la réponse.
     * @param status le statut de la réponse.
     */
    public StatusResponse(int id, String status) {
        this.id = id;
        this.status = status;
    }
    /**
     * Constructeur avec le statut et les détails.
     *
     * @param status le statut de la réponse.
     * @param detail les détails supplémentaires sur le statut.
     */
    public StatusResponse(String status, String detail) {
        this.status = status;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}

