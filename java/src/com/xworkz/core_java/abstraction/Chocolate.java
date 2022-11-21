package com.xworkz.core_java.abstraction;

public abstract class Chocolate {  //abstract class
	
	public void rawMaterial() {  //concrete method
		
		System.out.println("Chocolate beans are brought from farm");
	}
	
	public void washing() {  //concrete method
		
		System.out.println("The beans are washed thoroughly");
		
	}
	
	public abstract void drying();  //abstract method
	
	public abstract void breaking();   //abstract method
	
	public abstract void breakingIntoPieces();  //abstract method
}
