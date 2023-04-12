/******************************************************************
 * Copyright 2021 Ride4Ever
 * 
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.recovery.business.api;

import io.nirahtech.ride4ever.microservice.recovery.domain.entities.Recovery;

public interface ProcessRecoveryApi {
    Recovery findAccountByEmail(final String email) throws RuntimeException;
    Recovery sendCodeByEmailTo(final Recovery recovery) throws RuntimeException;
    Recovery sendCodeBySmsTo(final Recovery recovery) throws RuntimeException;
    Recovery verifyCode(final Recovery recovery) throws RuntimeException;
    Recovery changePassword(final Recovery recovery) throws RuntimeException;
}
