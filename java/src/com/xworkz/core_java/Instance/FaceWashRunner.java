package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.FaceWash;

public class FaceWashRunner {

	public static void main(String[] args) {

		String[] ingredients= {"Glycerin,Salicylic Acid,Allontin,Critic Acid"};
		String[] names= {"Neem Facewash,Free Acne Facewash,Oilfree Facewash "};
		double[] weight= {158,215,199,269};
		char[] size= {'S','M','L'};
		String[] color= {"Green,Yellow,White,Black"};
		int[] price= {120,179,220,280};

		FaceWash face=new FaceWash(2018, 2022, "Himalayan", true, 100, ingredients, names, weight, size, color, price);
		face.display();
			
	}

}
