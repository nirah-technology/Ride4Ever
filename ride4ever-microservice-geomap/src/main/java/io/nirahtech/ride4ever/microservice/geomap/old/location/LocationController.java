/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.geomap.old.location;

import com.ip2location.IPResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RequestMapping("/locations")
@RestController
public final class LocationController implements LocationApi {
    
    @Autowired
    private LocationService service;

    @GetMapping("/ip-lookup")
    @Override
    public IPResult resolve(@RequestParam(required=true) final String ipAddress) {
        return this.service.resolve(ipAddress);
    }

    @GetMapping("coordinates-lookup")
    @Override
    public String resolve(@RequestParam(required=true) double latitude, @RequestParam(required=true) double longitude) {
        return this.service.resolve(latitude, longitude);
    }
    
}
