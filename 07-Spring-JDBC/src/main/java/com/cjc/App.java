package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.config.BeanConfig;
import com.cjc.service.DataBaseService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		DataBaseService baseService = context.getBean(DataBaseService.class);
		baseService.check();
	}
}
