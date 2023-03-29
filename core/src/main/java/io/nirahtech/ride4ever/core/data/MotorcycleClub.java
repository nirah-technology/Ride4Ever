package io.nirahtech.ride4ever.core.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.stream.Stream;

public interface MotorcycleClub extends Serializable {
    MotorcycleClubIdentifier getIdentifier();

    String getName();
    LocalDate getCreationDate();

    Stream<ClubMember> getClubMembers();
    
}
