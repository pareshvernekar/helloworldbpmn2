package bpmn.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bpmn.sample.service.HelloWorldService;


@Configuration
public class HelloWorld {

	
	public static void main(String[] argv) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml", HelloWorld.class);
		
		HelloWorldService helloWorldService = context.getBean(HelloWorldService.class);
		helloWorldService.process();
	}
	
	
}
