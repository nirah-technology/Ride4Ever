package io.nirahtech.ride4ever.registry.common;

@FunctionalInterface
public interface ServiceRegistryRegister {
    void register(final Service service, final String hostname, final int port);
}
