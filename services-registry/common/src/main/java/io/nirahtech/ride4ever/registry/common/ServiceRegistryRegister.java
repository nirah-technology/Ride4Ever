package io.nirahtech.ride4ever.registry.common;

@FunctionalInterface
public interface ServiceRegistryRegister {
    MicroServiceCluster register(final MicroServiceDescriptor microServiceDescriptor);
}
