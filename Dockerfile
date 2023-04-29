FROM openjdk:17-jdk-slim

COPY target/springcrud-0.0.1-SNAPSHOT.jar .

# Copy the docker-entrypoint.sh file
COPY docker-entrypoint.sh .

# Make the entrypoint script executable
RUN chmod +x docker-entrypoint.sh

# Set the entrypoint to the script
ENTRYPOINT ["./docker-entrypoint.sh"]
