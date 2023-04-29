#!/bin/bash

# Start the Spring Boot application
java -jar target/springcrud-0.0.1-SNAPSHOT.jar &

# Sleep for 10 seconds to allow the application to start
sleep 10

# Check if the application is still running, and restart it if necessary
while true; do
    PID=$(pgrep -f "java -jar target/my-spring-boot-app.jar")
    if [ -z "$PID" ]; then
        echo "Application stopped. Restarting..."
        java -jar target/my-spring-boot-app.jar &
        sleep 10
    fi
    sleep 5
done
