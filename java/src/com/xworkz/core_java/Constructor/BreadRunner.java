package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Bread;

public class BreadRunner {
	
	public static void main(String[] args) {
	
		Bread slice=new Bread();
		System.out.println("Default Value = "+slice.type);
		System.out.println("Default Value = "+slice.shape);
		System.out.println("Default Value = "+slice.price);
		System.out.println("Default Value = "+slice.quantity);
		System.out.println("Default Value = "+slice.companyName);
		
		
		Bread slice1=new Bread('S',"Round");
		System.out.println("Type of the Bread = "+slice1.type);
		System.out.println("Shape of the Bread = "+slice1.shape);
		
		
		Bread slice2=new Bread(25,125.5);
		System.out.println("Price of the Bread = "+slice2.price);
		System.out.println("Quantity of the Bread = "+slice2.quantity);
		
	
		Bread slice3=new Bread(42.5,"BigBread");
		System.out.println("Quantity of the Bread = "+slice3.quantity);
		System.out.println("Company of the Bread = "+slice3.companyName);
		
	
		Bread slice4=new Bread("Tata","Square",'M');
		System.out.println("Company of the Bread = "+slice4.companyName);
		System.out.println("Shape of the Bread = "+slice4.shape);
		System.out.println("Type of the Bread = "+slice4.type);

		Bread slice5=new Bread("Nestle",150.5,35);
		System.out.println("Company of the Bread = "+slice5.companyName);
		System.out.println("Quantity of the Bread = "+slice5.quantity);
		System.out.println("Price of the Bread = "+slice5.price);

		Bread slice6=new Bread('L',45);
		System.out.println("Type of the Bread = "+slice6.type);
		System.out.println("Price of the Bread = "+slice6.price);
		
		Bread slice7=new Bread(45.2,40);
		System.out.println("Quantity of the Bread = "+slice7.quantity);
		System.out.println("Price of the Bread = "+slice7.price);
		
		Bread slice8=new Bread('S',135.9,20);
		System.out.println("Type of the Bread = "+slice8.type);
		System.out.println("Quantity of the Bread = "+slice8.quantity);
		System.out.println("Price of the Bread = "+slice8.price);

		
	
}

}
