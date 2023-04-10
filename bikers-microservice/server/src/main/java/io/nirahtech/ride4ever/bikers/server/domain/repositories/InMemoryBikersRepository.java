package io.nirahtech.ride4ever.bikers.server.domain.repositories;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import io.nirahtech.ride4ever.bikers.common.data.RealBiker;
import io.nirahtech.ride4ever.core.criterion.PropertyCondition;
import io.nirahtech.ride4ever.core.data.Biker;
import io.nirahtech.ride4ever.core.data.BikerIdentifier;
import io.nirahtech.ride4ever.core.data.Email;
import io.nirahtech.ride4ever.core.data.Mail;
import io.nirahtech.ride4ever.core.requesting.Pageable;

public class InMemoryBikersRepository implements BikersRepository {

    private final Map<BikerIdentifier, Biker> dataSource = new HashMap<>();

    public InMemoryBikersRepository() {
        for (int index = 0; index < 10; index++) {
            BikerIdentifier id = new BikerIdentifier(index);
            RealBiker biker = new RealBiker();
            biker.setIdentifier(id);
            biker.setFirstName("Nicolas");
            biker.setLastName("METIVIER");
            biker.setNickName("Zaroastre");
            biker.setEmail(new Email("nicolas.a.metivier", "gmail.com"));
            biker.setMail(new Mail(40, "Route", "PELLEPORT", 31480, "LE GRES", "Haute-Garonne", "FRANCE"));
            biker.setMedicalTraining(false);
            biker.setPhoneNumber("06.23.33.57.03");
            biker.setTrainedInMechanics(true);
            this.dataSource.put(id, biker);
        }
    }

    @Override
    public Stream<Biker> findAll(Set<PropertyCondition> filters, Pageable page) {
        return this.dataSource.values()
            .stream()
            .sorted()
            .skip(((page.getPage() * page.getSize()) - page.getSize()))
            .limit(page.getSize());
    }

    @Override
    public Optional<Biker> findById(BikerIdentifier id) {
        return Optional.ofNullable(this.dataSource.get(id));
    }
    
}
