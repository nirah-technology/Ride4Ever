package io.nirahtech.ride4ever.microservice.garage.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.nirahtech.ride4ever.microservice.garage.domain.api.MotorbikeApi;
import io.nirahtech.ride4ever.microservice.garage.domain.entities.Motorbike;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("motorbikeRepository")
public interface MotorbikeRepository extends JpaRepository<Motorbike, Long>, MotorbikeApi {
    
}
