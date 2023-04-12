package io.nirahtech.ride4ever.microservice.geomap.domain.repositories;

public class ItiloDotCom  extends AbstractCoordinatesConverter {

    public ItiloDotCom() {
        super("https://www.itilog.com/");
    }

    @Override
    public String resolve(double latitude, double longitude) {
        // TODO Auto-generated method stub
        return null;
    }
}
