package io.nirahtech.ride4ever.bikers.server.interfaces.rest;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public final class MotorcyclesRestController {

    
    public final Handler searchMotorcycles = (Context context) -> {
        // MOTORCYCLES_REST_CONTROLLER.notify();
    };

    public final Handler findMotorcycleByIdentifier = (Context context) -> {
        final String identifier = context.pathParam("id");
        // MOTORCYCLES_REST_CONTROLLER.notify();
    };

    public final Handler updateMotorcycle = (Context context) -> {
        final String identifier = context.pathParam("id");
        // MOTORCYCLES_REST_CONTROLLER.notify();
    };
}
