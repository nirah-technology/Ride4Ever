package io.nirahtech.ride4ever.bikers.common.data;

import java.time.LocalDate;

import io.nirahtech.ride4ever.core.data.Motorcycle;
import io.nirahtech.ride4ever.core.data.MotorcycleIdentifier;
import io.nirahtech.ride4ever.core.data.MotorcycleType;

/**
 * Biker
 */
public final class RealMotorcycle implements Motorcycle {

    private MotorcycleIdentifier identifier;
    private String brand;
    private String model;
    private int engineDisplacement;

    private MotorcycleType motorcycleType;
    private String licensePlate;
    private LocalDate firstCirculationDate;

    @Override
    public MotorcycleIdentifier getIdentifier() {
        return this.identifier;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getEngineDisplacement() {
        return this.engineDisplacement;
    }

    @Override
    public MotorcycleType getMotorcycleType() {
        return this.motorcycleType;
    }

    @Override
    public String getLicensePlate() {
        return this.licensePlate;
    }

    @Override
    public LocalDate getFirstCirculationDate() {
        return this.firstCirculationDate;
    }

    
}