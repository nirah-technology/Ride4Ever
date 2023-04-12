package io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member implements Serializable {
    
    @Id
    private String identifier;
    private Role role;
    private Timestamp memberSince;
    private String motorcycleClub;

    public Member() {
    }

    public Member(String identifier, Role role, Timestamp memberSince, String motorcycleClub) {
        this.identifier = identifier;
        this.role = role;
        this.memberSince = memberSince;
        this.motorcycleClub = motorcycleClub;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Timestamp getMemberSince() {
        return this.memberSince;
    }

    public void setMemberSince(Timestamp memberSince) {
        this.memberSince = memberSince;
    }

    public String getMotorcycleClub() {
        return this.motorcycleClub;
    }

    public void setMotorcycleClub(String motorcycleClub) {
        this.motorcycleClub = motorcycleClub;
    }

    public Member identifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    public Member role(Role role) {
        setRole(role);
        return this;
    }

    public Member memberSince(Timestamp memberSince) {
        setMemberSince(memberSince);
        return this;
    }

    public Member motorcycleClub(String motorcycleClub) {
        setMotorcycleClub(motorcycleClub);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Member)) {
            return false;
        }
        Member member = (Member) o;
        return Objects.equals(identifier, member.identifier) && Objects.equals(role, member.role) && Objects.equals(memberSince, member.memberSince) && Objects.equals(motorcycleClub, member.motorcycleClub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, role, memberSince, motorcycleClub);
    }

    @Override
    public String toString() {
        return "{" +
            " identifier='" + getIdentifier() + "'" +
            ", role='" + getRole() + "'" +
            ", memberSince='" + getMemberSince() + "'" +
            ", motorcycleClub='" + getMotorcycleClub() + "'" +
            "}";
    }

}
