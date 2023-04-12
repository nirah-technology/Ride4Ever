/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.geomap.old.location;

import com.ip2location.IPResult;

public interface LocationApi {
    IPResult resolve(final String ipAddress);
    String resolve(final double latitude, final double longitude);
}
