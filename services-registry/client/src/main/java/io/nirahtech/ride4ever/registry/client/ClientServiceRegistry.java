package io.nirahtech.ride4ever.registry.client;

import java.net.MalformedURLException;
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
    public void register(Service service, final String hostname, final int port) {
        URL url = null;
        try {
            url = new URL("http", hostname, port, "/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (url != null) {
            this.registry.put(service, url);
        }
    }

}
