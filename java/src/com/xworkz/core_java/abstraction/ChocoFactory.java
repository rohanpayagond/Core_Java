package com.xworkz.core_java.abstraction;

public abstract class ChocoFactory extends Chocolate{

	
	public void drying() {
		
		System.out.println("The washed beans are dried at certain temperature");
	}

	
	public abstract void breaking();
		
	
	public abstract void breakingIntoPieces();
	
	
}
