package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Tea;

import com.Xworkz.preacher.*;

public class CigaretteRunner {

	public static void main(String[] args) {

		Cigarette smoke=new Cigarette();
		System.out.println("Color of Cigarette = "+smoke.color);
		System.out.println("Name = "+smoke.name);
		System.out.println("Types of Cigarette = "+smoke.types);
		System.out.println("Taste of Cigarette = "+smoke.taste);
		System.out.println("Manufacturing Date = "+smoke.mfgDate);
		System.out.println("Expiry Date = "+smoke.expDate);
		System.out.println("Good for Health = "+smoke.goodForHealth);
		System.out.println("Chemicals = "+smoke.chemicals);
		
		
		smoke.ingredients="Hydrogen Cyanide,Formaldehyde";
		smoke.uses="Antiseptic,Relieving Pain";
		smoke.components="Tobacco,Filter";
		smoke.sideEffects="Cancer,Heart Disease";
		smoke.price=180;
		smoke.weightInGrams=125;
		smoke.addedFlavours=true;
		smoke.brand="Davidoff,Maverick,Winston";
		
		System.out.println("Ingredients = "+smoke.ingredients);
		System.out.println("Uses = "+smoke.uses);
		System.out.println("Components are = "+smoke.components);
		System.out.println("Effects = "+smoke.sideEffects);
		System.out.println("Price = "+smoke.price);
		System.out.println("Weight in Grams = "+smoke.weightInGrams);
		System.out.println("Added Flavours = "+smoke.addedFlavours);
		System.out.println("Brands = "+smoke.brand);


		Cigarette bro=new Cigarette();
		bro.brand="Kool";
		System.out.println("New Brand of Cigarette = "+bro.brand);
		
		
		System.out.println("End Of Program");

		
		
	}

}
