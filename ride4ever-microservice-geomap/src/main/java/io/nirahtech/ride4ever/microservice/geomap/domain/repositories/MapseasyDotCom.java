package io.nirahtech.ride4ever.microservice.geomap.domain.repositories;

public class MapseasyDotCom extends AbstractCoordinatesConverter {

    public MapseasyDotCom() {
        super("http://mapseasy.com/gps-coordinates-to-adress.php");
    }

    @Override
    public String resolve(double latitude, double longitude) {
        // TODO Auto-generated method stub
        return null;
    }
}
