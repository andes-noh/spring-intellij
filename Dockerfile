FROM openjdk:11-jdk
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY /build/libs/*.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/app.jar"]