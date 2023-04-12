package io.nirahtech.ride4ever.microservice.garage.business.services.motorbike;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.nirahtech.ride4ever.microservice.garage.domain.entities.Motorbike;
import io.nirahtech.ride4ever.microservice.garage.domain.repositories.MotorbikeRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
// @Service("additionalMessageService")
@Component("motorbikeService")
public class MotorbikeServiceImpl implements MotorbikeService {

    @Autowired
    private MotorbikeRepository repository;

    public MotorbikeServiceImpl() {
        
    }

    @Override
    public Motorbike create(Motorbike entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<Motorbike> read(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Motorbike update(Motorbike entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        Optional<Motorbike> optional = this.read(id);
        if (optional.isPresent()) {
            this.repository.deleteById(id);
        }
    }
    @Override
    public Page<Motorbike> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

    @Override
    public List<Motorbike> findAllByOwner(String owner) {
        return this.repository.findAllByOwner(owner);
    }

}
