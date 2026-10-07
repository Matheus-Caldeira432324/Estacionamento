FROM eclipse-temurin:25-jdk AS build

WORKDIR /a

# Copia todos os ficheiros do projeto para o contentor
COPY . .

FROM eclipse-temurin:25-jre

WORKDIR /app

# O Maven gera o ficheiro .jar dentro da pasta /target (em vez de /build/libs)
COPY --from=build /app/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]
