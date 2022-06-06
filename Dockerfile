FROM openjdk:17

ENV APP_JAR="java-example-service-0.0.1-SNAPSHOT.jar"

COPY build/libs/${APP_JAR} /opt/application.jar

CMD ["java", "-jar", "/opt/application.jar"]