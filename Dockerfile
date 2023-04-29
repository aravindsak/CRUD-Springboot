FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/springcrud-0.0.1-SNAPSHOT.jar .                    

COPY docker-entrypoint.sh

RUN chmod +x docker-entrypoint.sh

ENTRYPOINT ["./docker-entrypoint.sh"]

