FROM openjdk:8
ADD target/spring-docker-demo.jar spring-docker-demo.jar
EXPOSE 9999
ENTRYPOINT ["java", "-jar", "spring-docker-demo.jar"]