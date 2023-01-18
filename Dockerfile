FROM gradle:jdk11-alpine AS build
ENV APP_HOME=/usr/app/
COPY . $APP_HOME
WORKDIR $APP_HOME
RUN gradle build

FROM openjdk:8-jre-sllim
EXPOSE 8080
RUN mkdir /app
COPY --from=build /usr/app/build/libs/*.jar /app/redelivery-policy.jar
ENTRYPOINT ["java", "-jar", "redelivery-policy.jar"]