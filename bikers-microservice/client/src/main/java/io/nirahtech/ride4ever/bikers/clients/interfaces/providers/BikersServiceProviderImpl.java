package io.nirahtech.ride4ever.bikers.clients.interfaces.providers;

import io.nirahtech.ride4ever.bikers.clients.interfaces.catalogs.bikers.BikersCatalog;
import io.nirahtech.ride4ever.bikers.clients.interfaces.catalogs.clubs.MotorcycleClubsCatalog;
import io.nirahtech.ride4ever.bikers.clients.interfaces.catalogs.motorcycles.MotorcyclesCatalog;

public final class BikersServiceProviderImpl implements BikersServiceProvider {

    private final BikersCatalog bikersCatalog;
    private final MotorcyclesCatalog motorcyclesCatalog;
    private final MotorcycleClubsCatalog motorcycleClubsCatalog;

    BikersServiceProviderImpl(BikersCatalog bikersCatalog, MotorcyclesCatalog motorcyclesCatalog,
            MotorcycleClubsCatalog motorcycleClubsCatalog) {
        this.bikersCatalog = bikersCatalog;
        this.motorcyclesCatalog = motorcyclesCatalog;
        this.motorcycleClubsCatalog = motorcycleClubsCatalog;
    }

    @Override
    public final BikersCatalog getBikersCatalog() {
        return this.bikersCatalog;
    }

    @Override
    public final MotorcyclesCatalog getMotorcyclesCatalog() {
        return this.motorcyclesCatalog;
    }

    @Override
    public final MotorcycleClubsCatalog getMotorcycleClubsCatalog() {
        return this.motorcycleClubsCatalog;
    }
}
