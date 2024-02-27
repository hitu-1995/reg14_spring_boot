package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int rollno;
    private String name;
    private long mobile;
    private double marks;
    private String address;  // Pune , Mumbai
    
    // set/get
    // toString
  
	
    public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		System.out.println("*******************************");
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mobile=" + mobile + ", marks=" + marks + ", address="
				+ address + "]";
	}
    
    
}
