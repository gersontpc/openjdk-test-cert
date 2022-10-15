FROM adoptopenjdk/openjdk11:jdk-11.0.16.1_1-debian-slim
ENV url.test=$URL_TEST

COPY target/app-1.0.jar app.jar

ENTRYPOINT [ "sh", "-c", "java -jar -Durl.test=$URL_TEST /app.jar" ]

WORKDIR /app
