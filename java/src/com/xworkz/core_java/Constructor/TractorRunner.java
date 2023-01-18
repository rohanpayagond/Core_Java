package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Tractor;

public class TractorRunner {

	public static void main(String[] args) {

		Tractor wheel=new Tractor();
		System.out.println("Default value = "+wheel.ownerName);
		System.out.println("Default value = "+wheel.brand);
		System.out.println("Default value = "+wheel.price);
		System.out.println("Default value = "+wheel.color);
		System.out.println("Default value = "+wheel.hp);
		System.out.println("Default value = "+wheel.model);
		
		Tractor wheel1=new Tractor("Kumar");
		System.out.println("Owner Name of the Tractor = "+wheel1.ownerName);
		
		System.out.println(System.lineSeparator());
		
		Tractor wheel2=new Tractor("Ajay","HMT");
		System.out.println("Owner Name of the Tractor = "+wheel2.ownerName);
		System.out.println("Brand of the Tractor = "+wheel2.brand);

		System.out.println(System.lineSeparator());

		Tractor wheel3=new Tractor("Samarth","John Deere",8.5);
		System.out.println("Owner Name of the Tractor = "+wheel3.ownerName);
		System.out.println("Brand of the Tractor = "+wheel3.brand);
		System.out.println("Price in Lakhs = "+wheel3.price);

		System.out.println(System.lineSeparator());

		Tractor wheel4=new Tractor("Raghu","New Holland",10,"Red");
		System.out.println("Owner Name of the Tractor = "+wheel4.ownerName);
		System.out.println("Brand of the Tractor = "+wheel4.brand);
		System.out.println("Price in Lakhs = "+wheel4.price);
		System.out.println("Color of Tractor = "+wheel4.color);

		System.out.println(System.lineSeparator());

		Tractor wheel5=new Tractor("Abhi","Tata",11.5,"Blue",32);
		System.out.println("Owner Name of the Tractor = "+wheel5.ownerName);
		System.out.println("Brand of the Tractor = "+wheel5.brand);
		System.out.println("Price in Lakhs = "+wheel5.price);
		System.out.println("Color of Tractor = "+wheel5.color);
		System.out.println("HP of Tractor = "+wheel5.hp);


		System.out.println(System.lineSeparator());

		Tractor wheel6=new Tractor("Chidanand","Swaraj",6.85,"Green",42,"744 FE");
		System.out.println("Owner Name of the Tractor = "+wheel6.ownerName);
		System.out.println("Brand of the Tractor = "+wheel6.brand);
		System.out.println("Price in Lakhs = "+wheel6.price);
		System.out.println("Color of Tractor = "+wheel6.color);
		System.out.println("HP of Tractor = "+wheel6.hp);
		System.out.println("Model of Tractor = "+wheel6.model);
		
		
		
		
		
	}

}
