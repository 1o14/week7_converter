FROM openjdk:17
COPY target/*.jar /app/app.jar
WORKDIR /app
CMD ["java", "-jar", "app.jar"]
