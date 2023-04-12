package io.nirahtech.ride4ever.core.data;

import java.time.LocalDate;

/**
 * ClubMember
 */
public interface ClubMember extends Biker {
    
    String getRole();
    LocalDate getEntryDate();       
}