package io.nirahtech.ride4ever.core.data;

public final class Mail {

    private final int streetNumber;
    private final String streetType;
    private final String streetName;

    private final int zipCode;
    private final String city;
    private final String disctrict;
    private final String country;

    public Mail(int streetNumber, String streetType, String streetName, int zipCode, String city, String disctrict, String country) {
        this.streetNumber = streetNumber;
        this.streetType = streetType;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.city = city;
        this.disctrict = disctrict;
        this.country = country;
    }

    public final int getStreetNumber() {
        return this.streetNumber;
    }

    public final String getStreetType() {
        return this.streetType;
    }

    public final String getStreetName() {
        return this.streetName;
    }
    public final int getZipCode() {
        return this.zipCode;
    }
    public final String getCity() {
        return this.city;
    }

    public final String getDisctrict() {
        return this.disctrict;
    }

    public final String getCountry() {
        return this.country;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s, %s, %s, %s", 
            this.streetNumber, 
            this.streetType, 
            this.streetName, 
            this.zipCode, 
            this.city, 
            this.disctrict, 
            this.country);
    }

}
