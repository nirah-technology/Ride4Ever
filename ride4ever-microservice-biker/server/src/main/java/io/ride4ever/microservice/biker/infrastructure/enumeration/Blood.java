/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.ride4ever.microservice.biker.infrastructure.enumeration;

public enum Blood {
    A_PLUS("A+"),
    A_MINUS("A-"),
    B_PLUS("B+"),
    B_MINUS("B-"),
    O_PLUS("O+"),
    O_MINUS("O-"),
    AB_PLUS("AB+"),
    AB_MINUS("AB-");

    private final String value;

    private Blood(final String value) {
        this.value = value;
    }

    public final String getValue() {
        return this.value;
    }
}
