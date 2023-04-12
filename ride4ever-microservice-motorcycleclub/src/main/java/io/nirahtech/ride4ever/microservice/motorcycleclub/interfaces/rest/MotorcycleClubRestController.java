package io.nirahtech.ride4ever.microservice.motorcycleclub.interfaces.rest;

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
import io.nirahtech.ride4ever.microservice.motorcycleclub.business.services.club.MotorcycleClubService;
import io.nirahtech.ride4ever.microservice.motorcycleclub.domain.entities.MotorcycleClub;
import io.nirahtech.ride4ever.microservice.motorcycleclub.interfaces.api.Rest;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/motorcycleClubs")
public class MotorcycleClubRestController implements Rest<MotorcycleClub> {

    @Autowired
    private MotorcycleClubService service;

    @PostMapping
    @ResponseBody
    @Override
    public MotorcycleClub create(@RequestBody MotorcycleClub entity) {
        this.service.create(entity);
        return entity;
    }

    @GetMapping("/{identifier}")
    @ResponseBody
    @Override
    public MotorcycleClub read(@PathVariable("identifier") String identifier) {
        Optional<MotorcycleClub> option = this.service.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier.toString());
        }
        return option.get();
    }

    @PutMapping("/{identifier}")
    @ResponseBody
    @Override
    public MotorcycleClub update(@PathVariable("identifier") String identifier, @RequestBody MotorcycleClub entity) {
        Optional<MotorcycleClub> option = this.service.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier.toString());
        }
        return this.service.update(entity);
    }

    @DeleteMapping("/{identifier}")
    @ResponseBody
    @Override
    public void delete(@PathVariable("identifier") String identifier) {
        Optional<MotorcycleClub> option = this.service.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier.toString());
        }
        this.service.delete(identifier);
    }

    @GetMapping
    @ResponseBody
    public List<MotorcycleClub> list(
            @RequestParam(required=false,defaultValue="0") final Integer page,
            @RequestParam(required=false,defaultValue="0") final Integer limit
        ) {
        List<MotorcycleClub> entities = null;

        if (entities == null) {
            entities = this.service.findAll(PageRequest.of(page, limit)).toList();
        }

        if (limit > 0) {
            entities = entities.stream().limit(limit).collect(Collectors.toList());
        }
        return entities;
    }


}
