/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.geomap.old.address;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("addressRepository")
interface AddressRepository extends JpaRepository<Address, Integer> {
    List<Address> findByNumberAndStreetAndZipCodeAndCountry(int number, String street, int zipCode, Country country);
}
