package io.nirahtech.ride4ever.microservice.account.business.services.role;

import io.nirahtech.ride4ever.microservice.account.business.api.Crud;
import io.nirahtech.ride4ever.microservice.account.domain.api.RoleApi;
import io.nirahtech.ride4ever.microservice.account.domain.entities.Role;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface RoleService extends Crud<Role>, RoleApi {
    
}
