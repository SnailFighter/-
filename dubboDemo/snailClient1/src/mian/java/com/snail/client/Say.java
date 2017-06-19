package com.snail.client;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snail.service.SayService;


public class Say {

	public static void main(String[] args) {
		Logger logger  = Logger.getLogger(Say.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"customer.xml"});
		try {
			context.start();
			SayService demoServer = (SayService) context.getBean("demoService");
			for(int i=0;i<5;i++) {
				String str  = demoServer.say("world");
				System.out.println("consumer-----"+str);
				logger.debug("str");
			}
		}finally {
			context.stop();
		}	
	}
}
