package io.nirahtech.ride4ever.microservice.geomap;

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

import java.io.File;
// import org.geotools.data.FileDataStore;
// import org.geotools.data.FileDataStoreFinder;
// import org.geotools.data.simple.SimpleFeatureSource;
// import org.geotools.map.FeatureLayer;
// import org.geotools.map.Layer;
// import org.geotools.map.MapContent;
// import org.geotools.styling.SLD;
// import org.geotools.styling.Style;
// import org.geotools.swing.JMapFrame;
// import org.geotools.swing.data.JFileDataStoreChooser;

import io.nirahtech.ride4ever.core.infrastructure.plugin.api.Descriptor;
import io.nirahtech.ride4ever.core.infrastructure.plugin.api.MicroServicePlugin;
import io.nirahtech.ride4ever.core.infrastructure.plugin.model.PluginDescriptor;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class Ride4EverMicroserviceGeoMapApplication extends SpringBootServletInitializer implements MicroServicePlugin {
    public static final Logger LOGGER = LoggerFactory.getLogger(Ride4EverMicroserviceGeoMapApplication.class);

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
        SpringApplication.run(Ride4EverMicroserviceGeoMapApplication.class, arguments);
    }

    @Override
    public void shutdown() {

    }

    @Override
    public Descriptor getDescriptor() {
        return this.descriptor;
    }

    public static void main(String[] arguments) {

        // // display a data store file chooser dialog for shapefiles
        // File file = JFileDataStoreChooser.showOpenFile("shp", null);
        // if (file == null) {
        //     return;
        // }

        // FileDataStore store = FileDataStoreFinder.getDataStore(file);
        // SimpleFeatureSource featureSource = store.getFeatureSource();

        // // Create a map content and add our shapefile to it
        // MapContent map = new MapContent();
        // map.setTitle("Quickstart");

        // Style style = SLD.createSimpleStyle(featureSource.getSchema());
        // Layer layer = new FeatureLayer(featureSource, style);
        // map.addLayer(layer);

        // // Now display the map
        // JMapFrame.showMap(map);



        MicroServicePlugin application = new Ride4EverMicroserviceGeoMapApplication();
        application.load();
        application.start(arguments);
        application.shutdown();
    }

}
