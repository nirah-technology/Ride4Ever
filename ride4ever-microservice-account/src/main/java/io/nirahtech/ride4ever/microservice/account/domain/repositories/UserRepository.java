package io.nirahtech.ride4ever.microservice.account.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.nirahtech.ride4ever.microservice.account.domain.api.UserApi;
import io.nirahtech.ride4ever.microservice.account.domain.entities.User;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, String>, UserApi {
    
}
