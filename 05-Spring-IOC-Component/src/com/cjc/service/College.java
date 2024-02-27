package com.cjc.service;

import org.springframework.stereotype.Component;

@Component // this annotation is use to represent our java class as a spring bean
public class College {

	public College() {
     System.out.println("College :: Constructor");
	}

	public void addmission() {
		System.out.println("Addmission in progress........");
	}

	public void exammination() {
		System.out.println("Examination in progress..........");
	}
}
