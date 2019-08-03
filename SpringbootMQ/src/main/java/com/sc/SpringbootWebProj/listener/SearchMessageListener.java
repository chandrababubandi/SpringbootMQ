package com.sc.SpringbootWebProj.listener;

import javax.jms.Message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class SearchMessageListener {

	@JmsListener(destination = "in.search")	
	@SendTo("out.search")
	public String receiveMessage(Message jsonMessage) {
	
		System.out.println("Received Message: "+jsonMessage);
		
		return "Message Received ";
	}
}
