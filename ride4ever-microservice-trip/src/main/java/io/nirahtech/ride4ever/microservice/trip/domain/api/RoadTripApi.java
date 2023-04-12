package io.nirahtech.ride4ever.microservice.trip.domain.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.trip.domain.entities.RoadTrip;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface RoadTripApi {
    Page<RoadTrip> findAll(Pageable pageable) ;
}
