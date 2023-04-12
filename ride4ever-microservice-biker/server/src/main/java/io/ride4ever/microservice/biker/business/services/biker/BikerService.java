package io.ride4ever.microservice.biker.business.services.biker;

import io.ride4ever.microservice.biker.business.api.Crud;
import io.ride4ever.microservice.biker.domain.api.BikerApi;
import io.ride4ever.microservice.biker.domain.entities.Biker;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface BikerService extends Crud<Biker>, BikerApi {
    
}
