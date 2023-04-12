package io.nirahtech.ride4ever.registry.server;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import io.nirahtech.ride4ever.registry.common.MicroServiceCluster;
import io.nirahtech.ride4ever.registry.common.MicroServiceDescriptor;
import io.nirahtech.ride4ever.registry.common.MicroServiceInstance;

public class InMemoryMicroserviceRegistryRepository implements MicroserviceRegistryRepository {
    private final Map<String, MicroServiceCluster> datasource = new HashMap<>();

    @Override
    public Optional<MicroServiceCluster> lookup(String microServiceName) {
        Optional<MicroServiceCluster> cluster = Optional.empty();
        if (this.datasource.containsKey(microServiceName)) {
            cluster = Optional.ofNullable(this.datasource.get(microServiceName));
        }
        return cluster;
    }

    @Override
    public Set<MicroServiceCluster> discoverAll() {
        return this.datasource.values().stream().collect(Collectors.toSet());
    }

    @Override
    public MicroServiceCluster register(MicroServiceDescriptor microServiceDescriptor) {
        MicroServiceCluster cluster;
        if (!this.datasource.containsKey(microServiceDescriptor.getName())) {
            cluster = new MicroServiceCluster(microServiceDescriptor.getName());
            cluster.add(new MicroServiceInstance(
                microServiceDescriptor.getName(),
                microServiceDescriptor.getHostname(),
                microServiceDescriptor.getPort(),
                LocalDateTime.now()
            ));
            this.datasource.put(microServiceDescriptor.getName(), cluster);
        } else {
            cluster = this.datasource.get(microServiceDescriptor.getName());
            Optional<MicroServiceInstance> existingInstance = cluster.getInstances()
                    .stream()
                    .filter(node -> node.getHostname().equalsIgnoreCase(microServiceDescriptor.getHostname()))
                    .filter(node -> node.getPort() == microServiceDescriptor.getPort())
                    .findFirst();
            if (existingInstance.isPresent()) {
                cluster.delete(existingInstance.get());
            }
            cluster.add(new MicroServiceInstance(
                microServiceDescriptor.getName(),
                microServiceDescriptor.getHostname(),
                microServiceDescriptor.getPort(),
                LocalDateTime.now()
            ));
        }
        return cluster;
    }
    
}
