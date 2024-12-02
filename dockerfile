FROM openjdk:21-jdk-slim

WORKDIR /app

COPY /build/libs/*.jar /app/checkll-0.0.1-SNAPSHOT.jar

EXPOSE 8080
ENTRYPOINT ["java"]
CMD [ "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-Duser.timezone=Asia/Seoul", "-jar", "checkll-0.0.1-SNAPSHOT.jar" ]
