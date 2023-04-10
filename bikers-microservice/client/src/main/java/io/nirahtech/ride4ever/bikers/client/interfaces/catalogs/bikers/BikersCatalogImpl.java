package io.nirahtech.ride4ever.bikers.client.interfaces.catalogs.bikers;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.bikers.client.business.services.bikers.BikersService;
import io.nirahtech.ride4ever.core.criterion.PropertyCondition;
import io.nirahtech.ride4ever.core.data.Biker;
import io.nirahtech.ride4ever.core.data.BikerIdentifier;
import io.nirahtech.ride4ever.core.requesting.Pageable;

public class BikersCatalogImpl implements BikersCatalog {

    private final BikersService bikersService;

    public BikersCatalogImpl(final BikersService bikersService) {
        this.bikersService = bikersService;
    }

    @Override
    public Stream<Biker> findAll(Set<PropertyCondition> filters, Pageable page) {
        return this.bikersService.findAll(filters, page);
    }

    @Override
    public Optional<Biker> findById(BikerIdentifier id) {
        return this.bikersService.findById(id);
    }
}
