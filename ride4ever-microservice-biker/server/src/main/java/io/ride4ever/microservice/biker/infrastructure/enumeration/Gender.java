/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.ride4ever.microservice.biker.infrastructure.enumeration;

public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE"),
    NEUTRAL("NEUTRAL");

    private final String value;

    private Gender(final String value) {
        this.value = value;
    }

    public final String getValue() {
        return value;
    }

    public static final Gender parse(final String value) {
        for (Gender enumeration : Gender.values()) {
            if (enumeration.getValue().equalsIgnoreCase(value)) {
                return enumeration;
            }
        }
        return null;
    }
}
