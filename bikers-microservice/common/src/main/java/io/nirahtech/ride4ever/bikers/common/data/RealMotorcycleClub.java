package io.nirahtech.ride4ever.bikers.common.data;

import java.time.LocalDate;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.core.data.ClubMember;
import io.nirahtech.ride4ever.core.data.MotorcycleClub;
import io.nirahtech.ride4ever.core.data.MotorcycleClubIdentifier;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public final class RealMotorcycleClub implements MotorcycleClub {

    @Id
    private MotorcycleClubIdentifier identifier;
    private String name;

    @Temporal(TemporalType.DATE)
    private LocalDate creationDate;

    @OneToMany
    private Set<ClubMember> clubMembers;

    @Override
    public MotorcycleClubIdentifier getIdentifier() {
        return this.identifier;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public LocalDate getCreationDate() {
        return this.creationDate;
    }

    @Override
    public Stream<ClubMember> getClubMembers() {
        return this.clubMembers.stream();
    }
    
}
