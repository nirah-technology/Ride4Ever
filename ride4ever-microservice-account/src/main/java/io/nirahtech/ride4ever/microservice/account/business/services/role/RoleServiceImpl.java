package io.nirahtech.ride4ever.microservice.account.business.services.role;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.nirahtech.ride4ever.microservice.account.domain.entities.Role;
import io.nirahtech.ride4ever.microservice.account.domain.repositories.RoleRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
// @Service("additionalMessageService")
@Component("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    public RoleServiceImpl() {
        
    }

    @Override
    public Role create(Role entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<Role> read(String email) {
        return this.repository.findById(email);
    }

    @Override
    public Role update(Role entity) {
        return this.repository.save(entity);
    }

    public void delete(String email) {
        Optional<Role> optional = this.read(email);
        if (optional.isPresent()) {
            this.repository.deleteById(email);
        }
    }
    @Override
    public Page<Role> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

}
