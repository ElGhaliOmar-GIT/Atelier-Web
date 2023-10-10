FROM openjdk:8
EXPOSE 8089
ADD target/docker.jar docker.jar
ENTRYPOINT ["java", "-jar", "docker.jar"]