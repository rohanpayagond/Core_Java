package com.xworkz.core_java.interfaces.multiple_inheritance.animal_example;

public class Animals implements Cat,Dog,Rabbit {

	public void homeDog() {
		
		System.out.println("Dog should be adopted by every home...");
	}

	
	public void homeCat() {

		System.out.println("Cat adoption centres are seen less in the country...");
	}


	
	public void homeRabbit() {
		
		System.out.println("Rabbits are not adopted in several country...");
	}
	
	

}
