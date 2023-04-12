package io.nirahtech.ride4ever.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Ride4EverConfigServiceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Ride4EverConfigServiceApplication.class, args);
    }

}
