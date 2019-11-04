mvn clean install
docker build -t spring-mvc .
docker rm spring-mvc
docker run -d -p 8084:8080 --name demo spring-mvc