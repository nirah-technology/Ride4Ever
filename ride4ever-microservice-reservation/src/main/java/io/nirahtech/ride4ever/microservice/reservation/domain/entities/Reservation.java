package io.nirahtech.ride4ever.microservice.reservation.domain.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Reservation
 */
@Entity
public class Reservation implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifier;
    private String bikerEmail;
    private Long roadtripIdentifier;
    private int motorbikeIdentifier;
    private Timestamp date;

    public Reservation() {
    }

    public Reservation(Long identifier, String bikerEmail, Long roadtripIdentifier, int motorbikeIdentifier, Timestamp date) {
        this.identifier = identifier;
        this.bikerEmail = bikerEmail;
        this.roadtripIdentifier = roadtripIdentifier;
        this.motorbikeIdentifier = motorbikeIdentifier;
        this.date = date;
    }

    public Long getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    public String getBikerEmail() {
        return this.bikerEmail;
    }

    public void setBikerEmail(String bikerEmail) {
        this.bikerEmail = bikerEmail;
    }

    public Long getRoadtripIdentifier() {
        return this.roadtripIdentifier;
    }

    public void setRoadtripIdentifier(Long roadtripIdentifier) {
        this.roadtripIdentifier = roadtripIdentifier;
    }

    public int getMotorbikeIdentifier() {
        return this.motorbikeIdentifier;
    }

    public void setMotorbikeIdentifier(int motorbikeIdentifier) {
        this.motorbikeIdentifier = motorbikeIdentifier;
    }

    public Timestamp getDate() {
        return this.date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Reservation identifier(Long identifier) {
        setIdentifier(identifier);
        return this;
    }

    public Reservation bikerEmail(String bikerEmail) {
        setBikerEmail(bikerEmail);
        return this;
    }

    public Reservation roadtripIdentifier(Long roadtripIdentifier) {
        setRoadtripIdentifier(roadtripIdentifier);
        return this;
    }

    public Reservation motorbikeIdentifier(int motorbikeIdentifier) {
        setMotorbikeIdentifier(motorbikeIdentifier);
        return this;
    }

    public Reservation date(Timestamp date) {
        setDate(date);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reservation)) {
            return false;
        }
        Reservation reservation = (Reservation) o;
        return Objects.equals(identifier, reservation.identifier) && Objects.equals(bikerEmail, reservation.bikerEmail) && Objects.equals(roadtripIdentifier, reservation.roadtripIdentifier) && motorbikeIdentifier == reservation.motorbikeIdentifier && Objects.equals(date, reservation.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, bikerEmail, roadtripIdentifier, motorbikeIdentifier, date);
    }

    @Override
    public String toString() {
        return "{" +
            " identifier='" + getIdentifier() + "'" +
            ", bikerEmail='" + getBikerEmail() + "'" +
            ", roadtripIdentifier='" + getRoadtripIdentifier() + "'" +
            ", motorbikeIdentifier='" + getMotorbikeIdentifier() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }

}