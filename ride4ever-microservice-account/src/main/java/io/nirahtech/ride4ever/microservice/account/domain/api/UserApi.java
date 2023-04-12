package io.nirahtech.ride4ever.microservice.account.domain.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.account.domain.entities.User;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface UserApi {
    Page<User> findAll(Pageable pageable) ;
}
