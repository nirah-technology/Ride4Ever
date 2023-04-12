package io.nirahtech.ride4ever.registry.server;

import io.nirahtech.ride4ever.registry.common.ServiceRegistryExplorer;

public class MicroServiceZombieKillerThread extends Thread {

    private boolean isRunning = false;
    private long cleanIntervalInSeconds = 0;
    private final ServiceRegistryExplorer serviceRegistryExplorer;

    public  MicroServiceZombieKillerThread(final ServiceRegistryExplorer serviceRegistryExplorer) {
        this.serviceRegistryExplorer = serviceRegistryExplorer;
    }

    private void waitForNextCleanup() {
        try {
            MicroServiceZombieKillerThread.sleep(this.cleanIntervalInSeconds);
        } catch (InterruptedException e) {
            this.isRunning = false;
        }

    }

    private void cleanupMicroservices() {

        this.serviceRegistryExplorer.discoverAll().stream().forEach(cluster -> {
            cluster.getInstances().forEach(instance -> {
                if (instance.isZombie()) {
                    cluster.delete(instance);
                } else {
                    
                }
            });
        });
    }

    @Override
    public void run() {
        this.isRunning = true;
        while (this.isRunning) {
            this.cleanupMicroservices();
            this.waitForNextCleanup();
        }
        super.run();
    }

    public void terminate() {
        this.isRunning = false;
    }
}
