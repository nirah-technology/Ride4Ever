/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class MotorcycleClub implements Serializable {

    @Id
    private String name;

    @ManyToMany
    @JoinTable(name="MC_MEMBERS")
    private Set<Member> members = new HashSet<>();

    public MotorcycleClub() {
    }

    public MotorcycleClub(String name, Set<Member> members) {
        this.name = name;
        this.members = members;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Member> getMembers() {
        return this.members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

    public MotorcycleClub name(String name) {
        setName(name);
        return this;
    }

    public MotorcycleClub members(Set<Member> members) {
        setMembers(members);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MotorcycleClub)) {
            return false;
        }
        MotorcycleClub motorcycleClub = (MotorcycleClub) o;
        return Objects.equals(name, motorcycleClub.name) && Objects.equals(members, motorcycleClub.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, members);
    }

    @Override
    public String toString() {
        return "{" +
            "name='" + getName() + "'" +
            ", members='" + getMembers() + "'" +
            "}";
    }

}
