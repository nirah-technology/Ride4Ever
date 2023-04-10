package io.nirahtech.ride4ever.bikers.server.domain.repositories;

import io.nirahtech.ride4ever.bikers.common.data.RealBiker;
import io.nirahtech.ride4ever.core.data.Biker;
import io.nirahtech.ride4ever.core.data.BikerIdentifier;
import io.nirahtech.ride4ever.core.data.Email;
import io.nirahtech.ride4ever.core.data.Mail;

public class SqlBikersRepository extends AbstractRepository<Biker, BikerIdentifier> implements BikersRepository {
    public SqlBikersRepository() {
        super(RealBiker.class);
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
            this.save(biker);
        }
    }
}
