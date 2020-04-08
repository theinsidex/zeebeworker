FROM openjdk:8
EXPOSE 8080
ADD target/order-file.jar order-worker.jar
ENTRYPOINT ["java","-jar","order-worker.jar"]