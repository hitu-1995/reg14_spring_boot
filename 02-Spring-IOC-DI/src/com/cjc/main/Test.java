package com.cjc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.model.Student;

public class Test {

	public static void main(String[] args) {
      System.out.println("main---start");
      ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
      Student student = context.getBean(Student.class);
      System.out.println(student);
      System.out.println("main---ends");
	}
}
