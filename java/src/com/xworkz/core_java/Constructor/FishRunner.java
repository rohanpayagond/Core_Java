package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.*;

public class FishRunner {

	public static void main(String[] args) 
	{

		Fish ocean=new Fish();
		System.out.println("Default Value = "+ocean.name);
		System.out.println("Default Value = "+ocean.type);
		System.out.println("Default Value = "+ocean.price);
		System.out.println("Default Value = "+ocean.length);
		System.out.println("Default Value = "+ocean.weight);
		
		
		Fish ocean1=new Fish("Nemo");
		System.out.println("Name of the Fish = "+ocean1.name);
		
		
		Fish ocean2=new Fish("Sharkbite","Swordfish");
		System.out.println("Name of the Fish = "+ocean2.name);
		System.out.println("Type of the Fish = "+ocean2.type);
		
		
		Fish ocean3=new Fish("Blue Shark",3500);
		System.out.println("Name of the Fish = "+ocean3.name);
		System.out.println("Price of the Fish = "+ocean3.price);
	
		Fish ocean4=new Fish(4000,1250.67);
		System.out.println("Price of the Fish = "+ocean4.price);
		System.out.println("Weight of Fish in kg = "+ocean4.weight);
		
		Fish ocean5=new Fish("Tiger Shark",18.5);
		System.out.println("Name of the Fish = "+ocean5.name);
		System.out.println("Length of Fish in meters = "+ocean5.length);
	
	
		Fish ocean6=new Fish("Bull Shark",4200,1450.9);
		System.out.println("Name of the Fish = "+ocean6.name);
		System.out.println("Price of the Fish = "+ocean6.price);
		System.out.println("Weight of the Fish = "+ocean6.weight);
	
		
		Fish ocean7=new Fish(17.4,1190.67);
		System.out.println("Length of the Fish = "+ocean7.length);
		System.out.println("Weight of Fish in kg = "+ocean7.weight);
		
		Fish ocean8=new Fish("Spinner Shark",1647.84,15.89);
		System.out.println("Name of the Fish = "+ocean8.name);
		System.out.println("Weight of the Fish = "+ocean8.weight);
		System.out.println("Length of the Fish = "+ocean8.length);
	
		
		System.out.println("End of the Program");
		
		
	}


}
