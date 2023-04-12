package io.nirahtech.ride4ever.microservice.motorcycleclub.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.api.MemberApi;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.Member;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@Repository("memberRepository")
public interface MemberRepository extends JpaRepository<Member, String>, MemberApi {
    
}
