FROM openjdk:11
WORKDIR /var/lib/docker/
COPY /target/dconsumer.jar  .
#EXPOSE 8080
ENTRYPOINT ["java","-jar","dconsumer.jar"]
#CMD ["-start"]