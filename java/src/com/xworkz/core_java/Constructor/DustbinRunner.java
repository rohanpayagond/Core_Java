package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Dustbin;
import com.Xworkz.preacher.RMD;

public class DustbinRunner {

	public static void main(String[] args) {

		
		Dustbin bin=new Dustbin();
		System.out.println("Color = "+bin.color);
		System.out.println("Name = "+bin.name);
		System.out.println("Types  = "+bin.types);
		System.out.println("Taste  = "+bin.shape);
		System.out.println("Manufacturing Date = "+bin.mfgDate);
		System.out.println("Expiry Date = "+bin.expDate);
		System.out.println("Good for Health = "+bin.removable);
		System.out.println("Chemicals = "+bin.flexible);
		
		
		bin.materials="Polythene,Thermoplastic Polymer";
		bin.uses="Collecting Foodwaste,Collecting Paper";
		bin.advantages="Improve Efficiency,Reduces Trash";
		bin.badOdor=true;
		bin.price=125;
		bin.weightInGrams=350;
		bin.characters="Soft-closing,Stay-open";
		bin.inventor="Eugene Poubelle";
		
		System.out.println("Ingredients = "+bin.materials);
		System.out.println("Uses = "+bin.uses);
		System.out.println("Components are = "+bin.advantages);
		System.out.println("Effects = "+bin.badOdor);
		System.out.println("Price = "+bin.price);
		System.out.println("Weight in Grams = "+bin.weightInGrams);
		System.out.println("Added Flavours = "+bin.characters);
		System.out.println("Brands = "+bin.inventor);


		Dustbin trash=new Dustbin();
		trash.color="Red";
		System.out.println("New Color  = "+trash.color);
		
		
		System.out.println("End Of Program");


		
		
		
		
		
		
		
		
		
	}

}
