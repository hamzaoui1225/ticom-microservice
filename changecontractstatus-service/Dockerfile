#FROM openjdk:17-alpine
#VOLUME /tmp
#ADD target/*.jar app.jar
#ENV JAVA_OPTS=""
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
#
FROM alpine:3.19.1
RUN apk --no-cache update &&  \
    apk add --no-cache openjdk17-jre-headless
WORKDIR /app
COPY target/*.jar app.jar
CMD [ "java", "-jar", "app.jar" ]