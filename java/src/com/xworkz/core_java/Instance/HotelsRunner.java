package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Hotels;

public class HotelsRunner {

	public static void main(String[] args) {

		
		 String[] location= {"Rajajinagar,RR Nagar,Jaynagar"};
		 String[] timing= {"9AM to 11PM","12PM to 12AM"};
		 int[] customer= {85,93,88,110};
		 String[] names= {"Abhimani,The Grand,Ocatve"};
		 String[] foodItems= {"North Indian,SOuth Indian,Chinese"};
		 double[] price= {1200,1847,1694,1475};

		 Hotels hotel=new Hotels("Sheetal Residency", "Sunil", false, true, 48, location, timing, customer, names, foodItems, price);
		 hotel.display();
		
	}

}
