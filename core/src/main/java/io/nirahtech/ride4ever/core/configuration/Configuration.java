package io.nirahtech.ride4ever.core.configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import java.util.Properties;
import java.util.ResourceBundle;

public final class Configuration {

    private static Configuration instance = null;
    private static final String APPLICATION_PROPERTIES_FILENAME = "application";

    private final Properties properties;

    public static final Configuration getInstance() {
        if (Configuration.instance == null) {
            Configuration.instance = new Configuration();
        }
        return Configuration.instance; 
    }

    public static final Configuration getInstance(final String applicationPropertiesEnvironmentVariableName) {
        if (Configuration.instance == null) {
            Configuration.instance = new Configuration(applicationPropertiesEnvironmentVariableName);
        }
        return Configuration.instance; 
    }

    private Configuration() {
        this.properties = new Properties();
        this.loadConfigurationFromJar(APPLICATION_PROPERTIES_FILENAME);
    }

    private Configuration(final String applicationPropertiesEnvironmentVariableName) {
        this();
        if (applicationPropertiesEnvironmentVariableName != null) {
            this.loadConfigurationFromEnvironmentVariable(applicationPropertiesEnvironmentVariableName);
        }
    }

    private void loadPropertiesFile(final File propertiesFile) {
        try (final InputStream inputStream = new FileInputStream(propertiesFile)) {
            this.properties.load(inputStream);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private void loadConfigurationFromJar(final String fileName) {
        ResourceBundle bundle = ResourceBundle.getBundle(fileName);
        bundle.getKeys().asIterator().forEachRemaining((property) -> this.properties.put(property, bundle.getObject(property)));
    }

    private void loadConfigurationFromEnvironmentVariable(final String environmentVariableName) {
        if (System.getenv().containsKey(environmentVariableName)) {
            final String configurationPath = System.getenv(environmentVariableName);
            final File configurationFile = new File(configurationPath);
            this.loadPropertiesFile(configurationFile);
        }
    }

    public Optional<String> get(final String property) {
        return Optional.ofNullable(this.properties.getProperty(property));
    }

}
