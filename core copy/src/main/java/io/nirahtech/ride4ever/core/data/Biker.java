package io.nirahtech.ride4ever.core.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.stream.Stream;

/**
 * Biker
 */
public interface Biker extends Serializable, Comparable<Biker> {
    BikerIdentifier getIdentifier();

    String getFirstName();
    String getLastName();
    String getNickName();

    LocalDate getBirthDate();
    LocalDate getRegistrationDate();
    LocalDate getObtainingDrivingLicenseDate();

    Mail getMail();
    Email getEmail();
    String getPhoneNumber();

    boolean isPremiumMember();
    
    boolean isMedicalTraining();
    boolean isTrainedInMechanics();

    Garage getGarage();
}