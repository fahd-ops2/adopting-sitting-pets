# Step 1: Use an official Java runtime image as a base
FROM openjdk:22-jdk-slim

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the compiled JAR file (generated by the Spring Boot project)
# Make sure the path matches the location of the built JAR file
COPY target/adopting-sitting-pets-1.0.0.jar /app/petapp.jar

# Step 4: Expose the port on which the Spring Boot app runs
EXPOSE 8080

# Step 5: Define the command to run your application
ENTRYPOINT ["java", "-jar", "/app/petapp.jar"]