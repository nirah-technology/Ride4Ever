package io.nirahtech.ride4ever.microservice.motorcycleclub.business.services.member;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.Member;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.repositories.MemberRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
// @Service("additionalMessageService")
@Component("memberService")
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository repository;

    public MemberServiceImpl() {
        
    }

    @Override
    public Member create(Member entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<Member> read(String id) {
        return this.repository.findById(id);
    }

    @Override
    public Member update(Member entity) {
        return this.repository.save(entity);
    }

    public void delete(String id) {
        Optional<Member> optional = this.read(id);
        if (optional.isPresent()) {
            this.repository.deleteById(id);
        }
    }
    @Override
    public Page<Member> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

}
