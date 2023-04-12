package io.nirahtech.ride4ever.microservice.trip.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.nirahtech.ride4ever.microservice.trip.domain.api.RoadTripApi;
import io.nirahtech.ride4ever.microservice.trip.domain.entities.RoadTrip;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("roadTripRepository")
public interface RoadTripRepository extends JpaRepository<RoadTrip, Long>, RoadTripApi {
    
}
