package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {

		
		String[] name= {"X-Colors,Brinx,Levis,LeeCooper"};
		double[] price= {700,850,689,950};
		char[] size= {'S','M','L'};
		String[] color= {"Pink,Blue,White,Green"};
		String[] design= {"Full Sleeves,T-Shirt,Half Shirt"};
	
		Shirt men=new Shirt(true, true, 15, "Buffalo", true, name, price, size, color, design);
		men.display();
		
		}

}
