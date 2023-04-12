package io.nirahtech.ride4ever.microservice.broker.interfaces.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter.SseEventBuilder;

import io.nirahtech.ride4ever.microservice.broker.business.services.alert.AlertService;

@RestController
public class BrokerRestController {

    private static final List<SseEmitter> EMITTERS = new ArrayList<>();

    @Autowired
    private AlertService alertService;

    // Fonction publique et statique permettant d'être appellée par une autre classe afin de publier un message au Front.
    public static void publish(Object mesage) {
        // On va parcorurir tout les clients Frontend qui sont connectés.
        EMITTERS.forEach(emitter -> {
            SseEventBuilder builder = SseEmitter.event();

            // On reconnecte automatiquement le client 200ms apres que sa connection a été terminée.
            // Par défaut, le délais est de 5s.
            builder.reconnectTime(200);

            // On définis la donnée à envoyer, qui est ici le message.
            builder.data(mesage);
            try {
                emitter.send(builder); // On envoie le message.
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }

    @RequestMapping("/message")
    public SseEmitter handleRequestMessage () {
        // Un nouveau client FrontEnd se connecte.
        final SseEmitter emitter = new SseEmitter();
        emitter.onCompletion(() -> EMITTERS.remove(emitter));
        emitter.onTimeout(() -> EMITTERS.remove(emitter));
        EMITTERS.add(emitter);
        return emitter;
    }

}
