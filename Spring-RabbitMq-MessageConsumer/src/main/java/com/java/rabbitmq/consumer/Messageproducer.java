package com.java.rabbitmq.consumer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Messageproducer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Value("${paydiant.rabbitmq.exchange}")
    private String exchange;

    @Value("${paydiant.rabbitmq.routingkey}")
    private String routingKey;

    private static int msg_id = 0;

    public void produceMsg(String msg){
        String message  = msg;
        amqpTemplate.convertAndSend(exchange, routingKey, message);
        System.out.println("[CONSUMER] : Sending message = " + message );
    }
}


