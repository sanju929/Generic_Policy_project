# Use a JDK 21 base image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy Maven build JAR
COPY target/zen-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your API uses
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]