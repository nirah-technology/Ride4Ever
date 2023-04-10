package io.nirahtech.ride4ever.bikers.common.data;

import java.time.LocalDate;

import io.nirahtech.ride4ever.core.data.Motorcycle;
import io.nirahtech.ride4ever.core.data.MotorcycleIdentifier;
import io.nirahtech.ride4ever.core.data.MotorcycleType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public final class RealMotorcycle implements Motorcycle {

    @Id
    private MotorcycleIdentifier identifier;
    private String brand;
    private String model;
    private int engineDisplacement;

    @Enumerated(EnumType.STRING)
    private MotorcycleType motorcycleType;
    private String licensePlate;

    @Temporal(TemporalType.DATE)
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