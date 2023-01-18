package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Bicycle;

public class BicycleRunner {

	public static void main(String[] args) {

		
		String[] color= {"Red,Black,Blue,White"};
		double[] price= {15000,17500,19500,21000};
		String[] loation= {"Rajinagar,Vijaynagar,Majestic"};
		String[] accessories= {"Bag,Water Bottle,Seat cover"};
		String[] name= {"Raven,Pegasus,Bumblebee,Zeus"};
		int[] noOfSales= {120,95,184,220};

		Bicycle cycle=new Bicycle("Firefly", "Maruti", "Raghu", 18, false, color, price, loation, accessories, name, noOfSales);
		cycle.display();
			
	}

}
