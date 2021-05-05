FROM openjdk:15
COPY target/spring-docker-kubernetes-0.0.1-SNAPSHOT.jar rest-example-0.0.1.jar
ENTRYPOINT java -jar rest-example-0.0.1.jar
EXPOSE 8080