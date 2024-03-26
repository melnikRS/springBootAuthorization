FROM amazoncorretto:17-alpine-jdk

EXPOSE 8080

ADD target/springBootAuthorization-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]