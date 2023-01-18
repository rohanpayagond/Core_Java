package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.*;

public class TeaRunner {

	public static void main(String[] args) {

		
		
		Tea point=new Tea();
		System.out.println("Color of Tea = "+point.color);
		System.out.println("Name of Tea = "+point.name);
		System.out.println("Types of Tea = "+point.types);
		System.out.println("Taste of Tea = "+point.taste);
		System.out.println("Manufacturing Date of Tea = "+point.mfgDate);
		System.out.println("Expiry Date of Tea = "+point.expDate);
		System.out.println("Good for Health = "+point.goodForHealth);
		System.out.println("Chemicals in Tea = "+point.chemicals);
		
		
		point.ingredients="Soluble Proteins,Crude Fat";
		point.uses="Boost Immune,Fight Inflammation";
		point.phValue="5.5";
		point.sideEffects="Poor Sleep,Headaches";
		point.price=125;
		point.weightInGrams=500;
		point.addedFlavours=true;
		point.brand="Red Label,Tata";
	
		System.out.println("Ingredients = "+point.ingredients);
		System.out.println("Uses = "+point.uses);
		System.out.println("phValue is = "+point.phValue);
		System.out.println("Effects of Tea = "+point.sideEffects);
		System.out.println("Price = "+point.price);
		System.out.println("Weight in Grams = "+point.weightInGrams);
		System.out.println("Added Flavours = "+point.addedFlavours);
		System.out.println("Brands = "+point.brand);

		Tea biscuit=new Tea();
		biscuit.price=175;
		System.out.println("New Price of Tea = "+biscuit.price);
		
		
		System.out.println("End Of Properties");
		
	}

}
