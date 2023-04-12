package io.nirahtech.ride4ever.microservice.broker.domain.entities;

import java.io.Serializable;

import io.nirahtech.ride4ever.microservice.broker.infrastructure.enumerations.Severity;


public class Notification implements Serializable {

    private Long id;
    private final String title;
    private final Severity severity;
    private final String message;

    public final Severity getSeverity() {
        return this.severity;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public Notification(final String title, final Severity severity, final String message) {
        this.title = title;
        this.severity = severity;
        this.message = message;
    }
}
