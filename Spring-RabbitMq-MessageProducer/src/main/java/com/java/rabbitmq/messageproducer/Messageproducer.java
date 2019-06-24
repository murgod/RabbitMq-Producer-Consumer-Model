package com.java.rabbitmq.messageproducer;

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
		String message  = msg + " message_id = " +msg_id++;
		amqpTemplate.convertAndSend(exchange, routingKey, message);
		System.out.println("[PRODUCER] Sending message = " + message );
	}
}

