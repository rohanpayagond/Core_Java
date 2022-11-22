package com.xworkz.core_java.enums;

public class RollsRoyce {
	
	enum Names{			//enum declared inside a class
		
		GHOST, PHANTOM, DAWN, SILVERWRAITH, CULLINAN, COUPE;
	}

	public static void main(String[] args) {
		
		Names a=Names.GHOST;
		System.out.println("Name of the Car = "+a);
		
		Names b=Names.COUPE;
		System.out.println("Name of the Car = "+b);
		
		Names c=Names.DAWN;
		System.out.println("Name of Car = "+c);

	}

}
