FROM eclipse-temurin:11-jdk-alpine AS builder
WORKDIR /opt/app/
COPY src src/
COPY gradle gradle/
COPY build.gradle settings.gradle gradlew ./
RUN ./gradlew assemble

FROM eclipse-temurin:11-jre-alpine AS runtime
COPY --from=builder /opt/app/build/libs/product-0.0.1-SNAPSHOT.jar /opt/app.jar
ENTRYPOINT java -jar /opt/app.jar
