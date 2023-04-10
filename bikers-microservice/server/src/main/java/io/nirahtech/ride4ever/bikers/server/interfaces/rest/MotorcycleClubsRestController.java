package io.nirahtech.ride4ever.bikers.server.interfaces.rest;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public final class MotorcycleClubsRestController {


    
    public final Handler searchMotorcycleClubs = (Context context) -> {
        // MOTORCYCLE_CLUBS_REST_CONTROLLER.notify();
    };

    public final Handler findMotorcycleClubByIdentifier = (Context context) -> {
        final String identifier = context.pathParam("id");
        // MOTORCYCLE_CLUBS_REST_CONTROLLER.notify();
    };

    public final Handler updateMotorcycleClub = (Context context) -> {
        final String identifier = context.pathParam("id");
        // MOTORCYCLE_CLUBS_REST_CONTROLLER.notify();
    };
}
