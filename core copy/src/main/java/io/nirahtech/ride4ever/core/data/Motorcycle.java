package io.nirahtech.ride4ever.core.data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Motorcycle
 */
public interface Motorcycle extends Serializable {
    MotorcycleIdentifier getIdentifier();
    
    String getBrand();
    String getModel();
    int getEngineDisplacement();
    MotorcycleType getMotorcycleType();
    String getLicensePlate();
    LocalDate getFirstCirculationDate();    
}