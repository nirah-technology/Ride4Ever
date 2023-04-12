package io.nirahtech.ride4ever.registry.common;

import java.util.Optional;
import java.util.Set;

public interface ServiceRegistryExplorer {
    Optional<MicroServiceCluster> lookup(final String microServiceName);
    Set<MicroServiceCluster> discoverAll();
}
