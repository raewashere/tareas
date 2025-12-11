# ------------ FASE 1: Build ------------
FROM maven:4.0.0-rc-5-eclipse-temurin-21 AS build

WORKDIR /app

# Copiar pom y descargar dependencias (cache)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar el código fuente
COPY src ./src

# Compilar proyecto
RUN mvn clean package -DskipTests


# ------------ FASE 2: Run ------------
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar 

# Ejecutar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080