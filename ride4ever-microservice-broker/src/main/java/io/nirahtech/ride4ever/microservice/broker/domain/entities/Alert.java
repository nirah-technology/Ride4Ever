package io.nirahtech.ride4ever.microservice.broker.domain.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Class that represents an alert.
 *
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Entity
public class Alert  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifier;
    private Timestamp date;
    private String message;
    public Long getIdentifier() {
        return identifier;
    }
    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }
    public Timestamp getDate() {
        return date;
    }
    public void setDate(Timestamp date) {
        this.date = date;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Alert() {

    }

    public Alert(Timestamp date, String message) {
        this.date = date;
        this.message = message;
    }

    public Alert(Long identifier, Timestamp date, String message) {
        this.identifier = identifier;
        this.date = date;
        this.message = message;
    }

}
