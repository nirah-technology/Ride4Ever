/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.garage.domain.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import io.nirahtech.ride4ever.microservice.garage.infrastructure.enumeration.Brand;
import io.nirahtech.ride4ever.microservice.garage.infrastructure.enumeration.MotorbikeType;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "licensePlate" }))
public class Motorbike implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identifier;
    private String licensePlate;
    private int mileage;
    @Enumerated(EnumType.STRING)
    private Brand brand;
    private String model;
    private String color;
    private int engineDisplacement;
    private int year;
    private int fuelTankSize;
    private String picture;
    @Enumerated(EnumType.STRING)
    private MotorbikeType type;
    private boolean isRestrained = false;
    private String owner = null;

    public Motorbike() {
    }

    public Motorbike(int identifier, String licensePlate, int mileage, Brand brand, String model, String color, int engineDisplacement, int year, int fuelTankSize, String picture, MotorbikeType type, boolean isRestrained, String owner) {
        this.identifier = identifier;
        this.licensePlate = licensePlate;
        this.mileage = mileage;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engineDisplacement = engineDisplacement;
        this.year = year;
        this.fuelTankSize = fuelTankSize;
        this.picture = picture;
        this.type = type;
        this.isRestrained = isRestrained;
        this.owner = owner;
    }

    public int getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Brand getBrand() {
        return this.brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngineDisplacement() {
        return this.engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getFuelTankSize() {
        return this.fuelTankSize;
    }

    public void setFuelTankSize(int fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public MotorbikeType getType() {
        return this.type;
    }

    public void setType(MotorbikeType type) {
        this.type = type;
    }

    public boolean isIsRestrained() {
        return this.isRestrained;
    }

    public boolean getIsRestrained() {
        return this.isRestrained;
    }

    public void setIsRestrained(boolean isRestrained) {
        this.isRestrained = isRestrained;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Motorbike identifier(int identifier) {
        setIdentifier(identifier);
        return this;
    }

    public Motorbike licensePlate(String licensePlate) {
        setLicensePlate(licensePlate);
        return this;
    }

    public Motorbike mileage(int mileage) {
        setMileage(mileage);
        return this;
    }

    public Motorbike brand(Brand brand) {
        setBrand(brand);
        return this;
    }

    public Motorbike model(String model) {
        setModel(model);
        return this;
    }

    public Motorbike color(String color) {
        setColor(color);
        return this;
    }

    public Motorbike engineDisplacement(int engineDisplacement) {
        setEngineDisplacement(engineDisplacement);
        return this;
    }

    public Motorbike year(int year) {
        setYear(year);
        return this;
    }

    public Motorbike fuelTankSize(int fuelTankSize) {
        setFuelTankSize(fuelTankSize);
        return this;
    }

    public Motorbike picture(String picture) {
        setPicture(picture);
        return this;
    }

    public Motorbike type(MotorbikeType type) {
        setType(type);
        return this;
    }

    public Motorbike isRestrained(boolean isRestrained) {
        setIsRestrained(isRestrained);
        return this;
    }

    public Motorbike owner(String owner) {
        setOwner(owner);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Motorbike)) {
            return false;
        }
        Motorbike motorbike = (Motorbike) o;
        return identifier == motorbike.identifier && Objects.equals(licensePlate, motorbike.licensePlate) && mileage == motorbike.mileage && Objects.equals(brand, motorbike.brand) && Objects.equals(model, motorbike.model) && Objects.equals(color, motorbike.color) && engineDisplacement == motorbike.engineDisplacement && year == motorbike.year && fuelTankSize == motorbike.fuelTankSize && Objects.equals(picture, motorbike.picture) && Objects.equals(type, motorbike.type) && isRestrained == motorbike.isRestrained && owner == motorbike.owner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, licensePlate, mileage, brand, model, color, engineDisplacement, year, fuelTankSize, picture, type, isRestrained, owner);
    }

    @Override
    public String toString() {
        return "{" +
            " identifier='" + getIdentifier() + "'" +
            ", licensePlate='" + getLicensePlate() + "'" +
            ", mileage='" + getMileage() + "'" +
            ", brand='" + getBrand() + "'" +
            ", model='" + getModel() + "'" +
            ", color='" + getColor() + "'" +
            ", engineDisplacement='" + getEngineDisplacement() + "'" +
            ", year='" + getYear() + "'" +
            ", fuelTankSize='" + getFuelTankSize() + "'" +
            ", picture='" + getPicture() + "'" +
            ", type='" + getType() + "'" +
            ", isRestrained='" + isIsRestrained() + "'" +
            ", owner='" + getOwner() + "'" +
            "}";
    }

}
