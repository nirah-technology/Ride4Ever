package io.nirahtech.ride4ever.microservice.geomap.domain.api;

/**
 * 
 */
public interface CoordinatesConverter {

    /**
     * Resolves GPS coordinates to raw address.
     * @param latitude Latitude
     * @param longitude Longitude
     * @return Raw Address
     */
    String resolve(final double latitude, final double longitude);
}
