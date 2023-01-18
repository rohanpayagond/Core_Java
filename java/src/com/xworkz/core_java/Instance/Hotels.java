package com.Xworkz.preacher;

public class Hotels {

	public String name;
	public String ownerName;
	public boolean takeaway;
	public boolean hygenic;
	public int workers;
	
	public String[] location;
	public String[] timing;
	public int[] customers;
	public String[] names;
	public String[] foodItems;
	public double[] price;
	
	
	public Hotels(String name,String ownerName,boolean takeaway,boolean hygenic,int workers,String[] location,
			String[] timing,int[] customers,String[] names,String[] foodItems,double[] price)
	{
		this.name=name;
		this.ownerName=ownerName;
		this.takeaway=takeaway;
		this.hygenic=hygenic;
		this.workers=workers;
		this.location=location;
		this.timing=timing;
		this.customers=customers;
		this.names=names;
		this.foodItems=foodItems;
		this.price=price;
		System.out.println("Using All Variables");
	}
	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.name);
		System.out.println(this.ownerName);
		System.out.println(this.takeaway);
		System.out.println(this.hygenic);
		System.out.println(this.workers);
		
		for (int i = 0; i < this.location.length; i++) {
			String location = this.location[i];
			System.out.println(location);
		}
		
		for (int i = 0; i < this.timing.length; i++) {
			String timing = this.timing[i];
			System.out.println(timing);
		}
		
		for (int i = 0; i < this.customers.length; i++) {
			int customers = this.customers[i];
			System.out.println(customers);
		}
		
		for (int i = 0; i < this.names.length; i++) {
			String names = this.names[i];
			System.out.println(names);
		}
		
		for (int i = 0; i < this.foodItems.length; i++) {
			String foodItems = this.foodItems[i];
			System.out.println(foodItems);
		}
		
		for (int i = 0; i < this.price.length; i++) {
			double price = this.price[i];
			System.out.println(price);
		}
	}
	
	
	
}
