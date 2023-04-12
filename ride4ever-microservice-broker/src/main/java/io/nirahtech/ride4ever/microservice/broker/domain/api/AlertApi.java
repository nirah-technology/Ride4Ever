package io.nirahtech.ride4ever.microservice.broker.domain.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.broker.domain.entities.Alert;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface AlertApi {
    Page<Alert> findAll(Pageable pageable);
}
