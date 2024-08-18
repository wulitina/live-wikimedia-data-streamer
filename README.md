
![img.png](readme-pic%2Fimg.png)


# Live Wikimedia Data Streamer
This project demonstrates a real-time streaming data pipeline using Apache Kafka and Spring Boot. It consists of two main components:

- Kafka Producer: Streams real-time data from Wikimedia and produces it to a Kafka topic.
- Kafka Consumer: Consumes data from the Kafka topic and saves it to a MySQL database.

## Introduction
The Live Wikimedia Data Streamer project is designed to demonstrate the integration of Apache Kafka with Spring Boot to build a real-time data streaming application. The producer fetches live changes from Wikimedia and sends them to a Kafka topic, while the consumer reads the data from the Kafka topic and stores it in a MySQL database.


## Architecture
The architecture of this project includes the following components:

- Kafka Producer: A Spring Boot application that uses EventSource to stream live changes from Wikimedia and publishes them to a Kafka topic.
- Kafka Consumer: A Spring Boot application that consumes messages from the Kafka topic and persists them into a MySQL database.
## Components
### Kafka Producer
- KafkaTopicConfig.java: Configuration class for Kafka topics.
- SpringbootProducerApplication.java: Main class to run the Spring Boot producer application.
- WikimediaChangesHandler.java: Handles the events fetched from Wikimedia.
- WikiMediaChangesProducer.java: Produces the messages to the Kafka topic.
### Kafka Consumer
- WikimediaData.java: Entity class for Wikimedia data.
- WikimediaDataRepository.java: Repository interface for Wikimedia data.
- KafkaDatabaseConsumer.java: Consumes messages from the Kafka topic.
- SpringBootConsumerApplication.java: Main class to run the Spring Boot consumer application.

## Setup and Installation（Prerequisites）
- Java 17
- Apache Kafka
- MySQL
- Maven
- Postman (for API testing)


## Installation Steps
1. Clone the repository:

```bash
git clone https://github.com/wulitina/live-wikimedia-data-streamer.git
cd live-wikimedia-data-streamer
```
2. Set up MySQL database:

```bash
CREATE DATABASE wikimedia;
```

3. Configure application properties:

- Update `kafka-consumer-database/src/main/resources/application.properties` with your MySQL username and password.
- Ensure Kafka broker settings are correctly configured in `application.properties` files for both producer and consumer.
4. Build the project:

```bash
mvn clean install
```
## Running the Application
### Start Kafka and Zookeeper
Ensure Kafka and Zookeeper are running on your local machine.
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties
```

### Run Kafka Producer
Navigate to the kafka-producer-wikimedia directory and start the producer application:

```bash
cd kafka-producer-wikimedia
mvn spring-boot:run
```
### Run Kafka Consumer
Navigate to the kafka-consumer-database directory and start the consumer application:

```bash
cd kafka-consumer-database
mvn spring-boot:run
```


## Technologies Used
- Java: Programming language used to develop the application.
- Spring Boot: Framework to create stand-alone, production-grade Spring-based applications.
- Spring Data JPA (Hibernate): To persist data in the MySQL database.
- Apache Kafka: Distributed event streaming platform used to stream the data.
- MySQL: Relational database management system.
- Maven: Build automation tool used to manage project dependencies.
- Postman: API testing tool used to test the endpoints.

