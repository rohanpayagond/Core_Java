package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Chain;

public class ChainRunner {

	public static void main(String[] args) {

		
		Chain ring=new Chain();
		System.out.println("Default value = "+ring.type);
		System.out.println("Default value = "+ring.price);
		System.out.println("Default value = "+ring.length);
		System.out.println("Default value = "+ring.material);
		System.out.println("Default value = "+ring.weight);
		System.out.println("Default value = "+ring.stolen);
		System.out.println("Default value = "+ring.usedFor);
		System.out.println("Default value = "+ring.fresh);
		
		Chain ring1=new Chain("Curb Chain");
		System.out.println("Type of Chain = "+ring1.type);
		
		System.out.println(System.lineSeparator());
		
		
		Chain ring2=new Chain("Curb Chain",2154);
		System.out.println("Type of Chain = "+ring2.type);
		System.out.println("Price of Chain = "+ring2.price);
		
		System.out.println(System.lineSeparator());

		
		Chain ring3=new Chain("Curb Chain",2154,22.5);
		System.out.println("Type of Chain = "+ring3.type);
		System.out.println("Price of Chain = "+ring3.price);
		System.out.println("Length of Chain = "+ring3.length);
		
		System.out.println(System.lineSeparator());

		
		Chain ring4=new Chain("Curb Chain",2154,22.5,"Sterling Silver");
		System.out.println("Type of Chain = "+ring4.type);
		System.out.println("Price of Chain = "+ring4.price);
		System.out.println("Length of Chain = "+ring4.length);
		System.out.println("Material = "+ring4.material);
		
		System.out.println(System.lineSeparator());

		
		Chain ring5=new Chain("Curb Chain",2154,22.5,"Sterling Silver",100.25);
		System.out.println("Type of Chain = "+ring5.type);
		System.out.println("Price of Chain = "+ring5.price);
		System.out.println("Length of Chain = "+ring5.length);
		System.out.println("Material = "+ring5.material);
		System.out.println("Weight = "+ring5.weight);
		
		System.out.println(System.lineSeparator());
		
		
		Chain ring6=new Chain("Curb Chain",2154,22.5,"Sterling Silver",100.25,true);
		System.out.println("Type of Chain = "+ring6.type);
		System.out.println("Price of Chain = "+ring6.price);
		System.out.println("Length of Chain = "+ring6.length);
		System.out.println("Material = "+ring6.material);
		System.out.println("Weight = "+ring6.weight);
		System.out.println("Stolen = "+ring6.stolen);
		
		System.out.println(System.lineSeparator());
		
		
		Chain ring7=new Chain("Curb Chain",2154,22.5,"Sterling Silver",100.25,true,"Wearing");
		System.out.println("Type of Chain = "+ring7.type);
		System.out.println("Price of Chain = "+ring7.price);
		System.out.println("Length of Chain = "+ring7.length);
		System.out.println("Material = "+ring7.material);
		System.out.println("Weight = "+ring7.weight);
		System.out.println("Stolen = "+ring7.stolen);
		System.out.println("Used For = "+ring7.usedFor);
		
		System.out.println(System.lineSeparator());
		
		
		Chain ring8=new Chain("Curb Chain",2154,22.5,"Sterling Silver",100.25,true,"Wearing",false);
		System.out.println("Type of Chain = "+ring8.type);
		System.out.println("Price of Chain = "+ring8.price);
		System.out.println("Length of Chain = "+ring8.length);
		System.out.println("Material = "+ring8.material);
		System.out.println("Weight = "+ring8.weight);
		System.out.println("Stolen = "+ring8.stolen);
		System.out.println("Used For = "+ring8.usedFor);
		System.out.println("Is it Fresh to Wear = "+ring8.fresh);

		
	}

}
