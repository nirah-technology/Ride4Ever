package io.nirahtech.ride4ever.microservice.broker.domain.repositories.alert;

import org.springframework.data.jpa.repository.JpaRepository;

import io.nirahtech.ride4ever.microservice.broker.domain.api.AlertApi;
import io.nirahtech.ride4ever.microservice.broker.domain.entities.Alert;

public interface AlertRepository extends JpaRepository<Alert, Long>, AlertApi {
    
}
