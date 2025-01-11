# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia el archivo JAR de tu aplicación en el contenedor
COPY target/back-0.0.1-SNAPSHOT.jar /app/back-0.0.1-SNAPSHOT.jar

COPY Wallet_YQ95ND3X7BHK88DG /app/Wallet

# Expón el puerto que la aplicación Spring Boot utilizará (por defecto 8080)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/back-0.0.1-SNAPSHOT.jar"]

