FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/k8sapp-3.2.3.jar k8sapp-3.2.3.jar
ENTRYPOINT [ "java","-jar","/k8sapp-3.2.3.jar"]