package com.cjc.model;

public class HumanBody {

	private Heart heart;
	private HumanEye eye;

	public HumanBody(Heart heart, HumanEye eye) {
		System.out.println("Param :: const...");
		this.heart = heart;
		this.eye = eye;
	}

	public void setEye(HumanEye eye) {
		System.out.println("setEye :: Called");
		this.eye = eye;
	}

	public void setHeart(Heart heart) {
		System.out.println("setHeart :: Called");
		this.heart = heart;
	}

	public void bodyCheckUp() {
		System.out.println("Human Body Checkup start....");
		if (heart != null) {
			heart.pump();
			eye.eye();
		} else
			System.out.println("Human is Dead...");
		System.out.println("Human Body Checkup ends....");

	}

}
