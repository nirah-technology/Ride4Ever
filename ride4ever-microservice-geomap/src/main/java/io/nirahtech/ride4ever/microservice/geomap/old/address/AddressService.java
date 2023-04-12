/******************************************************************
 * Copyright 2021 Ride4Ever
 *
 * TO BE DEFINED
 ******************************************************************/
package io.nirahtech.ride4ever.microservice.geomap.old.address;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("addressService")
public final class AddressService implements AddressApi {

    @Autowired
    private AddressRepository repository;

    @Override
    public Address create(Address entity) {
        List<Address> existingMatchedAddresses = this.repository.findByNumberAndStreetAndZipCodeAndCountry(entity.getNumber(), entity.getStreet(), entity.getZipCode(), entity.getCountry());
        if (existingMatchedAddresses.size() == 0) {
            return this.repository.save(entity);
        }
        return existingMatchedAddresses.get(0);
    }

    @Override
    public Address read(Integer identifier) {
        Optional<Address> entity = this.repository.findById(identifier);
        if (entity.isPresent()) {
            return entity.get();
        }
        return null;
    }

    @Override
    public Address update(Integer identifier, Address entity) {
        return this.repository.save(entity);
    }

    @Override
    public void delete(Integer identifier) {
        this.repository.deleteById(identifier);
    }

    @Override
    public List<Address> findAll() {
        List<Address> list = new ArrayList<>();
        this.repository.findAll().forEach((item) -> {
            list.add(item);
        });
        return list;
    }

    @Override
    public String findWeatherByCoordinates(double latitude, double longitude) {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(
                // String.format("https://climacell-microweather-v1.p.rapidapi.com/weather/realtime?lon=%s&lat=%s&fields=humidity",
                // longitude, latitude)))
                // .header("x-rapidapi-host", "climacell-microweather-v1.p.rapidapi.com")
                // .header("x-rapidapi-key",
                // "2852e0f57fmsh7758376464b87ccp1f5c22jsne8d7cc2eb7c3")
                // .method("GET", HttpRequest.BodyPublishers.noBody()).build();

                String.format(
                        "http://api.weatherstack.com/current?access_key=ebb0027b713c0345b01df422408d069a&query=%s,%s",
                        longitude, latitude)))
                .method("GET", HttpRequest.BodyPublishers.noBody()).build();

        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            return response.body();
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
