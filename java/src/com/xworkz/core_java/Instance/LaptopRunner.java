package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {


		double[] price= {42000,45000,52000,59000};
		String[] processor= {"Core i3,Core i5,Core i9"};
		String[] modelNo= {"7848AB,4769SS,7958EW,7958Dn"};
		String[] items= {"Keyboard,Mouse,Antivirus"};
		
		Laptop buy=new Laptop("Abhijeet", "Dell", 975, "Good",true, price, processor, modelNo, items);
		buy.display();
		
	}

}
