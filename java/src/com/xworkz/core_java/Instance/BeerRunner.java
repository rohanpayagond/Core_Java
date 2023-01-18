package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Beer;

public class BeerRunner {

	public static void main(String[] args) {

	
		String[] name= {"Strong,Premium,Ultra"};
		double[] price= {250,230,215};
		String[] capacity= {"500,350,750"};
		char[] size= {'M','L'};
		double[] weight= {450,575,385};
		
		Beer bottle=new Beer("KingFisher", true, true, 5, name, price, capacity, size, weight);
		bottle.display();
		
		
	}

}
