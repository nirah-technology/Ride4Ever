package io.nirahtech.ride4ever.microservice.motorcycleclub.business.services.role;

import io.nirahtech.ride4ever.microservice.motorcycleclub.business.api.Crud;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.api.RoleApi;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.Role;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface RoleService extends Crud<Role>, RoleApi {
    
}
