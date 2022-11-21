package com.xworkz.core_java.encapsulation.set_get.bike_example;

public class Bike {
	
	private String company;
	private String name;
	private double price;
	private String color;
	private int gears;
	private boolean comfortable;
	private int maxSpeed;
	
	public Bike() {
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public boolean isComfortable() {
		return comfortable;
	}

	public void setComfortable(boolean comfortable) {
		this.comfortable = comfortable;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	
}
