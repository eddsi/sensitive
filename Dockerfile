FROM maven:3.8.4-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:17-slim
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar
EXPOSE 8081
CMD ["java", "-jar", "/usr/local/lib/app.jar"]
