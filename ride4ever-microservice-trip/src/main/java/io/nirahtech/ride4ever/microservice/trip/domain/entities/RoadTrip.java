package io.nirahtech.ride4ever.microservice.trip.domain.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.nirahtech.ride4ever.microservice.trip.infrastructure.enumeration.RoadTripStatus;
import io.nirahtech.ride4ever.microservice.trip.infrastructure.enumeration.RoadTripType;


@Entity
public class RoadTrip implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifier;

    @Column(nullable = false)
    private String title;
    private String description = null;

    private String organizer;

    private int maxBikers = 0;

    @Enumerated(EnumType.STRING)
    private RoadTripType roadTripType;

    
    @Enumerated(EnumType.STRING)
    private RoadTripStatus status;

    @Column(nullable = false)
    private Timestamp startDate;
    private Timestamp endDate;

    @ManyToOne
    @JoinColumn(name="start_address_id")
    private Address startAddress;

    @ManyToOne
    @JoinColumn(name="stop_address_id")
    private Address stopAddress;

    private int kilometersAverage;


    public RoadTrip() {
    }

    public RoadTrip(int identifier, String title, String description, String organizer, int maxBikers, RoadTripType roadTripType, RoadTripStatus status, Timestamp startDate, Timestamp endDate, Address startAddress, Address stopAddress, int kilometersAverage) {
        this.identifier = identifier;
        this.title = title;
        this.description = description;
        this.organizer = organizer;
        this.maxBikers = maxBikers;
        this.roadTripType = roadTripType;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startAddress = startAddress;
        this.stopAddress = stopAddress;
        this.kilometersAverage = kilometersAverage;
    }

    public int getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrganizer() {
        return this.organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public int getMaxBikers() {
        return this.maxBikers;
    }

    public void setMaxBikers(int maxBikers) {
        this.maxBikers = maxBikers;
    }

    public RoadTripType getRoadTripType() {
        return this.roadTripType;
    }

    public void setRoadTripType(RoadTripType roadTripType) {
        this.roadTripType = roadTripType;
    }

    public RoadTripStatus getStatus() {
        return this.status;
    }

    public void setStatus(RoadTripStatus status) {
        this.status = status;
    }

    public Timestamp getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Address getStartAddress() {
        return this.startAddress;
    }

    public void setStartAddress(Address startAddress) {
        this.startAddress = startAddress;
    }

    public Address getStopAddress() {
        return this.stopAddress;
    }

    public void setStopAddress(Address stopAddress) {
        this.stopAddress = stopAddress;
    }

    public int getKilometersAverage() {
        return this.kilometersAverage;
    }

    public void setKilometersAverage(int kilometersAverage) {
        this.kilometersAverage = kilometersAverage;
    }

    public RoadTrip identifier(int identifier) {
        setIdentifier(identifier);
        return this;
    }

    public RoadTrip title(String title) {
        setTitle(title);
        return this;
    }

    public RoadTrip description(String description) {
        setDescription(description);
        return this;
    }

    public RoadTrip organizer(String organizer) {
        setOrganizer(organizer);
        return this;
    }

    public RoadTrip maxBikers(int maxBikers) {
        setMaxBikers(maxBikers);
        return this;
    }

    public RoadTrip roadTripType(RoadTripType roadTripType) {
        setRoadTripType(roadTripType);
        return this;
    }

    public RoadTrip status(RoadTripStatus status) {
        setStatus(status);
        return this;
    }

    public RoadTrip startDate(Timestamp startDate) {
        setStartDate(startDate);
        return this;
    }

    public RoadTrip endDate(Timestamp endDate) {
        setEndDate(endDate);
        return this;
    }

    public RoadTrip startAddress(Address startAddress) {
        setStartAddress(startAddress);
        return this;
    }

    public RoadTrip stopAddress(Address stopAddress) {
        setStopAddress(stopAddress);
        return this;
    }

    public RoadTrip kilometersAverage(int kilometersAverage) {
        setKilometersAverage(kilometersAverage);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RoadTrip)) {
            return false;
        }
        RoadTrip roadTrip = (RoadTrip) o;
        return identifier == roadTrip.identifier && Objects.equals(title, roadTrip.title) && Objects.equals(description, roadTrip.description) && Objects.equals(organizer, roadTrip.organizer) && maxBikers == roadTrip.maxBikers && Objects.equals(roadTripType, roadTrip.roadTripType) && Objects.equals(status, roadTrip.status) && Objects.equals(startDate, roadTrip.startDate) && Objects.equals(endDate, roadTrip.endDate) && Objects.equals(startAddress, roadTrip.startAddress) && Objects.equals(stopAddress, roadTrip.stopAddress) && kilometersAverage == roadTrip.kilometersAverage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, title, description, organizer, maxBikers, roadTripType, status, startDate, endDate, startAddress, stopAddress, kilometersAverage);
    }

    @Override
    public String toString() {
        return "{" +
            " identifier='" + getIdentifier() + "'" +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", organizer='" + getOrganizer() + "'" +
            ", maxBikers='" + getMaxBikers() + "'" +
            ", roadTripType='" + getRoadTripType() + "'" +
            ", status='" + getStatus() + "'" +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", startAddress='" + getStartAddress() + "'" +
            ", stopAddress='" + getStopAddress() + "'" +
            ", kilometersAverage='" + getKilometersAverage() + "'" +
            "}";
    }


}