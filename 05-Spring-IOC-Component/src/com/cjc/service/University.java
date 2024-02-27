package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class University {

	private College college; // null

	public University(College college) {
		System.out.println("param ---- constructor");
		this.college = college;
	}

	@Autowired
	public void setCollege(College college) {
		System.out.println("setCollege  :: Called");
		this.college = college;
	}

	public University() {
		System.out.println("University :: Constructor");
	}

	public void startSemister() {
		System.out.println("semister starts.........");
		college.addmission();
		college.exammination();
	}
}
