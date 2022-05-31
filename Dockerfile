FROM openjdk:8
COPY target/springdocker1-0.0.1-SNAPSHOT.jar springdocker1-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar" ,"springdocker1-0.0.1-SNAPSHOT.jar"]