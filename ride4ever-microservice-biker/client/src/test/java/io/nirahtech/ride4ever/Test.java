package io.ride4ever;

import io.ride4ever.bikers.client.interfaces.providers.BikersServiceProvider;
import io.ride4ever.bikers.client.interfaces.providers.BikersServiceProviderFactory;

public class Test {
    
    public void test() {

        BikersServiceProvider bikersProvider = BikersServiceProviderFactory.create();
        bikersProvider.getBikersCatalog();
    }
}
