package io.nirahtech.ride4ever.microservice.geomap.domain.repositories;

public class WhatsMyGpsDotCom extends AbstractCoordinatesConverter {

    public WhatsMyGpsDotCom() {
        super("https://www.whatsmygps.com/");
    }
    @Override
    public String resolve(double latitude, double longitude) {
        // TODO Auto-generated method stub
        return null;
    }
}
