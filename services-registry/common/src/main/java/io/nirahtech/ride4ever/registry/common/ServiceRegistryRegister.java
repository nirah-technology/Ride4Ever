package io.nirahtech.ride4ever.registry.common;

import java.net.URL;

@FunctionalInterface
public interface ServiceRegistryRegister {
    void register(final Service service, final URL url);
}
