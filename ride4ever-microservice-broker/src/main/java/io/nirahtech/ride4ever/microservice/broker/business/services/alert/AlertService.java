package io.nirahtech.ride4ever.microservice.broker.business.services.alert;

import io.nirahtech.ride4ever.core.business.api.Crud;
import io.nirahtech.ride4ever.microservice.broker.domain.api.AlertApi;
import io.nirahtech.ride4ever.microservice.broker.domain.entities.Alert;

public interface AlertService extends Crud<Alert>, AlertApi {
    
}
