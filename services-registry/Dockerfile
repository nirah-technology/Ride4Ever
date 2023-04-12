FROM openjdk:17

# Declare some usefull variables
ARG WORKING_DIRECTORY=/opt/ride4ever
ARG JAR=ride4ever-services-registry.jar
ARG EXECUTABLE=${WORKING_DIRECTORY}/${JAR}

# Create working directory of the service
RUN mkdir ${WORKING_DIRECTORY}

# Create a environement variable inside the container.
# ENV R4E_BIKERS_CONFIGURATION_FILEPATH=${WORKING_DIRECTORY}/application.properties

# Install the microservice
COPY target/service-registry*.jar ${EXECUTABLE}

# Execute the microservice
CMD [ "java", "-jar", ${EXECUTABLE} ]