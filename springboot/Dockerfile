# Use the official OpenJDK base image
FROM openjdk:17.0.2-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled Spring Boot application JAR file into the container
COPY build/libs/*.jar app.jar

# Expose port 9000 for the Spring Boot application
EXPOSE 9000

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
