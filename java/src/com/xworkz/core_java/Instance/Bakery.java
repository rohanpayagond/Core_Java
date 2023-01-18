package com.Xworkz.preacher;

public class Bakery {
	
	public String name;
	public int shopNo;
	public String ownerName;
	public String location;
	public boolean homeDelivery;
	
	public String[] items;
	public String[] sweets;
	public double[] price;
	public String[] customers;
	public int[] noOfCustomers;
	public int[] noOfWorkers;
	
	
	
	public Bakery(String name,int shopNo,String ownerName,String location, boolean homeDelivery,String[] items,
					String[] sweets,double[] price,String[] customers,int[] noOfCustomers, int[] noOfWorkers)
	{
		this.name=name;
		this.shopNo=shopNo;
		this.ownerName=ownerName;
		this.location=location;
		this.homeDelivery=homeDelivery;
		this.items=items;
		this.sweets=sweets;
		this.price=price;
		this.customers=customers;
		this.noOfCustomers=noOfCustomers;
		this.noOfWorkers=noOfWorkers;
		System.out.println("Using All Variables");
	}
	
	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.name);
		System.out.println(this.shopNo);
		System.out.println(this.ownerName);
		System.out.println(this.location);
		System.out.println(this.homeDelivery);
		
		for (int i = 0; i < this.items.length; i++) {
			String string = this.items[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < this.sweets.length; i++) {
			String sweets = this.sweets[i];
			System.out.println(sweets);
		}
		
		for (int i = 0; i < this.price.length; i++) {
			double price = this.price[i];
			System.out.println(price);
		}
		
		for (int i = 0; i < this.customers.length; i++) {
			String customers = this.customers[i];
			System.out.println(customers);
		}
		
		for (int i = 0; i < this.noOfCustomers.length; i++) {
			int noOfCustomers = this.noOfCustomers[i];
			System.out.println(noOfCustomers);
		}
		
		for (int i = 0; i < this.noOfWorkers.length; i++) {
			int noOfWorkers = this.noOfWorkers[i];
			System.out.println(noOfWorkers);
		}
		


	}
	

}
