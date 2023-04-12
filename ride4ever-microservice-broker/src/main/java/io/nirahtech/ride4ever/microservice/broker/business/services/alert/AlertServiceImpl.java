package io.nirahtech.ride4ever.microservice.broker.business.services.alert;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.nirahtech.ride4ever.microservice.broker.domain.entities.Alert;
import io.nirahtech.ride4ever.microservice.broker.domain.repositories.alert.AlertRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Component("alertService")
public final class AlertServiceImpl implements AlertService {

    @Autowired
    private AlertRepository alertRepository;

    public AlertServiceImpl() {
        System.out.println(alertRepository);
    }

    @Override
    public Alert create(Alert entity) {
        return this.alertRepository.save(entity);
    }

    @Override
    public Optional<Alert> read(Long id) {
        return this.alertRepository.findById(id);
    }

    @Override
    public Alert update(Alert entity) {
        return this.alertRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        this.alertRepository.deleteById(id);
    }

    public Page<Alert> findAll(Pageable pageable) {
        Page<Alert> alerts = this.alertRepository.findAll(pageable);
        return alerts;
    }

}
