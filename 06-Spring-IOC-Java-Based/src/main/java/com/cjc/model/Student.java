package com.cjc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int rollno;
	private String name;
	
	private Course course;

	
	public Course getCourse() {
		return course;
	}

	@Autowired
	@Qualifier("getCourse2")
	public void setCourse(Course course) {
		this.course = course;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + "]";
	}
	

}
