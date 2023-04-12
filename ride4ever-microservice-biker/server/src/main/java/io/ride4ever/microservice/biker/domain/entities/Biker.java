package io.ride4ever.microservice.biker.domain.entities;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Biker
 */
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "phoneNumber" }))
public class Biker extends User {
    @Id
    private String email;
    private Timestamp drivingLicenseDate;

    private String phoneNumber;

    private String biography;

    private String work;

    private boolean canRepairMotorbike;
    private boolean isTrainedForFirstRescue;
    
    private boolean hadAllreadyRideWithPassenger = false;
    

    public Biker() {
    }

    public Biker(Timestamp drivingLicenseDate, String email, String phoneNumber, String biography, String work, boolean canRepairMotorbike, boolean isTrainedForFirstRescue, boolean hadAllreadyRideWithPassenger) {
        this.drivingLicenseDate = drivingLicenseDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.biography = biography;
        this.work = work;
        this.canRepairMotorbike = canRepairMotorbike;
        this.isTrainedForFirstRescue = isTrainedForFirstRescue;
        this.hadAllreadyRideWithPassenger = hadAllreadyRideWithPassenger;
    }

    public Timestamp getDrivingLicenseDate() {
        return this.drivingLicenseDate;
    }

    public void setDrivingLicenseDate(Timestamp drivingLicenseDate) {
        this.drivingLicenseDate = drivingLicenseDate;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBiography() {
        return this.biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getWork() {
        return this.work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public boolean isCanRepairMotorbike() {
        return this.canRepairMotorbike;
    }

    public boolean getCanRepairMotorbike() {
        return this.canRepairMotorbike;
    }

    public void setCanRepairMotorbike(boolean canRepairMotorbike) {
        this.canRepairMotorbike = canRepairMotorbike;
    }

    public boolean isIsTrainedForFirstRescue() {
        return this.isTrainedForFirstRescue;
    }

    public boolean getIsTrainedForFirstRescue() {
        return this.isTrainedForFirstRescue;
    }

    public void setIsTrainedForFirstRescue(boolean isTrainedForFirstRescue) {
        this.isTrainedForFirstRescue = isTrainedForFirstRescue;
    }

    public boolean isHadAllreadyRideWithPassenger() {
        return this.hadAllreadyRideWithPassenger;
    }

    public boolean getHadAllreadyRideWithPassenger() {
        return this.hadAllreadyRideWithPassenger;
    }

    public void setHadAllreadyRideWithPassenger(boolean hadAllreadyRideWithPassenger) {
        this.hadAllreadyRideWithPassenger = hadAllreadyRideWithPassenger;
    }

    public Biker drivingLicenseDate(Timestamp drivingLicenseDate) {
        setDrivingLicenseDate(drivingLicenseDate);
        return this;
    }

    public Biker email(String email) {
        setEmail(email);
        return this;
    }

    public Biker phoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    public Biker biography(String biography) {
        setBiography(biography);
        return this;
    }

    public Biker work(String work) {
        setWork(work);
        return this;
    }

    public Biker canRepairMotorbike(boolean canRepairMotorbike) {
        setCanRepairMotorbike(canRepairMotorbike);
        return this;
    }

    public Biker isTrainedForFirstRescue(boolean isTrainedForFirstRescue) {
        setIsTrainedForFirstRescue(isTrainedForFirstRescue);
        return this;
    }

    public Biker hadAllreadyRideWithPassenger(boolean hadAllreadyRideWithPassenger) {
        setHadAllreadyRideWithPassenger(hadAllreadyRideWithPassenger);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Biker)) {
            return false;
        }
        Biker biker = (Biker) o;
        return Objects.equals(drivingLicenseDate, biker.drivingLicenseDate) && Objects.equals(email, biker.email) && Objects.equals(phoneNumber, biker.phoneNumber) && Objects.equals(biography, biker.biography) && Objects.equals(work, biker.work) && canRepairMotorbike == biker.canRepairMotorbike && isTrainedForFirstRescue == biker.isTrainedForFirstRescue && hadAllreadyRideWithPassenger == biker.hadAllreadyRideWithPassenger;
    }

    @Override
    public int hashCode() {
        return Objects.hash(drivingLicenseDate, email, phoneNumber, biography, work, canRepairMotorbike, isTrainedForFirstRescue, hadAllreadyRideWithPassenger);
    }

    @Override
    public String toString() {
        return "{" +
            "drivingLicenseDate='" + getDrivingLicenseDate() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", biography='" + getBiography() + "'" +
            ", work='" + getWork() + "'" +
            ", canRepairMotorbike='" + isCanRepairMotorbike() + "'" +
            ", isTrainedForFirstRescue='" + isIsTrainedForFirstRescue() + "'" +
            ", hadAllreadyRideWithPassenger='" + isHadAllreadyRideWithPassenger() + "'" +
            "}";
    }


}