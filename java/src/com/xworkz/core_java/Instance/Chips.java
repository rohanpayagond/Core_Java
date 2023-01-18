package com.Xworkz.preacher;

public class Chips {
	
	public String shopName;
	public String brand;
	public boolean taste;
	public boolean goodForHealth;
	public int mfgYear;

	public String[] ingredients;
	public String[] names;
	public int[] price;
	public double[] weight;
	public String[] flavours;
	public int[] salesPerDay;
	
	
	public Chips(String shopName,String brand,boolean taste,boolean goodForHealth,int mfgYear,String[] ingredients,
				String[] names,int[] price,double[] weight,String[] flavours,int[] salesPerDay)
	{
		this.shopName=shopName;
		this.brand=brand;
		this.taste=taste;
		this.goodForHealth=goodForHealth;
		this.mfgYear=mfgYear;
		this.ingredients=ingredients;
		this.names=names;
		this.price=price;
		this.weight=weight;
		this.flavours=flavours;
		this.salesPerDay=salesPerDay;
		System.out.println("Using All Variables");
	}
		
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.shopName);
		System.out.println(this.brand);
		System.out.println(this.taste);
		System.out.println(this.goodForHealth);
		System.out.println(this.mfgYear);
		
		for (int i = 0; i < this.ingredients.length; i++) {
			String ingredients = this.ingredients[i];
			System.out.println(ingredients);
		}
		
		for (int i = 0; i < this.names.length; i++) {
			String names = this.names[i];
			System.out.println(names);
		}

		for (int i = 0; i < this.price.length; i++) {
			int price = this.price[i];
			System.out.println(price);
		}

		for (int i = 0; i < this.weight.length; i++) {
			double weight = this.weight[i];
			System.out.println(weight);
		}

		for (int i = 0; i < this.flavours.length; i++) {
			String flavours = this.flavours[i];
			System.out.println(flavours);
		}

		for (int i = 0; i < this.salesPerDay.length; i++) {
			int salesPerDay = this.salesPerDay[i];
			System.out.println(salesPerDay);
		}
		
	}

}
