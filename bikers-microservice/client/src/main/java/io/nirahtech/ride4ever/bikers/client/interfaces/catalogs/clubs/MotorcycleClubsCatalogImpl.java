package io.nirahtech.ride4ever.bikers.client.interfaces.catalogs.clubs;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.bikers.client.business.services.clubs.MotorcycleClubsService;
import io.nirahtech.ride4ever.core.criterion.PropertyCondition;
import io.nirahtech.ride4ever.core.data.MotorcycleClub;
import io.nirahtech.ride4ever.core.data.MotorcycleClubIdentifier;
import io.nirahtech.ride4ever.core.requesting.Pageable;

/**
 * MotorcycleClubsCatalogImpl
 */
public class MotorcycleClubsCatalogImpl implements MotorcycleClubsCatalog {

    private final MotorcycleClubsService motorcycleClubsService;

    public MotorcycleClubsCatalogImpl(final MotorcycleClubsService motorcycleClubsService) {
        this.motorcycleClubsService = motorcycleClubsService;
    }

    @Override
    public Stream<MotorcycleClub> findAll(Set<PropertyCondition> filters, Pageable page) {
        return this.motorcycleClubsService.findAll(filters, page);
    }

    @Override
    public Optional<MotorcycleClub> findById(MotorcycleClubIdentifier id) {
        return this.motorcycleClubsService.findById(id);
    }

    
}