package io.nirahtech.ride4ever.microservice.account.interfaces.rest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.nirahtech.ride4ever.core.infrastructure.exceptions.ResourceNotFoundException;
import io.nirahtech.ride4ever.microservice.account.business.services.user.UserService;
import io.nirahtech.ride4ever.microservice.account.domain.entities.User;
import io.nirahtech.ride4ever.microservice.account.interfaces.api.Rest;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserRestController implements Rest<User> {

    @Autowired
    private UserService service;

    @PostMapping
    @ResponseBody
    @Override
    public User create(@RequestBody User entity) {
        this.service.create(entity);
        return entity;
    }

    @GetMapping("/{email}")
    @ResponseBody
    @Override
    public User read(@PathVariable("email") String email) {
        Optional<User> option = this.service.read(email);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(email.toString());
        }
        return option.get();
    }

    @PutMapping("/{email}")
    @ResponseBody
    @Override
    public User update(@PathVariable("email") String email, @RequestBody User entity) {
        Optional<User> option = this.service.read(email);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(email.toString());
        }
        return this.service.update(entity);
    }

    @DeleteMapping("/{email}")
    @ResponseBody
    @Override
    public void delete(@PathVariable("email") String email) {
        Optional<User> option = this.service.read(email);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(email.toString());
        }
        this.service.delete(email);
    }

    @GetMapping
    @ResponseBody
    public List<User> list(
            @RequestParam(required=false,defaultValue="0") final Integer page,
            @RequestParam(required=false,defaultValue="0") final Integer limit
        ) {
        List<User> entities = null;

        if (entities == null) {
            entities = this.service.findAll(PageRequest.of(page, limit)).toList();
        }

        if (limit > 0) {
            entities = entities.stream().limit(limit).collect(Collectors.toList());
        }
        return entities;
    }


}
