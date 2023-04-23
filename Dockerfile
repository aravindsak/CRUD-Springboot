FROM openjdk:17-jdk-slim

ADD target/springcrud-0.0.1-SNAPSHOT.jar springcrud-mongo.jar

ENTRYPOINT ["java", "-jar", "springcrud-mongo.jar"]
