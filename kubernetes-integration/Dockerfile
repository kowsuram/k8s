FROM openjdk:11

WORKDIR /kubentetes-integration

COPY build/libs/kubernetes-integration-0.0.1-SNAPSHOT.jar .

RUN chmod +x *.jar

ENTRYPOINT java -jar *.jar
