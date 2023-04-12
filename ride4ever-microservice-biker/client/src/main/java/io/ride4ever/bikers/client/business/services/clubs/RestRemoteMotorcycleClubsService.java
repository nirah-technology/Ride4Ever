package io.ride4ever.bikers.client.business.services.clubs;

import java.net.URL;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.ride4ever.core.criterion.PropertyCondition;
import io.ride4ever.core.data.MotorcycleClub;
import io.ride4ever.core.data.MotorcycleClubIdentifier;
import io.ride4ever.core.requesting.Pageable;

public class RestRemoteMotorcycleClubsService implements MotorcycleClubsService {

    private final URL remoteServiceUrl;

    public RestRemoteMotorcycleClubsService(final URL remoteServiceUrl) {
        this.remoteServiceUrl = remoteServiceUrl;
    }

    @Override
    public Stream<MotorcycleClub> findAll(Set<PropertyCondition> filters, Pageable page) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<MotorcycleClub> findById(MotorcycleClubIdentifier id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    
}
