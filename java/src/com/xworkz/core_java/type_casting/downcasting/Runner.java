package com.xworkz.core_java.type_casting.downcasting;

public class Runner {

	public static void main(String[] args) {
		
		Fruit fruit1 = new Apple();
		Apple apple=(Apple)fruit1;
		apple.fruit();
		apple.apple();
		
		System.out.println("-----------------");
		
		Fruit fruit2 = new Banana();
		Banana banana=(Banana)fruit2;
		banana.fruit();
		banana.banana();
		
		
	}

}
