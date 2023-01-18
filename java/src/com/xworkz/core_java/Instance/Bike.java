package com.Xworkz.preacher;

public class Bike {
	
	
	public String ownerName;
	public int freeServices;
	public int assembled;
	public String companyName;
	public boolean safe;
	
	public double[] price;
	public int[] engineCC;
	public String[] color;
	public double[] mfgYear;
	public String[] name;
	public String[] country;
	
	
	public Bike(String ownerName,int freeServices,int assembled,String companyName,boolean safe,
			double[] price,int[] engineCC,String[] color,double[] mfgYear,String[] name,String[] country)
	{
		this.ownerName=ownerName;
		this.freeServices=freeServices;
		this.assembled=assembled;
		this.companyName=companyName;
		this.safe=safe;
		this.price=price;
		this.engineCC=engineCC;
		this.color=color;
		this.mfgYear=mfgYear;
		this.name=name;
		this.country=country;
		System.out.println("Using All Instance Variables");
	}
	
	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.ownerName);
		System.out.println(this.freeServices);
		System.out.println(this.assembled);
		System.out.println(this.companyName);
		System.out.println(this.safe);
		

		
		for (int i = 0; i < this.price.length; i++) {
			double make = this.price[i];
			System.out.println(make);
			
		}
		
		for (int i = 0; i < this.engineCC.length; i++) {
			int mist = this.engineCC[i];
			System.out.println(mist);

			
		}
		
		for (int i = 0; i < this.color.length; i++) {
			String rain = this.color[i];
			System.out.println(rain);

		}
		
		for (int i = 0; i < this.mfgYear.length; i++) {
			double burn = this.mfgYear[i];
			System.out.println(burn);

		}
		
		for (int i = 0; i < this.name.length; i++) {
			String smoke = this.name[i];
			System.out.println(smoke);

		}
		
		for (int i = 0; i < this.country.length; i++) {
			String string = this.country[i];
			System.out.println(string);

		}
	}
	
	

}
