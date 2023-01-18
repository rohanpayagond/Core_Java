package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Chips;

public class ChipsRunner {

	public static void main(String[] args) {

		
		String[] ingredients= {"Potato,Salt,Onion Powder,Corn Starch"};
		String[] names= {"Tomato,Salted,Onion,Piri Piri"};
		int[] price= {5,10,20,50};
		double[] weight= {55,75,125,150};
		String[] flavours= {"Chilli,Classic Salted"};
		int[] salesPerDay= {25,50,78,121};
		
		Chips chips=new Chips("Akash Shop", "Parle's", true, false, 2022, ingredients, names, price, weight, flavours, salesPerDay);
		chips.display();
		
	}

}
