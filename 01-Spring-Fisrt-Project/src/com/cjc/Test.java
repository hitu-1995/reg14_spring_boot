package com.cjc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

        apcContext();
	}

	private static void beanFactory() {
		System.out.println("main---start");
		Resource resource = new ClassPathResource("bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = factory.getBean(Student.class);
     	student.read();

		System.out.println("main---ends");
	}

	private static void apcContext() {
		System.out.println("main---start");

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = context.getBean("stu2",Student.class);
		System.out.println(student.hashCode());
		student.read();
		System.out.println("main---ends");
	}
}
