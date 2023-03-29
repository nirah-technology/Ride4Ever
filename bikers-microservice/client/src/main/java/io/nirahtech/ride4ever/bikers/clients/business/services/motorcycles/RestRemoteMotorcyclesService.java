package io.nirahtech.ride4ever.bikers.clients.business.services.motorcycles;

import java.net.URL;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.core.criterion.PropertyCondition;
import io.nirahtech.ride4ever.core.data.Motorcycle;
import io.nirahtech.ride4ever.core.data.MotorcycleIdentifier;
import io.nirahtech.ride4ever.core.requesting.Pageable;

public class RestRemoteMotorcyclesService implements MotorcyclesService {

    private final URL remoteServiceUrl;

    public RestRemoteMotorcyclesService(final URL remoteServiceUrl) {
        this.remoteServiceUrl = remoteServiceUrl;
    }

    @Override
    public Stream<Motorcycle> findAll(Set<PropertyCondition> filters, Pageable page) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<Motorcycle> findById(MotorcycleIdentifier id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    
}
