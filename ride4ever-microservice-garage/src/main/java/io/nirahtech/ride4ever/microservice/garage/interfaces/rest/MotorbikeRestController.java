package io.nirahtech.ride4ever.microservice.garage.interfaces.rest;

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
import io.nirahtech.ride4ever.core.interfaces.api.Rest;
import io.nirahtech.ride4ever.microservice.garage.business.services.motorbike.MotorbikeService;
import io.nirahtech.ride4ever.microservice.garage.domain.entities.Motorbike;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/motorbikes")
public class MotorbikeRestController implements Rest<Motorbike> {

    @Autowired
    private MotorbikeService motorbikeService;

    @PostMapping
    @ResponseBody
    @Override
    public Motorbike create(@RequestBody Motorbike entity) {
        this.motorbikeService.create(entity);
        return entity;
    }

    @GetMapping("/{identifier}")
    @ResponseBody
    @Override
    public Motorbike read(@PathVariable("identifier") Long identifier) {
        Optional<Motorbike> option = this.motorbikeService.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier.toString());
        }
        return option.get();
    }

    @PutMapping("/{identifier}")
    @ResponseBody
    @Override
    public Motorbike update(@PathVariable("identifier") Long identifier, @RequestBody Motorbike entity) {
        Optional<Motorbike> option = this.motorbikeService.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier.toString());
        }
        return this.motorbikeService.update(entity);
    }

    @DeleteMapping("/{identifier}")
    @ResponseBody
    @Override
    public void delete(@PathVariable("identifier") Long identifier) {
        Optional<Motorbike> option = this.motorbikeService.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier.toString());
        }
        this.motorbikeService.delete(identifier);
    }

    @GetMapping
    @ResponseBody
    public List<Motorbike> list(
            @RequestParam(required=false,defaultValue="0") final Integer page,
            @RequestParam(required=false,defaultValue="0") final Integer size,
            @RequestParam(required=false,defaultValue="null") final String owner
        ) {
        List<Motorbike> entities = null;

        if (entities == null) {
            entities = this.motorbikeService.findAll(PageRequest.of(page, size)).toList();
        }
        
        if (owner != null) {
            entities = entities.stream().filter(data -> data.getOwner().equalsIgnoreCase(owner)).collect(Collectors.toList());
        } else {
            entities = this.motorbikeService.findAllByOwner(owner);
        }
        return entities;
    }


}
