# RabbitMq-Producer-Consumer-Model
This project is a producer-consumer model with RabbitMq cluster configuration.

# Steps to bring up the setup:

 1.Install, configure and run Rabbitmq in a cluster.
   - Create a network for the containers.
     $docker network create rabbitmq-cluster
   
   - Run docker container.
     #RabbitMq-Producer-Consumer-Model/RabbitMq-configuration/RabbitMQ-cluster-configuration-docker$
      docker-compose up -d
    
   - Import rabbit mq broker definitions.
     Goto: http://localhost:15672/#/ 
     From the Overview tab import broker definitions(rabbitmq_broker_definitions.json) file. 
     

 2.Run producer application.
    #RabbitMq-Producer-Consumer-Model/Spring-RabbitMq-MessageProducer$ mvn clean install; mvn spring-boot:run
    
 3.Run consumer application.
    #RabbitMq-Producer-Consumer-Model/Spring-RabbitMq-MessageConsumer$ mvn clean install; mvn spring-boot:run
    
 4.Analyse results
 
 
 # References
 https://github.com/bijukunjummen/docker-rabbitmq-cluster
 
