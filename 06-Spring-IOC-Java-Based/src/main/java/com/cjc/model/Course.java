package com.cjc.model;

public class Course {

	private String cname;
	private double price;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + ", price=" + price + "]";
	}

}
