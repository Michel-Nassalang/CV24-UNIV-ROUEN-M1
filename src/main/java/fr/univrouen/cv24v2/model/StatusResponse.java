package fr.univrouen.cv24v2.model;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
@XmlAccessorType(XmlAccessType.FIELD)
public class StatusResponse {

    @XmlElement(name = "id", nillable = true)
    private int id;

    @XmlElement(name = "status")
    private String status;

    @XmlElement(name = "detail")
    private String detail;

    public StatusResponse() {}

    public StatusResponse(int id, String status) {
        this.id = id;
        this.status = status;
    }
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

