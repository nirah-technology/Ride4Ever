package io.ride4ever.microservice.biker.domain.entities;

import java.io.File;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * InnerHuman
 */
public class User extends Human {
    private String pseudo;
    private File picture;
    private Timestamp registrationDate;

    private int level;

    public User() {
    }

    public User(String pseudo, File picture, Timestamp registrationDate, int level) {
        this.pseudo = pseudo;
        this.picture = picture;
        this.registrationDate = registrationDate;
        this.level = level;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public File getPicture() {
        return this.picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    public Timestamp getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(Timestamp registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public User pseudo(String pseudo) {
        setPseudo(pseudo);
        return this;
    }

    public User picture(File picture) {
        setPicture(picture);
        return this;
    }

    public User registrationDate(Timestamp registrationDate) {
        setRegistrationDate(registrationDate);
        return this;
    }

    public User level(int level) {
        setLevel(level);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(pseudo, user.pseudo) && Objects.equals(picture, user.picture) && Objects.equals(registrationDate, user.registrationDate) && level == user.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pseudo, picture, registrationDate, level);
    }

    @Override
    public String toString() {
        return "{" +
            " pseudo='" + getPseudo() + "'" +
            ", picture='" + getPicture() + "'" +
            ", registrationDate='" + getRegistrationDate() + "'" +
            ", level='" + getLevel() + "'" +
            "}";
    }


}