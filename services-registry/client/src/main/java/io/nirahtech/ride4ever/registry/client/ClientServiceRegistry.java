package io.nirahtech.ride4ever.registry.client;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import io.nirahtech.ride4ever.registry.common.Service;
import io.nirahtech.ride4ever.registry.common.ServiceRegistryProvider;

public class ClientServiceRegistry implements ServiceRegistryProvider {

    private Map<Service, URL> registry = new HashMap<>();

    @Override
    public Optional<URL> lookup(Service service) {
        Optional<URL> serviceUrl = Optional.empty();
        if (this.registry.containsKey(service)) {
            serviceUrl = Optional.ofNullable(this.registry.get(service));
        }
        return serviceUrl;
    }

    @Override
    public void register(Service service, URL url) {
        this.registry.put(service, url);
    }

}
