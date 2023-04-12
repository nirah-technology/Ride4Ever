package io.nirahtech.ride4ever.microservice.geomap.domain.repositories;

import io.nirahtech.ride4ever.microservice.geomap.domain.api.CoordinatesConverter;

public abstract class AbstractCoordinatesConverter implements CoordinatesConverter {
    
    protected final String url;
    
    public AbstractCoordinatesConverter(final String url) {
        this.url = url;
    }
}
