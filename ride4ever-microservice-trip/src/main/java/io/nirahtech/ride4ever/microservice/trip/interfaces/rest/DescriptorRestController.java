package io.nirahtech.ride4ever.microservice.trip.interfaces.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.nirahtech.ride4ever.core.infrastructure.plugin.api.Descriptor;
import io.nirahtech.ride4ever.core.infrastructure.plugin.model.PluginDescriptor;

@RestController
@CrossOrigin("*")
@RequestMapping("/descriptor")
public class DescriptorRestController {
    @Value("${application.groupId}")
    private String groupId;

    @Value("${application.artifactId}")
    private String artifactId;

    @Value("${application.version}")
    private String version;

    @Value("${spring.application.name}")
    private String name;

    private Descriptor descriptor = new PluginDescriptor(this.groupId,this.artifactId,this.version,this.name,null);
    
    @GetMapping
    public Descriptor getDescriptor() {
        return this.descriptor;
    }
}
