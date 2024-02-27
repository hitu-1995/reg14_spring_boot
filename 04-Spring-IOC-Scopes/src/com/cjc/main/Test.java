package com.cjc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Student;

public class Test {

	public static void main(String[] args) {
		System.out.println("main---start");

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	
//		Student s1 = context.getBean(Student.class);
//		System.out.println("s1   : "+s1.hashCode());
//		Student s2 = context.getBean(Student.class);
//		System.out.println("s2  :  "+s2.hashCode());
//		
//		s1.read();
//		s2.read();
		
		System.out.println("main--ends");
	}
}
