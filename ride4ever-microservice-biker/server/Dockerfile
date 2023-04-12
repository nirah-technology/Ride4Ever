FROM openjdk:latest

# Declare some usefull variables
ARG WORKING_DIRECTORY=/opt/ride4ever
ARG JAR=ride4ever-bikers-microservice.jar
ARG EXECUTABLE=${WORKING_DIRECTORY}/${JAR}

# Create working directory of the service
RUN mkdir ${WORKING_DIRECTORY}

# Create a environement variable inside the container.
ENV R4E_BIKERS_CONFIGURATION_FILEPATH=${WORKING_DIRECTORY}/application.properties

# Install the microservice
COPY target/ride4ever-bikers-microservice-server*.jar ${EXECUTABLE}

# Execute the microservice
CMD [ "java", "-jar", ${EXECUTABLE} ]