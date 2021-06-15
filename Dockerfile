FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY src/main/resources/jokesapp-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]