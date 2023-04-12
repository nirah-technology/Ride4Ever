package io.nirahtech.ride4ever.microservice.geomap.business.services.roadtrip;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.nirahtech.ride4ever.microservice.geomap.domain.entities.RoadTrip;
import io.nirahtech.ride4ever.microservice.geomap.domain.repositories.RoadTripRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Component("roadTripService")
public class RoadTripServiceImpl implements RoadTripService {

    @Autowired
    private RoadTripRepository repository;

    public RoadTripServiceImpl() {
        
    }

    @Override
    public RoadTrip create(RoadTrip entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<RoadTrip> read(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public RoadTrip update(RoadTrip entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        Optional<RoadTrip> optional = this.read(id);
        if (optional.isPresent()) {
            this.repository.deleteById(id);
        }
    }
    @Override
    public Page<RoadTrip> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

}
