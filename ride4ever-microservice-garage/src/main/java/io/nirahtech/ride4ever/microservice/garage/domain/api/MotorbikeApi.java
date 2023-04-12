package io.nirahtech.ride4ever.microservice.garage.domain.api;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.garage.domain.entities.Motorbike;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface MotorbikeApi {
    Page<Motorbike> findAll(Pageable pageable);
    List<Motorbike> findAllByOwner(String owner);
}
