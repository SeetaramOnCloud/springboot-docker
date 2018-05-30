FROM java:8
EXPOSE 8080
ADD target/SpringBootApp.jar SpringBootApp.jar
ENTRYPOINT ["java","-jar","SpringBootApp.jar"]