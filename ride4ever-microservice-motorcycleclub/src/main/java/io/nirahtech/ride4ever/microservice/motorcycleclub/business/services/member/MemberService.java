package io.nirahtech.ride4ever.microservice.motorcycleclub.business.services.member;

import io.nirahtech.ride4ever.microservice.motorcycleclub.business.api.Crud;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.api.MemberApi;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.Member;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
public interface MemberService extends Crud<Member>, MemberApi {
    
}
