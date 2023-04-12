package io.nirahtech.ride4ever.registry.common;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MicroServiceInstance implements Serializable {
    private final String name;
    private final String hostname;
    private final int port;
    private final LocalDateTime uptime;

    private String status;
    private boolean isZombie;
    
    public MicroServiceInstance(String name, String hostname, int port, LocalDateTime uptime) {
        this.name = name;
        this.hostname = hostname;
        this.port = port;
        this.uptime = uptime;
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

    public LocalDateTime getUptime() {
        return uptime;
    }

    public String getStatus() {
        return status;
    }

    public boolean isZombie() {
        return isZombie;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void isZombie(boolean isZombie) {
        this.isZombie = isZombie;
    }
}
