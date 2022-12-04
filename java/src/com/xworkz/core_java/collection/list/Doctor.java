package com.xworkz.java.collection.list;

public class Doctor {
	
	String name;
	String place;
	String specialistIn;
	
	public Doctor(String name, String place, String specialistIn) {
		
		this.name=name;
		this.place=place;
		this.specialistIn=specialistIn;
		
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", place=" + place + ", specialistIn=" + specialistIn + "]";
	}
	

}
