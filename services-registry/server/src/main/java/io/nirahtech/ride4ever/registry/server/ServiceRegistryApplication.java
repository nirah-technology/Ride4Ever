package io.nirahtech.ride4ever.registry.server;

import io.javalin.Javalin;
import io.nirahtech.ride4ever.core.configuration.Configuration;

public final class ServiceRegistryApplication implements Runnable {

    private static final String APPLICATION_PROPERTIES_ENVIRONMENT_VARIABLE_NAME = "R4E_BIKERS_CONFIGURATION_FILEPATH";

    private ServiceRegistryApplication() {
    
        }

    @Override
    public void run() {
        final Configuration configuration = Configuration.getInstance(APPLICATION_PROPERTIES_ENVIRONMENT_VARIABLE_NAME);
        final int port = Integer.parseInt(configuration.get("port").orElse("8761"));


        final Javalin javalin = Javalin.create((config) -> {
            config.http.defaultContentType = "application/json";
        });

        final MicroServiceZombieKillerThread zombieKillerThread = new MicroServiceZombieKillerThread(null);

        final MicroserviceRegistryRepository registryRepository = new InMemoryMicroserviceRegistryRepository();
        final MicroserviceRegistryService registryService = new MicroserviceRegistryServiceImpl(registryRepository);
        final MicroserviceRegistryController registryController = new MicroserviceRegistryController(registryService);

        // Microservices
        javalin.post("/", registryController.register);
        javalin.get("/", registryController.discover);
        javalin.get("/{name}", registryController.lookup);
        javalin.get("/{name}/heartbeat", registryController.ping);

        zombieKillerThread.start();
        javalin.start(port);
    }

    public static void main(String[] args) {
        final ServiceRegistryApplication application = new ServiceRegistryApplication();
        application.run();

    }
}
