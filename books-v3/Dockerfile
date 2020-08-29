FROM gradle:6.3-jdk14

ADD src src
ADD build.gradle .
ADD settings.gradle .

RUN gradle build

FROM openjdk:14-jdk-alpine

COPY --from=0 /home/gradle/build/libs/books-0.2.jar books.jar

EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -jar /books.jar