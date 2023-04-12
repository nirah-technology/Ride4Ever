package io.ride4ever.microservice.biker.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ride4ever.microservice.biker.domain.api.BikerApi;
import io.ride4ever.microservice.biker.domain.entities.Biker;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("bikerRepository")
public interface BikerRepository extends JpaRepository<Biker, String>, BikerApi {
    
}
