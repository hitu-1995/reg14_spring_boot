package com.cjc.model;

public class Student {

	private int rollno;  // property name
	private String name;
	private String address;
	
	private Course course;
	
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		System.out.println("setRollno :: called");
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName :: called");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("setAddress :: called");
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + ", course=" + course + "]";
	}

	public Student(int rollno, String name, String address,Course course) {
		 System.out.println("Student :: Constructor :: Param");
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.course = course;
	}

	public Student() {
		  System.out.println("Student :: Constructor :: No-args");
	}

}
