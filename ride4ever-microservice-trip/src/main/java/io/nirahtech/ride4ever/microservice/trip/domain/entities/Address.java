package io.nirahtech.ride4ever.microservice.trip.domain.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.nirahtech.ride4ever.microservice.trip.infrastructure.enumeration.Country;

@Embeddable
@Entity
public final class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifier;
    
    private int number;
    private String street;
    private String state;
    private int zipCode;
    private String city;
    @Enumerated(EnumType.STRING)
    private Country country;

    public Address() {
    }

    public Address(int identifier, int number, String street, String state, int zipCode, String city, Country country) {
        this.identifier = identifier;
        this.number = number;
        this.street = street;
        this.state = state;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public int getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Address identifier(int identifier) {
        setIdentifier(identifier);
        return this;
    }

    public Address number(int number) {
        setNumber(number);
        return this;
    }

    public Address street(String street) {
        setStreet(street);
        return this;
    }

    public Address state(String state) {
        setState(state);
        return this;
    }

    public Address zipCode(int zipCode) {
        setZipCode(zipCode);
        return this;
    }

    public Address city(String city) {
        setCity(city);
        return this;
    }

    public Address country(Country country) {
        setCountry(country);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Address)) {
            return false;
        }
        Address address = (Address) o;
        return identifier == address.identifier && number == address.number && Objects.equals(street, address.street) && Objects.equals(state, address.state) && zipCode == address.zipCode && Objects.equals(city, address.city) && Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, number, street, state, zipCode, city, country);
    }

    @Override
    public String toString() {
        return "{" +
            " identifier='" + getIdentifier() + "'" +
            ", number='" + getNumber() + "'" +
            ", street='" + getStreet() + "'" +
            ", state='" + getState() + "'" +
            ", zipCode='" + getZipCode() + "'" +
            ", city='" + getCity() + "'" +
            ", country='" + getCountry() + "'" +
            "}";
    }
    
}
