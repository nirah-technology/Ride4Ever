package io.nirahtech.ride4ever.bikers.common.data;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.core.data.Biker;
import io.nirahtech.ride4ever.core.data.BikerIdentifier;
import io.nirahtech.ride4ever.core.data.Email;
import io.nirahtech.ride4ever.core.data.Mail;
import io.nirahtech.ride4ever.core.data.Motorcycle;

/**
 * Biker
 */
public final class RealBiker implements Biker {

    private BikerIdentifier identifier;
    private String firstName;
    private String lastName;
    private String nickName;
    private LocalDate birthDate;
    private LocalDate registrationDate;
    private LocalDate obtainingDrivingLicenseDate;
    private Mail mail;
    private Email email;
    private String phoneNumber;
    private boolean isPremiumMember;
    private Set<Motorcycle> motorcycles;

    @Override
    public BikerIdentifier getIdentifier() {
        return this.identifier;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getNickName() {
        return this.nickName;
    }

    @Override
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    @Override
    public LocalDate getObtainingDrivingLicenseDate() {
        return this.obtainingDrivingLicenseDate;
    }

    @Override
    public Mail getMail() {
        return this.mail;
    }

    @Override
    public Email getEmail() {
        return this.email;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public boolean isPremiumMember() {
        return this.isPremiumMember;
    }

    @Override
    public Stream<Motorcycle> getMotorcycles() {
        return this.motorcycles.stream();
    }

    
}