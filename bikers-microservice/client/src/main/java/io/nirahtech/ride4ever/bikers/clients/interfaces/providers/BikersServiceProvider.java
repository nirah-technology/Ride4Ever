package io.nirahtech.ride4ever.bikers.clients.interfaces.providers;

import io.nirahtech.ride4ever.bikers.clients.interfaces.catalogs.bikers.BikersCatalog;
import io.nirahtech.ride4ever.bikers.clients.interfaces.catalogs.clubs.MotorcycleClubsCatalog;
import io.nirahtech.ride4ever.bikers.clients.interfaces.catalogs.motorcycles.MotorcyclesCatalog;

public interface BikersServiceProvider {

    BikersCatalog getBikersCatalog();
    MotorcyclesCatalog getMotorcyclesCatalog();
    MotorcycleClubsCatalog getMotorcycleClubsCatalog();

}
