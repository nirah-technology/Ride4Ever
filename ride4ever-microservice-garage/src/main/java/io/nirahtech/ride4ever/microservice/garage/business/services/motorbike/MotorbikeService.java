package io.nirahtech.ride4ever.microservice.garage.business.services.motorbike;

import io.nirahtech.ride4ever.core.business.api.Crud;
import io.nirahtech.ride4ever.microservice.garage.domain.api.MotorbikeApi;
import io.nirahtech.ride4ever.microservice.garage.domain.entities.Motorbike;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface MotorbikeService extends Crud<Motorbike>, MotorbikeApi {
    
}
