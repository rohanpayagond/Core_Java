package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Bakery;

public class BakeryRunner {

	public static void main(String[] args) {

		String[] items= {"Chips,Cakes,Chocolates,Biscuits"};
		String[] sweets= {"Mysorepak,Jaamun,Laddu"};
		double[] price= {120,150,185,200};
		String[] customers= {"Employees,Students,Kids"};
		int[] noOfCustomers= {95,120,115,75};
		int[] noOfWorkers= {10,8,12,5};
		
		Bakery bun=new Bakery("Iyengars Bakery", 78497, "Venkat", "Bangalore", false, items, sweets, price, customers,noOfCustomers,noOfWorkers);
		bun.display();
		
	}

}
