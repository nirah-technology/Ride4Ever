package io.nirahtech.ride4ever.microservice.reservation.business.services.reservation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.nirahtech.ride4ever.microservice.reservation.domain.entities.Reservation;
import io.nirahtech.ride4ever.microservice.reservation.domain.repositories.ReservationRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
// @Service("additionalMessageService")
@Component("reservationService")
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository repository;

    public ReservationServiceImpl() {
        
    }

    @Override
    public Reservation create(Reservation entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<Reservation> read(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Reservation update(Reservation entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        Optional<Reservation> optional = this.read(id);
        if (optional.isPresent()) {
            this.repository.deleteById(id);
        }
    }
    @Override
    public Page<Reservation> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

}
