package com.cjc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjc.service.College;
import com.cjc.service.University;

public class Test {

	public static void main(String[] args) {
		System.out.println("main---start");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        
        University university = applicationContext.getBean(University.class);
       
        university.startSemister();
        
		System.out.println("main--ends");
	}


	
	
	private static void m1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
            
		     String[] name = context.getBeanDefinitionNames();
		     for(String n :name)
		     {
		    	 System.out.println(" : "+n);
		     }
		  College college = context.getBean(College.class);
		  
		  college.addmission();
		  college.exammination();
	}
}
