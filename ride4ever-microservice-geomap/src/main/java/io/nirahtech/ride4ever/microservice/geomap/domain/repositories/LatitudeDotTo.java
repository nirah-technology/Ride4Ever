package io.nirahtech.ride4ever.microservice.geomap.domain.repositories;

public class LatitudeDotTo extends AbstractCoordinatesConverter {

    public LatitudeDotTo() {
        super("https://www.latlong.net/Show-Latitude-Longitude.html");
    }

    @Override
    public String resolve(double latitude, double longitude) {
        // TODO Auto-generated method stub
        return null;
    }
}
