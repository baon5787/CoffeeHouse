FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/coffee-house-admin-0.0.1-SNAPSHOT.jar /app/springboot-docker-demo.jar

ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]