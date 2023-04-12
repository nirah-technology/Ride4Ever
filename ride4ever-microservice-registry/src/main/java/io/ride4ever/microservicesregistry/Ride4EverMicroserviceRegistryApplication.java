package io.ride4ever.microservicesregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Ride4EverMicroserviceRegistryApplication extends SpringBootServletInitializer {

    public static final void main(final String[] commandLineArguments) {
        SpringApplication.run(Ride4EverMicroserviceRegistryApplication.class, commandLineArguments);
    }

}
