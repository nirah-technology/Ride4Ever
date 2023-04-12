FROM openjdk:14-slim as build

RUN mkdir -p /opt/nirah-technology/ride4ever
WORKDIR /opt/nirah-technology/ride4ever

COPY target/ride4ever-microservice-trip-1.0.0-SNAPSHOT-exec.jar .

ENTRYPOINT ["java","-jar","ride4ever-microservice-trip-1.0.0-SNAPSHOT-exec.jar"]