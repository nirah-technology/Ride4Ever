package io.ride4ever.microservice.biker.domain.entities;

import java.io.Serializable;

import java.sql.Timestamp;
import java.util.Objects;

import io.ride4ever.microservice.biker.infrastructure.enumeration.Blood;
import io.ride4ever.microservice.biker.infrastructure.enumeration.Gender;

/**
 * Human
 */
public abstract class Human implements Serializable {

    private String firstName;
    private String lastName;

    private Gender gender;

    private Timestamp birthDate;

    private Blood blood;
    private int weight;
    private boolean isOrganDonor;
    private boolean hadHaveOperations;
    private String allergies;


    public Human() {
    }

    public Human(String firstName, String lastName, Gender gender, Timestamp birthDate, Blood blood, int weight, boolean isOrganDonor, boolean hadHaveOperations, String allergies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.blood = blood;
        this.weight = weight;
        this.isOrganDonor = isOrganDonor;
        this.hadHaveOperations = hadHaveOperations;
        this.allergies = allergies;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Timestamp getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public Blood getBlood() {
        return this.blood;
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isIsOrganDonor() {
        return this.isOrganDonor;
    }

    public boolean getIsOrganDonor() {
        return this.isOrganDonor;
    }

    public void setIsOrganDonor(boolean isOrganDonor) {
        this.isOrganDonor = isOrganDonor;
    }

    public boolean isHadHaveOperations() {
        return this.hadHaveOperations;
    }

    public boolean getHadHaveOperations() {
        return this.hadHaveOperations;
    }

    public void setHadHaveOperations(boolean hadHaveOperations) {
        this.hadHaveOperations = hadHaveOperations;
    }

    public String getAllergies() {
        return this.allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public Human firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public Human lastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    public Human gender(Gender gender) {
        setGender(gender);
        return this;
    }

    public Human birthDate(Timestamp birthDate) {
        setBirthDate(birthDate);
        return this;
    }

    public Human blood(Blood blood) {
        setBlood(blood);
        return this;
    }

    public Human weight(int weight) {
        setWeight(weight);
        return this;
    }

    public Human isOrganDonor(boolean isOrganDonor) {
        setIsOrganDonor(isOrganDonor);
        return this;
    }

    public Human hadHaveOperations(boolean hadHaveOperations) {
        setHadHaveOperations(hadHaveOperations);
        return this;
    }

    public Human allergies(String allergies) {
        setAllergies(allergies);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Human)) {
            return false;
        }
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(gender, human.gender) && Objects.equals(birthDate, human.birthDate) && Objects.equals(blood, human.blood) && weight == human.weight && isOrganDonor == human.isOrganDonor && hadHaveOperations == human.hadHaveOperations && Objects.equals(allergies, human.allergies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, birthDate, blood, weight, isOrganDonor, hadHaveOperations, allergies);
    }

    @Override
    public String toString() {
        return "{" +
            " firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", gender='" + getGender() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", blood='" + getBlood() + "'" +
            ", weight='" + getWeight() + "'" +
            ", isOrganDonor='" + isIsOrganDonor() + "'" +
            ", hadHaveOperations='" + isHadHaveOperations() + "'" +
            ", allergies='" + getAllergies() + "'" +
            "}";
    }

    
}