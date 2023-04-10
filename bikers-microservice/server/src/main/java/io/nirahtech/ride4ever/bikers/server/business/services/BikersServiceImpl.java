package io.nirahtech.ride4ever.bikers.server.business.services;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.bikers.server.domain.repositories.BikersRepository;
import io.nirahtech.ride4ever.core.criterion.PropertyCondition;
import io.nirahtech.ride4ever.core.data.Biker;
import io.nirahtech.ride4ever.core.data.BikerIdentifier;
import io.nirahtech.ride4ever.core.requesting.Pageable;

public class BikersServiceImpl implements BikersService {

    private final BikersRepository bikersRepository;

    public BikersServiceImpl(final BikersRepository bikersRepository) {
        this.bikersRepository = bikersRepository;
    }

    @Override
    public Stream<Biker> findAll(Set<PropertyCondition> filters, Pageable page) {
        System.out.println(page.getSize());
        System.out.println(page.getPage());
        return this.bikersRepository.findAll(filters, page);
    }

    @Override
    public Optional<Biker> findById(BikerIdentifier id) {
        return this.bikersRepository.findById(id);
    }
    
}
