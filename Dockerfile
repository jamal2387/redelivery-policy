FROM gradle:jdk11-alpine AS build
ENV APP_HOME=/usr/app/
COPY . $APP_HOME
WORKDIR $APP_HOME
RUN gradle build

FROM openjdk:11-jre-slim
EXPOSE 8080
RUN mkdir /app
COPY --from=build /usr/app/build/libs/*.jar /app/
ENTRYPOINT ["java", "-jar", "/app/redelivery-policy-0.0.1-SNAPSHOT.jar"]