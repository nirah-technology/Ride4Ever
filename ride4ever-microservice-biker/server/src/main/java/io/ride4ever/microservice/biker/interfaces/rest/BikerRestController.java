package io.ride4ever.microservice.biker.interfaces.rest;

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

import io.ride4ever.microservice.biker.business.services.biker.BikerService;
import io.ride4ever.microservice.biker.domain.entities.Biker;
import io.ride4ever.microservice.biker.interfaces.api.Rest;

/**
 * @author METIVIER Nicolas
 * @since 0.0.1
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/bikers")
public class BikerRestController implements Rest<Biker> {

    @Autowired
    private BikerService service;

    @PostMapping
    @ResponseBody
    @Override
    public Biker create(@RequestBody Biker entity) {
        this.service.create(entity);
        return entity;
    }

    @GetMapping("/{identifier}")
    @ResponseBody
    @Override
    public Biker read(@PathVariable("identifier") String identifier) {
        Optional<Biker> option = this.service.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier);
        }
        return option.get();
    }

    @PutMapping("/{identifier}")
    @ResponseBody
    @Override
    public Biker update(@PathVariable("identifier") String identifier, @RequestBody Biker entity) {
        Optional<Biker> option = this.service.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier.toString());
        }
        return this.service.update(entity);
    }

    @DeleteMapping("/{identifier}")
    @ResponseBody
    @Override
    public void delete(@PathVariable("identifier") String identifier) {
        Optional<Biker> option = this.service.read(identifier);
        if (option.isEmpty()) {
            throw new ResourceNotFoundException(identifier);
        }
        this.service.delete(identifier);
    }

    @GetMapping
    @ResponseBody
    public List<Biker> list(
            @RequestParam(required=false,defaultValue="1") final Integer page,
            @RequestParam(required=false,defaultValue="100") final Integer limit
        ) {
        List<Biker> entities = null;

        if (entities == null) {
            entities = this.service.findAll(PageRequest.of(page, limit)).toList();
        }

        if (limit > 0) {
            entities = entities.stream().limit(limit).collect(Collectors.toList());
        }
        return entities;
    }


}
