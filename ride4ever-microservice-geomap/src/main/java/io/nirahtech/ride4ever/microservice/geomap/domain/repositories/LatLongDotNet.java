package io.nirahtech.ride4ever.microservice.geomap.domain.repositories;

public class LatLongDotNet extends AbstractCoordinatesConverter {

    public LatLongDotNet() {
        super("https://latitude.to/");
    }

    @Override
    public String resolve(double latitude, double longitude) {
        // TODO Auto-generated method stub
        return null;
    }
}
