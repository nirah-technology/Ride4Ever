package io.nirahtech.ride4ever.microservice.motorcycleclub.business.services.club;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.MotorcycleClub;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.repositories.MotorcycleClubRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
// @Service("additionalMessageService")
@Component("motorcycleClubService")
public class MotorcycleClubServiceImpl implements MotorcycleClubService {

    @Autowired
    private MotorcycleClubRepository repository;

    public MotorcycleClubServiceImpl() {
        
    }

    @Override
    public MotorcycleClub create(MotorcycleClub entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<MotorcycleClub> read(String id) {
        return this.repository.findById(id);
    }

    @Override
    public MotorcycleClub update(MotorcycleClub entity) {
        return this.repository.save(entity);
    }

    public void delete(String id) {
        Optional<MotorcycleClub> optional = this.read(id);
        if (optional.isPresent()) {
            this.repository.deleteById(id);
        }
    }
    @Override
    public Page<MotorcycleClub> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

}
