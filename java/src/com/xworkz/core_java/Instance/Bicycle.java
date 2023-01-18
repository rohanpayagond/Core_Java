package com.Xworkz.preacher;

public class Bicycle {
	
	public String brand;
	public String shopName;
	public String ownerName;
	public int workers;
	public boolean homeDelivery;
	
	public String[] color;
	public double[] price;
	public String[] location;
	public String[] accessories;
	public String[] name;
	public int[] noOfSales;
	
	public Bicycle(String brand,String shopName,String ownerName,int workers, boolean homeDelivery,String[] color,
						double[] price,String[] location,String[] accessories,String[] name,int[] noOfSales)
	{
		this.brand=brand;
		this.shopName=shopName;
		this.ownerName=ownerName;
		this.workers=workers;
		this.homeDelivery=homeDelivery;
		this.color=color;
		this.price=price;
		this.location=location;
		this.accessories=accessories;
		this.name=name;
		this.noOfSales=noOfSales;
		System.out.println("Using All Variables");
	}
	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.brand);
		System.out.println(this.shopName);
		System.out.println(this.ownerName);
		System.out.println(this.workers);
		System.out.println(this.homeDelivery);
		
		for (int i = 0; i < this.color.length; i++) {
			String color = this.color[i];
			System.out.println(color);
		}
		
		for (int i = 0; i < this.price.length; i++) {
			double price = this.price[i];
			System.out.println(price);
		}
		
		for (int i = 0; i < this.location.length; i++) {
			String location = this.location[i];
			System.out.println(location);
		}
		
		for (int i = 0; i < this.accessories.length; i++) {
			String accessories = this.accessories[i];
			System.out.println(accessories);
		}
		
		for (int i = 0; i < this.name.length; i++) {
			String name = this.name[i];
			System.out.println(name);
		}
		
		for (int i = 0; i < this.noOfSales.length; i++) {
			int noOfSales = this.noOfSales[i];
			System.out.println(noOfSales);
		}
		
		
	}
	
	
	
	

}
