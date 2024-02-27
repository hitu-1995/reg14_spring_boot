package com.cjc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.HumanBody;

public class Test {

	public static void main(String[] args) {
		System.out.println("main---start");

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println("Number of beans present in container " + context.getBeanDefinitionCount());
		HumanBody body = context.getBean(HumanBody.class);

		body.bodyCheckUp();

		System.out.println("main--ends");
	}
}
