FROM java:8-jdk-alpine
COPY ./target/api-1.0.0.jar /usr/application/
WORKDIR /usr/application
ENTRYPOINT ["java","-jar","api-1.0.0.jar"]
