package com.java.rabbitmq.messageproducer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class MessageConsumer {
    @Autowired
    Messageproducer messageproducer;

    @RabbitListener(queues="${pydt.rabbitmq.queue}")
    public void recievedMessage(String msg) {
        System.out.println("[PRODUCER] Recieved Message: " + msg);

    }

}
