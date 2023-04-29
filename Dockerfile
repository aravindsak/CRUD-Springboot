FROM openjdk:17-jdk-slim

COPY target/my-spring-boot-app.jar .

# Copy the docker-entrypoint.sh file
COPY docker-entrypoint.sh .

# Make the entrypoint script executable
RUN chmod +x docker-entrypoint.sh

# Set the entrypoint to the script
ENTRYPOINT ["./docker-entrypoint.sh"]
