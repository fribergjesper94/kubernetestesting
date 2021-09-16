FROM openjdk:11
COPY target/*-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]