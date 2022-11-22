package com.xworkz.core_java.enums;

import com.xworkz.core_java.enums.RollsRoyce.Names;

public class ColorDemo {		//enum declared outside any class

	public static void main(String[] args) {
		
		Color color=Color.ARCTICWHITE;
		System.out.println("Color of RollsRoyce : "+color);
		
		Color color1=Color.GRAPHITE;
		System.out.println("Car color : "+color1);
		
		System.out.println("Name of the Car : "+Names.PHANTOM);
	}

}
