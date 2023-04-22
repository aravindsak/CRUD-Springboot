FROM openjdk:17-jdk-slim

WORKDIR /app

ADD target/springcrud-0.0.1-SNAPSHOT.jar /app/springcrud-mongo.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "/app/springcrud-mongo.jar"]