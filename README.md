This is a sample spring micro-service application that uses Kafka API to read messages from the Kafka server.

Prerequisites:
Connect to zookeeper and kafka server using the below commands.

# Start Zookeeper
- .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start Kafka Server
- .\bin\windows\kafka-server-start.bat .\config\server.properties

# Create Kafka Topic
- .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic KafkaProducerTopic