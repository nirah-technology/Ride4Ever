package io.ride4ever.bikers.common.data;

import java.util.List;

import io.ride4ever.core.data.Garage;
import io.ride4ever.core.data.GarageIdentifier;
import io.ride4ever.core.data.Motorcycle;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class RealGarage implements Garage {
    
    @EmbeddedId
    private GarageIdentifier identifier;

    private List<Motorcycle> motorcycles;

    @Override
    public GarageIdentifier getIdentifier() {
        return this.identifier;
    }

    @Override
    public List<Motorcycle> getMotorcycles() {
        return this.motorcycles;
    }
    
}
