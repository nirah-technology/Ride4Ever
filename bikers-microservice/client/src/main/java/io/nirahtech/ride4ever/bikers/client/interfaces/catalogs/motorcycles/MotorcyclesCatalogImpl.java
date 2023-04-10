package io.nirahtech.ride4ever.bikers.client.interfaces.catalogs.motorcycles;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.bikers.client.business.services.motorcycles.MotorcyclesService;
import io.nirahtech.ride4ever.core.criterion.PropertyCondition;
import io.nirahtech.ride4ever.core.data.Motorcycle;
import io.nirahtech.ride4ever.core.data.MotorcycleIdentifier;
import io.nirahtech.ride4ever.core.requesting.Pageable;

public class MotorcyclesCatalogImpl implements MotorcyclesCatalog {
    
    private final MotorcyclesService motorcyclesService;

    public MotorcyclesCatalogImpl(final MotorcyclesService motorcyclesService) {
        this.motorcyclesService = motorcyclesService;
    }

    @Override
    public Stream<Motorcycle> findAll(Set<PropertyCondition> filters, Pageable page) {
        return this.motorcyclesService.findAll(filters, page);
    }

    @Override
    public Optional<Motorcycle> findById(MotorcycleIdentifier id) {
        return this.motorcyclesService.findById(id);
    }
}
