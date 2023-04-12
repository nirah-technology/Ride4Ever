package io.ride4ever.bikers.client.interfaces.providers;

import java.net.URL;
import java.util.Optional;

import io.ride4ever.bikers.client.business.services.bikers.BikersService;
import io.ride4ever.bikers.client.business.services.bikers.RestRemoteBikersService;
import io.ride4ever.bikers.client.business.services.clubs.MotorcycleClubsService;
import io.ride4ever.bikers.client.business.services.clubs.RestRemoteMotorcycleClubsService;
import io.ride4ever.bikers.client.business.services.motorcycles.MotorcyclesService;
import io.ride4ever.bikers.client.business.services.motorcycles.RestRemoteMotorcyclesService;
import io.ride4ever.bikers.client.interfaces.catalogs.bikers.BikersCatalog;
import io.ride4ever.bikers.client.interfaces.catalogs.bikers.BikersCatalogImpl;
import io.ride4ever.bikers.client.interfaces.catalogs.clubs.MotorcycleClubsCatalog;
import io.ride4ever.bikers.client.interfaces.catalogs.clubs.MotorcycleClubsCatalogImpl;
import io.ride4ever.bikers.client.interfaces.catalogs.motorcycles.MotorcyclesCatalog;
import io.ride4ever.bikers.client.interfaces.catalogs.motorcycles.MotorcyclesCatalogImpl;
import io.ride4ever.registry.client.ClientServiceRegistry;
import io.ride4ever.registry.common.Service;
import io.ride4ever.registry.common.ServiceRegistryProvider;

public final class BikersServiceProviderFactory {
    
    private BikersServiceProviderFactory() { }

    private static final Optional<URL> loadServiceUrl(final Service service) {
        final ServiceRegistryProvider serviceRegistry = new ClientServiceRegistry();
        return serviceRegistry.lookup(service);
    }
    
    public static final BikersServiceProvider create() {
        
        final Optional<URL> serviceUrl = loadServiceUrl(Service.BIKERS);

        final BikersService bikersService = new RestRemoteBikersService(serviceUrl.orElseThrow());
        final MotorcyclesService motorcyclesService = new RestRemoteMotorcyclesService(serviceUrl.orElseThrow());
        final MotorcycleClubsService motorcycleClubsServices = new RestRemoteMotorcycleClubsService(serviceUrl.orElseThrow());

        final BikersCatalog bikersCatalog = new BikersCatalogImpl(bikersService);
        final MotorcyclesCatalog motorcyclesCatalog = new MotorcyclesCatalogImpl(motorcyclesService);
        final MotorcycleClubsCatalog motorcycleClubsCatalog = new MotorcycleClubsCatalogImpl(motorcycleClubsServices);

        return new BikersServiceProviderImpl(bikersCatalog, motorcyclesCatalog, motorcycleClubsCatalog);
    }
}
