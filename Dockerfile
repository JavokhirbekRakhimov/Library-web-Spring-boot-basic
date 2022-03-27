FROM maven:3.6.3-openjdk-11-slim as BUILDER
ARG VERSION=0.0.1-SNAPSHOT
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/
RUN mvn clean package

COPY target/Library-web-${VERSION}.jar target/application.jar
FROM openjdk-11.0.14
WORKDIR /app/
COPY --from=BUILDER /build/target/aplication.jar /app/
CMD java-jar /app/application.jar

