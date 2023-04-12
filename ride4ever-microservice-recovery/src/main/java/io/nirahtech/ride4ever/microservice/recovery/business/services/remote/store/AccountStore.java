package io.nirahtech.ride4ever.microservice.recovery.business.services.remote.store;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import feign.RequestLine;
import io.nirahtech.ride4ever.microservice.recovery.business.services.remote.model.User;

@Component
@FeignClient("RIDE4EVER-MICROSERVICE-ACCOUNT")
public interface AccountStore {

    @RequestLine("GET /users/{email}")
    User findByEmail(@Param("email") String email);
}
