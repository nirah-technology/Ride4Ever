package io.nirahtech.ride4ever.microservice.account.business.services.user;

import io.nirahtech.ride4ever.microservice.account.business.api.Crud;
import io.nirahtech.ride4ever.microservice.account.domain.api.UserApi;
import io.nirahtech.ride4ever.microservice.account.domain.entities.User;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface UserService extends Crud<User>, UserApi {
    
}
