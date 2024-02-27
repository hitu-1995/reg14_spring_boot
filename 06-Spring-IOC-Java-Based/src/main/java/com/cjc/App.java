package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjc.config.BeanConfig;
import com.cjc.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		Student student1 = context.getBean(Student.class);
	    System.out.println(student1);
	    Student student2 = context.getBean(Student.class);
	    System.out.println(student2);
	    
	    System.out.println("student1 :   "+student1.hashCode());
	    System.out.println("student2 :   "+student2.hashCode());
	    
		System.out.println("main---ends");
	}
}
