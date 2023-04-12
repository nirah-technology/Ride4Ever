/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.recovery.domain.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recovery implements Serializable {
    @Id
    private String identity;
    private String token;
    private String publisher;
    private String code;
    private String password;

    public Recovery() {

    }

    public final String getIdentity() {
        return this.identity;
    }
    public final String getToken() {
        return this.token;
    }
    public final String getPublisher() {
        return this.publisher;
    }
    public final String getCode() {
        return this.code;
    }
    public final String getPassword() {
        return this.password;
    }

    public final void setCode(String code) {
        this.code = code;
    }
    public final void setIdentity(String identity) {
        this.identity = identity;
    }
    public final void setPassword(String password) {
        this.password = password;
    }
    public final void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public final void setToken(String token) {
        this.token = token;
    }

}
