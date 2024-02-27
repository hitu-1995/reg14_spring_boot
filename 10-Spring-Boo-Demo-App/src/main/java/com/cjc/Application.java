package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("main----starts");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Number of Beans : "+context.getBeanDefinitionCount());
		System.out.println("implementation class : "+context.getClass().getName());
		System.out.println("main---ends");
	}
    @EventListener(classes = ApplicationStartedEvent.class)
	public void call() {
		System.out.println("******* Application---------Started **********");
	}
}
