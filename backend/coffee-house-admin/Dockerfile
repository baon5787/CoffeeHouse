FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /app
COPY . /app/
RUN mvn dependency:tree
RUN mvn clean package

#
# Package stage
#
FROM openjdk:17-alpine
COPY --from=build /app/target/*.jar /app/app.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]