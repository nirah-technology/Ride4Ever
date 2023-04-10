package io.nirahtech.ride4ever.bikers.server;

import java.net.InetAddress;
import java.net.UnknownHostException;

import io.javalin.Javalin;
import io.nirahtech.ride4ever.bikers.server.business.services.BikersService;
import io.nirahtech.ride4ever.bikers.server.business.services.BikersServiceImpl;
import io.nirahtech.ride4ever.bikers.server.domain.repositories.BikersRepository;
import io.nirahtech.ride4ever.bikers.server.domain.repositories.SqlBikersRepository;
import io.nirahtech.ride4ever.bikers.server.interfaces.rest.BikersRestController;
import io.nirahtech.ride4ever.bikers.server.interfaces.rest.HealthCheckerRestController;
import io.nirahtech.ride4ever.bikers.server.interfaces.rest.MotorcycleClubsRestController;
import io.nirahtech.ride4ever.bikers.server.interfaces.rest.MotorcyclesRestController;
import io.nirahtech.ride4ever.core.configuration.Configuration;
import io.nirahtech.ride4ever.registry.client.ClientServiceRegistry;
import io.nirahtech.ride4ever.registry.common.Service;

public final class BikersMicroserviceApplication implements Runnable {

    private static final String APPLICATION_PROPERTIES_ENVIRONMENT_VARIABLE_NAME = "R4E_BIKERS_CONFIGURATION_FILEPATH";


    private BikersMicroserviceApplication() {

    }

    @Override
    public void run() {
        final Configuration configuration = Configuration.getInstance(APPLICATION_PROPERTIES_ENVIRONMENT_VARIABLE_NAME);
        final int port = Integer.parseInt(configuration.get("port").orElse("9010"));

        final ClientServiceRegistry clientServiceRegistry = new ClientServiceRegistry();
        try {
            clientServiceRegistry.register(Service.BIKERS, InetAddress.getLocalHost().getHostName(), port);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        final Javalin javalin = Javalin.create((config) -> {
            config.http.defaultContentType = "application/json";
        });

        final BikersRepository bikersRepository = new SqlBikersRepository();
        final BikersService bikersService = new BikersServiceImpl(bikersRepository);
        final BikersRestController bikersRestController = new BikersRestController(bikersService);
        final MotorcyclesRestController motorcyclesRestController = new MotorcyclesRestController();
        final MotorcycleClubsRestController motorcycleClubsRestController = new MotorcycleClubsRestController();
        final HealthCheckerRestController healthCheckerRestController = new HealthCheckerRestController();

        // Bikers
        javalin.get("/bikers", bikersRestController.searchBikers);
        javalin.get("/bikers/{id}", bikersRestController.findBikerByIdentifier);
        javalin.patch("/bikers/{id}", bikersRestController.updateBiker);

        // Motorcycles
        javalin.get("/motorcycles", motorcyclesRestController.searchMotorcycles);
        javalin.get("/motorcycles/{id}", motorcyclesRestController.findMotorcycleByIdentifier);
        javalin.patch("/motorcycles/{id}", motorcyclesRestController.updateMotorcycle);

        // Motorcycles Clubs
        javalin.get("/motorcycle-clubs", motorcycleClubsRestController.searchMotorcycleClubs);
        javalin.get("/motorcycle-clubs/{id}", motorcycleClubsRestController.findMotorcycleClubByIdentifier);
        javalin.patch("/motorcycle-clubs/{id}", motorcycleClubsRestController.updateMotorcycleClub);


        javalin.get("/is-up", healthCheckerRestController.isUp);
        javalin.get("/is-ready", healthCheckerRestController.isReady);

        javalin.start(port);
    }


    public static void main(String[] args) {
        final BikersMicroserviceApplication application = new BikersMicroserviceApplication();
        application.run();
        
    }
}
