# hello-joker
 Cloud Native Java EE microservice

#Package war file
mvn clean package

#To Build docker Image
docker build -t localhost:5000/hello-joker:1 .

#To Run docker Image locally
docker run --rm -p 8080:8080 localhost:5000/hello-joker:1

#Curl Command
curl localhost:8080/hello-joker/resources/hello