package io.ride4ever.microservice.biker.business.services.biker;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.ride4ever.microservice.biker.domain.entities.Biker;
import io.ride4ever.microservice.biker.domain.repositories.BikerRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
// @Service("additionalMessageService")
@Component("bikerService")
public class BikerServiceImpl implements BikerService {

    @Autowired
    private BikerRepository repository;

    public BikerServiceImpl() {
        
    }

    @Override
    public Biker create(Biker entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<Biker> read(String id) {
        return this.repository.findById(id);
    }

    @Override
    public Biker update(Biker entity) {
        return this.repository.save(entity);
    }

    public void delete(String id) {
        Optional<Biker> optional = this.read(id);
        if (optional.isPresent()) {
            this.repository.deleteById(id);
        }
    }
    @Override
    public Page<Biker> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

}
