package io.nirahtech.ride4ever.bikers.common.data;

import java.time.LocalDate;

import io.nirahtech.ride4ever.core.data.Biker;
import io.nirahtech.ride4ever.core.data.BikerIdentifier;
import io.nirahtech.ride4ever.core.data.Email;
import io.nirahtech.ride4ever.core.data.Garage;
import io.nirahtech.ride4ever.core.data.Mail;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class RealBiker implements Biker {

    @EmbeddedId
    private BikerIdentifier identifier;

    private String firstName;
    private String lastName;
    private String nickName;

    @Temporal(TemporalType.DATE)
    private LocalDate birthDate;

    @Temporal(TemporalType.DATE)
    private LocalDate registrationDate;

    @Temporal(TemporalType.DATE)
    private LocalDate obtainingDrivingLicenseDate;

    @Embedded
    private Mail mail;

    @Embedded
    private Email email;
    private String phoneNumber;
    private boolean isPremiumMember;
    private boolean isMedicalTraining;
    private boolean isTrainedInMechanics;

    @OneToOne(cascade = CascadeType.ALL, targetEntity = RealGarage.class)
    private Garage garage;

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
    public Garage getGarage() {
        return this.garage;
    }

    @Override
    public boolean isMedicalTraining() {
        return this.isMedicalTraining;
    }

    @Override
    public boolean isTrainedInMechanics() {
        return this.isTrainedInMechanics;
    }

    public void setIdentifier(BikerIdentifier identifier) {
        this.identifier = identifier;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setObtainingDrivingLicenseDate(LocalDate obtainingDrivingLicenseDate) {
        this.obtainingDrivingLicenseDate = obtainingDrivingLicenseDate;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPremiumMember(boolean isPremiumMember) {
        this.isPremiumMember = isPremiumMember;
    }

    public void setMedicalTraining(boolean isMedicalTraining) {
        this.isMedicalTraining = isMedicalTraining;
    }

    public void setTrainedInMechanics(boolean isTrainedInMechanics) {
        this.isTrainedInMechanics = isTrainedInMechanics;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
        result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
        result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
        result = prime * result + ((obtainingDrivingLicenseDate == null) ? 0 : obtainingDrivingLicenseDate.hashCode());
        result = prime * result + ((mail == null) ? 0 : mail.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + (isPremiumMember ? 1231 : 1237);
        result = prime * result + (isMedicalTraining ? 1231 : 1237);
        result = prime * result + (isTrainedInMechanics ? 1231 : 1237);
        result = prime * result + ((garage == null) ? 0 : garage.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RealBiker other = (RealBiker) obj;
        if (identifier == null) {
            if (other.identifier != null)
                return false;
        } else if (!identifier.equals(other.identifier))
            return false;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (nickName == null) {
            if (other.nickName != null)
                return false;
        } else if (!nickName.equals(other.nickName))
            return false;
        if (birthDate == null) {
            if (other.birthDate != null)
                return false;
        } else if (!birthDate.equals(other.birthDate))
            return false;
        if (registrationDate == null) {
            if (other.registrationDate != null)
                return false;
        } else if (!registrationDate.equals(other.registrationDate))
            return false;
        if (obtainingDrivingLicenseDate == null) {
            if (other.obtainingDrivingLicenseDate != null)
                return false;
        } else if (!obtainingDrivingLicenseDate.equals(other.obtainingDrivingLicenseDate))
            return false;
        if (mail == null) {
            if (other.mail != null)
                return false;
        } else if (!mail.equals(other.mail))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (isPremiumMember != other.isPremiumMember)
            return false;
        if (isMedicalTraining != other.isMedicalTraining)
            return false;
        if (isTrainedInMechanics != other.isTrainedInMechanics)
            return false;
        if (garage == null) {
            if (other.garage != null)
                return false;
        } else if (!garage.equals(other.garage))
            return false;
        return true;
    }

    @Override
    public int compareTo(Biker other) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;
        if (this == other)
            return EQUAL;

        // primitive numbers follow this form
        if (this.identifier.getIdentifier() < other.getIdentifier().getIdentifier())
            return BEFORE;
        if (this.identifier.getIdentifier() > other.getIdentifier().getIdentifier())
            return AFTER;
        
        int comparison;

        comparison = this.lastName.compareTo(other.getLastName());
        if (comparison != EQUAL)
            return comparison;

        comparison = this.firstName.compareTo(other.getFirstName());
        if (comparison != EQUAL)
            return comparison;
            
        comparison = this.email.toString().compareTo(other.getEmail().toString());
        if (comparison != EQUAL)
            return comparison;

        comparison = this.mail.toString().compareTo(other.getMail().toString());
        if (comparison != EQUAL)
            return comparison;

        // all comparisons have yielded equality
        // verify that compareTo is consistent with equals (optional)
        assert this.equals(other) : "compareTo inconsistent with equals.";

        return EQUAL;
    }

}