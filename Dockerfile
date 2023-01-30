FROM openjdk:8u292

LABEL MAINTAINER=Andy
WORKDIR /apps
ADD target/spring-boot-test2-0.0.1-SNAPSHOT.jar /apps/
CMD ["java","-jar","spring-boot-test2-0.0.1-SNAPSHOT.jar"]