package io.nirahtech.ride4ever.registry.server;

import io.nirahtech.ride4ever.registry.common.MicroServiceDescriptor;
import io.nirahtech.ride4ever.registry.common.ServiceRegistryProvider;

public interface MicroserviceRegistryService extends ServiceRegistryProvider {
    void ping(String microServiceName);
}
