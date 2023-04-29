FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/springcrud-0.0.1-SNAPSHOT.jar /app/springcrud-mongo.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/springcrud-mongo.jar"]

