package io.nirahtech.ride4ever.microservice.recovery.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.nirahtech.ride4ever.microservice.recovery.domain.api.RecoveryApi;
import io.nirahtech.ride4ever.microservice.recovery.domain.entities.Recovery;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("recoveryRepository")
public interface RecoveryRepository extends JpaRepository<Recovery, Long>, RecoveryApi {
    
}
