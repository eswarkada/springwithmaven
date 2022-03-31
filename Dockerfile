FROM openjdk:11
VOLUME /tmp
ADD target/*.jar /spring-docker-jenkins-integration-sampletest.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/spring-docker-jenkins-integration-sampletest.jar"]
