package com.xworkz.core_java.encapsulation.set_get.bike_example;

public class BikeRunner {

	public static void main(String[] args) {

		Bike bike=new Bike();
		
		bike.setCompany("TVS");
		bike.setColor("Green");
		bike.setComfortable(true);
		bike.setGears(5);
		bike.setMaxSpeed(220);
		bike.setName("Kawasaki");
		bike.setPrice(3.75);
		
		
		System.out.println("Bike company= " + bike.getCompany());
		System.out.println("Name of the Bike = " + bike.getName());
		System.out.println("Bike color= " + bike.getColor());
		System.out.println("Bike gears= " + bike.getGears());
		System.out.println("Max Speed of the Bike = " + bike.getMaxSpeed());
		System.out.println("Is it comfortable = " + bike.isComfortable());
		System.out.println("Price of the Bike = " + bike.getPrice() +"Lakhs");
		
	}

}
