FROM eclipse-temurin:17

LABEL mentainer="dschz@laposte.net"

WORKDIR /app

COPY target/demodocker-0.0.1-SNAPSHOT.jar /app/demodocker.jar

ENTRYPOINT ["java","-jar","demodocker.jar"]
