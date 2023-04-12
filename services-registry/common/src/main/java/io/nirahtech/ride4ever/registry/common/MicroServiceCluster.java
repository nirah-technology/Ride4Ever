package io.nirahtech.ride4ever.registry.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MicroServiceCluster implements Serializable {
    private final String name;
    private final Set<MicroServiceInstance> instances = new HashSet<>();

    public MicroServiceCluster(String name) {
        this.name = name;
    }

    public final void add(MicroServiceInstance instance) {
        this.instances.add(instance);
    }
    
    public final void delete(MicroServiceInstance instance) {
        if (this.instances.contains(instance)) {
            this.instances.remove(instance);
        }
    }

    public String getName() {
        return name;
    }

    public List<MicroServiceInstance> getInstances() {
        return new ArrayList<>(instances);
    }

}
