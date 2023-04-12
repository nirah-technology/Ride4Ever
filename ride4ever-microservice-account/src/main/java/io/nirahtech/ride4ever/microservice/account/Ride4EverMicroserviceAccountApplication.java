package io.nirahtech.ride4ever.microservice.account;

import com.netflix.discovery.EurekaClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Lazy;

import io.nirahtech.ride4ever.core.infrastructure.plugin.api.Descriptor;
import io.nirahtech.ride4ever.core.infrastructure.plugin.api.MicroServicePlugin;
import io.nirahtech.ride4ever.core.infrastructure.plugin.model.PluginDescriptor;

/**
 * Class that represents the Ride4Ever Microservice Account Application.
 * This class extends @link{SpringBootServletInitializer} and implements the @{link MicroServicePlugin}
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Ride4EverMicroserviceAccountApplication extends SpringBootServletInitializer implements MicroServicePlugin {
    public static final Logger LOGGER = LoggerFactory.getLogger(Ride4EverMicroserviceAccountApplication.class);

    @Value("${application.groupId}")
    private String groupId;

    @Value("${application.artifactId}")
    private String artifactId;

    @Value("${application.version}")
    private String version;

    @Value("${spring.application.name}")
    private String name;

    private Descriptor descriptor = new PluginDescriptor(groupId,artifactId,version,name,null);

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Override
    public void load() {

    }

    @Override
    public void start(String... arguments) {
        SpringApplication.run(Ride4EverMicroserviceAccountApplication.class, arguments);
    }

    @Override
    public void shutdown() {

    }

    @Override
    public Descriptor getDescriptor() {
        return this.descriptor;
    }

    public static void main(String[] arguments) {
        MicroServicePlugin application = new Ride4EverMicroserviceAccountApplication();
        application.load();
        application.start(arguments);
        application.shutdown();
    }

}
