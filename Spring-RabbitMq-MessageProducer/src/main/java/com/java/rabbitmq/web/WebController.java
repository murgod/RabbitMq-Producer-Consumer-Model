package com.java.rabbitmq.web;

import com.java.rabbitmq.messageproducer.Messageproducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {
	
	@Autowired
	Messageproducer messageproducer;
	
	@RequestMapping("/send")
	public String sendMsg(@RequestParam("msg")String msg){
		messageproducer.produceMsg(msg);
		return "Done";
	}


	@RequestMapping(method = RequestMethod.POST, value = "/send-msg", produces = "application/json")
	public String sendMsg1(@RequestBody String msg) {
		messageproducer.produceMsg(msg);
		return "Done";
	}
}
