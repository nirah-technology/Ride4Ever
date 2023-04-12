package io.nirahtech.ride4ever.microservice.geomap.domain.repositories;

public class GpsCoordinatesDotOrg extends AbstractCoordinatesConverter {

    public GpsCoordinatesDotOrg() {
        super("https://gps-coordinates.org/coordinate-converter.php");
    }

    @Override
    public String resolve(double latitude, double longitude) {
        // TODO Auto-generated method stub
        return null;
    }
}
