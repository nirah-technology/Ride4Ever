package io.nirahtech.ride4ever.registry.server;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

import io.nirahtech.ride4ever.registry.common.MicroServiceCluster;
import io.nirahtech.ride4ever.registry.common.MicroServiceDescriptor;

public class MicroserviceRegistryServiceImpl implements MicroserviceRegistryService {

    private final MicroserviceRegistryRepository registryRepository;
    private final MicroServiceZombieKillerThread zombieKillerThread;

    public MicroserviceRegistryServiceImpl(final MicroserviceRegistryRepository registryRepository) {
        this.registryRepository = registryRepository;
        this.zombieKillerThread = new MicroServiceZombieKillerThread(this.registryRepository);
    }

    @Override
    public Optional<MicroServiceCluster> lookup(String microServiceName) {
        return this.registryRepository.lookup(microServiceName);
    }

    @Override
    public Set<MicroServiceCluster> discoverAll() {
        return this.registryRepository.discoverAll();
    }

    @Override
    public MicroServiceCluster register(MicroServiceDescriptor microServiceDescriptor) {
        return this.register(microServiceDescriptor);
    }

    @Override
    public void ping(String microServiceName) {
        LocalDateTime now = LocalDateTime.now();
        Optional<MicroServiceCluster> cluster = this.registryRepository.lookup(microServiceName);
        if (cluster.isPresent()) {
            // TODO
        }
        
    }
    
}
