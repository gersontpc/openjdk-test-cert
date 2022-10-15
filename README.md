### Openjdk test certificate

The purpose of this app is to get an address to test if the certificate is valid.

### Requirements
maven
docker

### OS/ARCH Support:

linux/amd64  
linux/arm/v7  
linux/arm64/v8  
linux/s390x  

Build the app, enter the /app path and run:

```bash
mvn compile
```

After compiling, build the Docker image:

```bash
docker image build -t openjdk11testcert:1.0
```

Running the application with Docker:

```bash
docker container run -e "URL_TEST=https://google.com.br" openjdk11testcert:1.0

```

Log output:

```bash
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.2.RELEASE)

2022-10-15 04:47:58.551  INFO 7 --- [           main] com.journaldev.spring.Main               : Starting Main v1.0 on c8642516c586 with PID 7 (/app.jar started by root in /app)
2022-10-15 04:47:58.553  INFO 7 --- [           main] com.journaldev.spring.Main               : No active profile set, falling back to default profiles: default
2022-10-15 04:47:59.138  INFO 7 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-10-15 04:47:59.147  INFO 7 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-10-15 04:47:59.147  INFO 7 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.37]
2022-10-15 04:47:59.192  INFO 7 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-10-15 04:47:59.193  INFO 7 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 605 ms
Get na url: https://google.com.br
Result <!doctype html><html itemscope="" itemtype="http://schema.org/WebPage" lang="pt-BR"><head><meta content="text/html; charset=UTF-8" http-equiv="Content-Type"><meta content="/logos/doodles/2022/teachers-day-2022-october-15-6753651837109522-law.gif" itemprop="image"><meta ...</body></html>
2022-10-15 04:48:02.252  INFO 7 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2022-10-15 04:48:02.359  INFO 7 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-10-15 04:48:02.368  INFO 7 --- [           main] com.journaldev.spring.Main               : Started Main in 4.193 seconds (JVM running for 4.489)

```

### 📝 License
This project is [MIT](LICENSE) licensed.