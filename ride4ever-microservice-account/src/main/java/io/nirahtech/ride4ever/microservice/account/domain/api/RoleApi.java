package io.nirahtech.ride4ever.microservice.account.domain.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import io.nirahtech.ride4ever.microservice.account.domain.entities.Role;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface RoleApi {
    Page<Role> findAll(Pageable pageable) ;
}
