# Usar la imagen base de OpenJDK 21
FROM openjdk:21-jdk

# Copiar el archivo JAR generado por Spring Boot a la raíz del contenedor
COPY target/tareas-1.0.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]

# Exponer el puerto 8080
EXPOSE 8080