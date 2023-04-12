package io.nirahtech.ride4ever.microservice.recovery.domain.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.recovery.domain.entities.Recovery;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface RecoveryApi {
    Page<Recovery> findAll(Pageable pageable);
}
