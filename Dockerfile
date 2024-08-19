FROM eclipse-temurin:17
COPY target/automationbuild.jar automationbuild.jar
CMD  ["java","-jar","automationbuild.jar"]