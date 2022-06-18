FROM amazoncorretto:11-alpine-jdk
MAINTAINER Satheesh Chepuri
RUN mkdir services
WORKDIR /services
COPY target/hello-service-*.jar /services/hello-service.jar
ENTRYPOINT ["java","-jar","/services/hello-service.jar"]
