package com.cjc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.cjc.model.Student;

@Configuration
@ComponentScan(basePackages = "com.cjc")
@PropertySource(value = "info.properties")
public class BeanConfiguration {

//	@Bean
//	public Student	getStudent(@Value("${student.rollno}") int rollno, @Value("${student.name}") String name) {
//		Student stu = new Student();
//		
//		stu.setRollno(rollno);
//		stu.setName(name);
//		
//		
//		return stu;
//	}
}
