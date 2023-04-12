package io.nirahtech.ride4ever.microservice.geomap.business.services.roadtrip;

import io.nirahtech.ride4ever.core.business.api.Crud;
import io.nirahtech.ride4ever.microservice.geomap.domain.api.RoadTripApi;
import io.nirahtech.ride4ever.microservice.geomap.domain.entities.RoadTrip;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface RoadTripService extends Crud<RoadTrip>, RoadTripApi {
    
}
