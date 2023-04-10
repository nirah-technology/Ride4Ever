package io.nirahtech.ride4ever.bikers.client.interfaces.providers;

import io.nirahtech.ride4ever.bikers.client.interfaces.catalogs.bikers.BikersCatalog;
import io.nirahtech.ride4ever.bikers.client.interfaces.catalogs.clubs.MotorcycleClubsCatalog;
import io.nirahtech.ride4ever.bikers.client.interfaces.catalogs.motorcycles.MotorcyclesCatalog;

public interface BikersServiceProvider {

    BikersCatalog getBikersCatalog();
    MotorcyclesCatalog getMotorcyclesCatalog();
    MotorcycleClubsCatalog getMotorcycleClubsCatalog();

}
