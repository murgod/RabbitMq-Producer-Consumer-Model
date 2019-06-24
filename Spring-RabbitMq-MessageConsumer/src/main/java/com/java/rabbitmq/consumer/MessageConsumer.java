package com.java.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @Autowired
    Messageproducer messageproducer;

	@RabbitListener(queues="${pydt.rabbitmq.queue}")
    public void recievedMessage(String msg) {
        System.out.println("[CONSUMER] Recieved Message: " + msg);

        messageproducer.produceMsg(msg);

    }

}
