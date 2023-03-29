FROM openjdk:17
LABEL maintainer="Adarsh"
ADD target/springboot-backend-0.0.1-SNAPSHOT.jar employee-backend-docker.jar
ENTRYPOINT [ "java","-jar","employee-backend-docker.jar" ]