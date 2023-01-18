package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Boat;

public class BoatRunner {

	public static void main(String[] args) {

		Boat point=new Boat();
		System.out.println("Default Value = "+point.name);
		System.out.println("Default Value = "+point.color);
		System.out.println("Default Value = "+point.companyName);
		System.out.println("Default Value = "+point.type);
		System.out.println("Default Value = "+point.owner);
		
		
		Boat point1=new Boat("Pegasus");
		System.out.println("Name of the Boat = "+point1.name);
		
		
		Boat point2=new Boat("Liberty","Red");
		System.out.println("Name of the Boat = "+point2.name);
		System.out.println("Color of the Boat = "+point2.color);
		
		
		Boat point3=new Boat("Calypso","Blue","Pinta");
		System.out.println("Name of the Boat = "+point3.name);
		System.out.println("Price of the Boat = "+point3.color);
		System.out.println("CompanyName of the Boat = "+point3.companyName);
	
		Boat point4=new Boat("Serendipity",'S');
		System.out.println("CompanyName of the Boat = "+point4.companyName);
		System.out.println("Type of Boat = "+point4.type);
		
		Boat point5=new Boat('M',"Bismarck");
		System.out.println("Type of the Boat = "+point5.type);
		System.out.println("Name of Boat  = "+point5.name);
	
	
		Boat point6=new Boat('L',"Marcko","Carribean");
		System.out.println("Type of the Boat = "+point6.type);
		System.out.println("Owner of the Boat = "+point6.owner);
		System.out.println("CompanyName = "+point6.companyName);
	
		
		Boat point7=new Boat("White",'M',"Polo");
		System.out.println("Color of the Boat = "+point7.color);
		System.out.println("Type = "+point7.type);
		System.out.println("CompanyName = "+point7.companyName);

		
		Boat point8=new Boat("Yellow","Johnny",'L');
		System.out.println("Color of the Boat = "+point8.color);
		System.out.println("Owner of the Boat = "+point8.owner);
		System.out.println("Type of the Boat = "+point8.type);
	
		
		System.out.println("End of the Program");
		
		
	}
		

}
