FROM openjdk:11
VOLUME /tmp
ADD target/*.jar /spring-docker-jenkins-integration-sampletest.jar
ENTRYPOINT ["java","-jar","/spring-docker-jenkins-integration-sampletest.jar"]