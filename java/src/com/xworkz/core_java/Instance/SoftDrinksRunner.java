package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.SoftDrinks;

public class SoftDrinksRunner {

	public static void main(String[] args) {

		

		String[] color= {"Green,White,Red,Orange"};
		String[] name= {"Sprite,Mirinda,MountainDew"};
		char[] size= {'L','M','S'};
		double[] price= {40,88,150,225};
		
		SoftDrinks drink=new SoftDrinks(250, 2020, 2023, false, true, color, name, size, price);
		drink.display();
		
	}

}
