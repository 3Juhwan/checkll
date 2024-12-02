FROM openjdk:21-jdk-slim

WORKDIR /app

COPY /build/libs/*.jar /app/checkll-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["-jar", "checkll-0.0.1-SNAPSHOT.jar"]
