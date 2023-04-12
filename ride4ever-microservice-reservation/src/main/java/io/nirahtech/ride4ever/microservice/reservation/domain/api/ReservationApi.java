package io.nirahtech.ride4ever.microservice.reservation.domain.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.reservation.domain.entities.Reservation;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface ReservationApi {
    Page<Reservation> findAll(Pageable pageable) ;
}
