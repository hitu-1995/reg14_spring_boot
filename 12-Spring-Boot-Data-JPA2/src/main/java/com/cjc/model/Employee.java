package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int eid;
	private String name;
	private String department;
	private String designation;
	private double salary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", department=" + department + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}

	public Employee(int eid, String name, String department, String designation, double salary) {
		this.eid = eid;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
	}

	public Employee() {
	}

}
