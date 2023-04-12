/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.recovery.business.services.core;

import java.time.temporal.ChronoUnit;

import io.nirahtech.ride4ever.microservice.recovery.domain.entities.Recovery;


public final class GuardianThread extends Thread {

    private final int duration;
    private final ChronoUnit unit;
    private final Recovery recovery;
    private String code = null;
    
    public GuardianThread(final int duration, final ChronoUnit unit, final Recovery recovery) {
        this.duration = duration;
        this.unit = unit;
        this.recovery = recovery;
    }

    public final void setCode(final String code) {
        this.code = code;
    }

    public final String getCode() {
        return this.code;
    }

    @Override
    public void run() {
        super.run();
    }

    public void notifySuccess() {

    }

    public Recovery getRecovery() {
        return this.recovery;
    }

    public void terminate() {
        
    }

}
