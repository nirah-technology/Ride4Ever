package io.nirahtech.ride4ever.microservice.reservation.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.nirahtech.ride4ever.microservice.reservation.domain.api.ReservationApi;
import io.nirahtech.ride4ever.microservice.reservation.domain.entities.Reservation;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("reservationRepository")
public interface ReservationRepository extends JpaRepository<Reservation, Long>, ReservationApi {
    
}
