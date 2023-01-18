package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.*;

public class RMDRunner {

	public static void main(String[] args) {

		RMD pack=new RMD();
		System.out.println("Color = "+pack.color);
		System.out.println("Name = "+pack.name);
		System.out.println("Types  = "+pack.types);
		System.out.println("Taste  = "+pack.taste);
		System.out.println("Manufacturing Date = "+pack.mfgDate);
		System.out.println("Expiry Date = "+pack.expDate);
		System.out.println("Good for Health = "+pack.goodForHealth);
		System.out.println("Chemicals = "+pack.chemicals);
		
		
		pack.ingredients="Betelnuts,Cardamom";
		pack.owner="Rasiklal Manickchand Dariwal";
		pack.components="Tobacco,Kesar";
		pack.sideEffects="Oral Cancer,Liver Damage";
		pack.price=25;
		pack.weightInGrams=12;
		pack.addedFlavours=true;
		pack.brand="Manickchand Group";
		
		System.out.println("Ingredients = "+pack.ingredients);
		System.out.println("Uses = "+pack.owner);
		System.out.println("Components are = "+pack.components);
		System.out.println("Effects = "+pack.sideEffects);
		System.out.println("Price = "+pack.price);
		System.out.println("Weight in Grams = "+pack.weightInGrams);
		System.out.println("Added Flavours = "+pack.addedFlavours);
		System.out.println("Brands = "+pack.brand);


		RMD piece=new RMD();
		piece.price=18;
		System.out.println("New Price  = "+piece.price);
		
		
		System.out.println("End Of Program");

		
		
	}

}
