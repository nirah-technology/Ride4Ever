package io.ride4ever.bikers.client.business.services.bikers;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import org.json.JSONArray;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.ride4ever.bikers.common.data.RealBiker;
import io.ride4ever.core.criterion.PropertyCondition;
import io.ride4ever.core.data.Biker;
import io.ride4ever.core.data.BikerIdentifier;
import io.ride4ever.core.requesting.Pageable;

public final class RestRemoteBikersService implements BikersService {

    private final URL remoteServiceUrl;
    private final HttpClient httpClient;

    public RestRemoteBikersService(final URL remoteServiceUrl) {
        this.remoteServiceUrl = remoteServiceUrl;
        this.httpClient = HttpClient.newBuilder().build();
    }

    @Override
    public Stream<Biker> findAll(Set<PropertyCondition> filters, Pageable page) {
        Stream<Biker> result = Stream.empty();
        HttpRequest httpRequest = null;
        try {
            httpRequest = HttpRequest.newBuilder().GET().uri(this.remoteServiceUrl.toURI()).build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        if (httpRequest != null) {
            HttpResponse<String> httpResponse = null;
            try {
                httpResponse = this.httpClient.send(httpRequest, BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
            if (httpResponse != null && httpResponse.statusCode() == 200) {
                final String httpJsonBody = httpResponse.body();
                JSONArray jsonArray = new JSONArray(httpJsonBody);
                List<Biker> bikers = new ArrayList<>();
                ObjectMapper mapper = new ObjectMapper();
                jsonArray.forEach(json -> {
                    try {
                        bikers.add(mapper.readValue(json.toString(), RealBiker.class));
                    } catch (JsonProcessingException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                });
                result = bikers.stream();
            }
        }
        return result;
    }
    
    @Override
    public Optional<Biker> findById(BikerIdentifier id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'RestRemoteBikersService.findById'");
    }
    
}
