# ===============================
# Etapa 1: Build da aplicação
# ===============================
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copia apenas os arquivos do wrapper primeiro
COPY mvnw .
COPY .mvn .mvn

# Dá permissão de execução no mvnw
RUN chmod +x ./mvnw

# Copia o restante do projeto
COPY . .

# Faz o build (sem rodar testes para acelerar deploy)
RUN ./mvnw clean package -DskipTests

# ===============================
# Etapa 2: Executar a aplicação
# ===============================
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copia apenas o JAR da etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Define variáveis de ambiente padrão
ENV JAVA_OPTS="-Xms256m -Xmx512m"

# Expõe a porta que o Render vai usar
EXPOSE 8080

# Executa a aplicação
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
