package io.nirahtech.ride4ever.core.data;

import java.io.Serializable;
import java.util.List;

public interface Garage extends Serializable {

    GarageIdentifier getIdentifier();
    List<Motorcycle> getMotorcycles();
}
