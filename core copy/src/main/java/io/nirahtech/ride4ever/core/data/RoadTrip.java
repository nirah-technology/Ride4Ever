package io.nirahtech.ride4ever.core.data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.stream.Stream;

public interface RoadTrip extends Serializable {
    RoadTripIdentifier getIdentifier();

    String getName();
    String getDescription();

    LocalDateTime getDepartureTime();
    Mail getDepartureMail();

    LocalDateTime getArrivalTime();
    Mail getArrivalMail();

    int getDuration();

    Stream<Mail> getStages();
}
