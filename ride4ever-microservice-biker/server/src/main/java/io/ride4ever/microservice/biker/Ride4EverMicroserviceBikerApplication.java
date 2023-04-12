package io.ride4ever.microservice.biker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Ride4EverMicroserviceBikerApplication extends SpringBootServletInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Ride4EverMicroserviceBikerApplication.class);


    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    public static void main(String[] commandLineArguments) {
        SpringApplication.run(Ride4EverMicroserviceBikerApplication.class, commandLineArguments);
    }

}
