package com.cjc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.cjc.model.Course;
import com.cjc.model.Student;

@Configuration
@ComponentScan(basePackages = "com.cjc")
public class BeanConfig {

	@Bean
	public Course	getCourse1() {
		Course course = new Course();
		course.setCname("Java");
		course.setPrice(2300);
		return course;
	}

	@Bean
	public Course	getCourse2() {
		Course course = new Course();
		course.setCname("Python");
		course.setPrice(3300);
		return course;
	}
	@Bean
	@Scope(scopeName = "prototype")
	public Student getStudent() {
		System.out.println("getStudent :: Called");
		Student student = new Student();
		student.setRollno(101);
		student.setName("Hitesh");
		//student.setCourse(getCourse());
		return student;
	}

}
