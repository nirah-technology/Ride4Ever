package io.ride4ever.bikers.common.data;

import java.time.LocalDate;

import io.ride4ever.core.data.ClubMember;
import jakarta.persistence.Entity;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public final class RealClubMember extends RealBiker implements ClubMember {

    private String role;

    @Temporal(TemporalType.DATE)
    private LocalDate entryDate;

    @Override
    public String getRole() {
        return this.role;
    }

    @Override
    public LocalDate getEntryDate() {
        return this.entryDate;
    }
    
}
