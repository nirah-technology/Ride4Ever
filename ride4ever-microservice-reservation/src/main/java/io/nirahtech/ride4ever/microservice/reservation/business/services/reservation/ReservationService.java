package io.nirahtech.ride4ever.microservice.reservation.business.services.reservation;

import io.nirahtech.ride4ever.core.business.api.Crud;
import io.nirahtech.ride4ever.microservice.reservation.domain.api.ReservationApi;
import io.nirahtech.ride4ever.microservice.reservation.domain.entities.Reservation;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface ReservationService extends Crud<Reservation>, ReservationApi {
    
}
