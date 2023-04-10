package io.nirahtech.ride4ever;

import io.nirahtech.ride4ever.bikers.client.interfaces.providers.BikersServiceProvider;
import io.nirahtech.ride4ever.bikers.client.interfaces.providers.BikersServiceProviderFactory;

public class Test {
    
    public void test() {

        BikersServiceProvider bikersProvider = BikersServiceProviderFactory.create();
        bikersProvider.getBikersCatalog();
    }
}
