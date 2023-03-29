package io.nirahtech.ride4ever.registry.common;

import java.net.URL;
import java.util.Optional;

@FunctionalInterface
public interface ServiceRegistryExplorer {
    Optional<URL> lookup(final Service service);
}
