/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.recovery.interfaces.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.nirahtech.ride4ever.microservice.recovery.business.api.ProcessRecoveryApi;
import io.nirahtech.ride4ever.microservice.recovery.business.services.recovery.RecoveryService;
import io.nirahtech.ride4ever.microservice.recovery.domain.entities.Recovery;

@CrossOrigin("*")
@RequestMapping("/recovery")
@RestController
public final class RecoveryRestController implements ProcessRecoveryApi {

    @Autowired
    private RecoveryService service;

    @PostMapping("/search-account")
    @ResponseBody
    public Recovery findAccountByEmail(String email) throws RuntimeException {
        return this.service.findAccountByEmail(email);
    }

    @PostMapping("/send-email")
    @ResponseBody
    public Recovery sendCodeByEmailTo(Recovery recovery) throws RuntimeException {
        return this.service.sendCodeByEmailTo(recovery);
    }

    @PostMapping("/send-sms")
    @ResponseBody
    public Recovery sendCodeBySmsTo(Recovery recovery) throws RuntimeException {
        return this.service.sendCodeBySmsTo(recovery);
    }

    @PostMapping("/validate-code")
    @ResponseBody
    public Recovery verifyCode(Recovery recovery) throws RuntimeException {
        return this.service.verifyCode(recovery);
    }

    @PostMapping("/change-password")
    @ResponseBody
    public Recovery changePassword(Recovery recovery) throws RuntimeException {
        return this.service.changePassword(recovery);
    }

    
}
