package io.nirahtech.ride4ever.bikers.server.interfaces.rest;

import java.util.Optional;
import java.util.stream.Stream;

import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.nirahtech.ride4ever.bikers.server.business.services.BikersService;
import io.nirahtech.ride4ever.bikers.server.infrastructure.HttpUtils;
import io.nirahtech.ride4ever.core.data.Biker;
import io.nirahtech.ride4ever.core.data.BikerIdentifier;
import io.nirahtech.ride4ever.core.requesting.Pageable;

public final class BikersRestController {

    private BikersService bikersService;

    public BikersRestController(final BikersService bikersService) {
        this.bikersService = bikersService;
    }

    public final Handler searchBikers = (Context context) -> {
        Optional<Pageable> page = HttpUtils.extractPageFromQuery(context.queryParamMap());
        if (page.isEmpty()) {
            context.status(400);
        } else {
            Stream<Biker> bikers = this.bikersService.findAll(null, page.get());
            context.json(bikers.toList());
        }
        
    };

    public final Handler findBikerByIdentifier = (Context context) -> {
        final String identifier = context.pathParam("id");
        Optional<Biker> bikerFound = this.bikersService.findById(new BikerIdentifier(Integer.parseInt(identifier)));
        if (bikerFound.isEmpty()) {
            context.status(404);
        } else {
            context.json(bikerFound.get());
        }
    };

    public final Handler updateBiker = (Context context) -> {
        final String identifier = context.pathParam("id");
        
    };
}
