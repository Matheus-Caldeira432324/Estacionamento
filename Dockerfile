FROM eclipse-temurin:25-jdk AS build

WORKDIR /app

# Copy the Gradle project
COPY . .

# Make Gradle wrapper executable
RUN chmod +x gradlew

# Build the application
RUN ./gradlew clean build -x test


FROM eclipse-temurin:25-jre

WORKDIR /app

# Copy the generated JAR
COPY --from=build /app/build/libs/*.jar app.jar

CMD ["java", "-jar", "app.jar"]