package io.nirahtech.ride4ever.registry.server;

import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.nirahtech.ride4ever.registry.common.MicroServiceCluster;
import io.nirahtech.ride4ever.registry.common.MicroServiceDescriptor;

public class MicroserviceRegistryController {

    private MicroserviceRegistryService registryService;

    public MicroserviceRegistryController(final MicroserviceRegistryService registryService) {
        this.registryService = registryService;
    }

    public final Handler register = (Context context) -> {
        final ObjectMapper mapper = new ObjectMapper();
        final MicroServiceDescriptor serviceDescriptor = mapper.readValue(context.body(), MicroServiceDescriptor.class);
        final MicroServiceCluster cluster = this.registryService.register(serviceDescriptor);
        context.json(cluster);
    };

    public final Handler lookup = (Context context) -> {
        final Optional<MicroServiceCluster> cluster = this.registryService.lookup(context.pathParam("name"));
        if (cluster.isPresent()) {
            context.json(cluster.get());
        } else {
            
        }
    };

    public final Handler discover = (Context context) -> {
        this.registryService.discoverAll();
    };

    public final Handler ping = (Context context) -> {
        this.registryService.ping(context.pathParam("name"));
    };

}
