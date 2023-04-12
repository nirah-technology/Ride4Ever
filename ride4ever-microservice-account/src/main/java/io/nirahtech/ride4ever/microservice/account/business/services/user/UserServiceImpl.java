package io.nirahtech.ride4ever.microservice.account.business.services.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import io.nirahtech.ride4ever.microservice.account.domain.entities.User;
import io.nirahtech.ride4ever.microservice.account.domain.repositories.UserRepository;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
// @Service("additionalMessageService")
@Component("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    public UserServiceImpl() {
        
    }

    @Override
    public User create(User entity) {
        return this.repository.save(entity);
    }

    @Override
    public Optional<User> read(String email) {
        return this.repository.findById(email);
    }

    @Override
    public User update(User entity) {
        return this.repository.save(entity);
    }

    public void delete(String email) {
        Optional<User> optional = this.read(email);
        if (optional.isPresent()) {
            this.repository.deleteById(email);
        }
    }
    @Override
    public Page<User> findAll(Pageable pageable) {
        return this.repository.findAll(pageable);
    }

}
