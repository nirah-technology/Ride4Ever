package io.nirahtech.ride4ever.microservice.motorcycleclub.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.api.MotorcycleClubApi;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.MotorcycleClub;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("motorcycleClubRepository")
public interface MotorcycleClubRepository extends JpaRepository<MotorcycleClub, String>, MotorcycleClubApi {
    
}
