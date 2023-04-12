package io.nirahtech.ride4ever.registry.common;

public class MicroServiceDescriptor {
    private final String name;
    private final String hostname;
    private final int port;
    
    public MicroServiceDescriptor(String name, String hostname, int port) {
        this.name = name;
        this.hostname = hostname;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public String getHostname() {
        return hostname;
    }

    public int getPort() {
        return port;
    }



}
