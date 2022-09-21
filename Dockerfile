FROM openjdk:11-jdk
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME

RUN addgroup -g 1001 -S appuser
RUN adduser -S appuser -u 1001

USER appuser

COPY --chown=appuser:appuser /build/libs/*.jar ./app.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/app.jar"]