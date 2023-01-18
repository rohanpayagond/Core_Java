package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Bike;

public class BikeRunner {

	public static void main(String[] args) {

		
		double[] point= {83000,92000,88000,99000,85000};
		int[] temp= {100,110,125,150,220};
		String[] mark= {"Red,White,Blue,Black"};
		double[] can= {2020,2022,2018,2019};
		String[] value= {"Splendor,HF Deluxe,Splendor+"};
		String[] pin= {"India,America,Bangladesh"};
	
		Bike race=new Bike("Raghu", 6, 2020, "Hero", true, point, temp, mark, can, value, pin);
		race.display();
		
		
	}

}
