FROM openjdk:8-jre-alpine
RUN mkdir /app
RUN cd /app
COPY  target/ms-ventas-0.0.1-SNAPSHOT.jar /app/ms-ventas-0.0.1-SNAPSHOT.jar
WORKDIR /app
CMD ["java","-jar", "ms-ventas-0.0.1-SNAPSHOT.jar"]