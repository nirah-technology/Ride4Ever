package io.nirahtech.ride4ever.bikers.server.interfaces.rest;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class HealthCheckerRestController {
    
    public final Handler isUp = (Context context) -> {
        // MOTORCYCLE_CLUBS_REST_CONTROLLER.notify();
    };

    public final Handler isReady = (Context context) -> {
        // MOTORCYCLE_CLUBS_REST_CONTROLLER.notify();
    };
}
