package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Earphone;

public class EarphoneRunner {

	public static void main(String[] args) {

		String[] color= {"White,Black,Blue,Red"};
		String[] country= {"India,China,America"};
		int[] price= {999,759,799,699};
		double[] weight= {98,112,125,110};
		
		Earphone ear=new Earphone("Boat", true, true, 2022, 1, color, country, price, weight);
		ear.display();
		
		
	}

}
