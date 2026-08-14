FROM eclipse-temurin:21-jdk

WORKDIR /workspace

# Install basic tools needed by Maven wrapper
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

COPY mvnw .
COPY .mvn .mvn

RUN chmod +x mvnw

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]
