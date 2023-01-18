package com.Xworkz.preacher;

public class Beer {
	
	public String brand;
	public boolean taste;
	public boolean healthy;
	public double alcoholContent;
	
	public String[] name;
	public double[] price;
	public String[] capacity;
	public char[] size;
	public double[] weight;
	
	
	public Beer(String brand,boolean taste,boolean healthy,double alcoholContent,String[] name,double[] price,
				 String[] capacity,char[] size,double[] weight)
	{
		this.brand=brand;
		this.taste=taste;
		this.healthy=healthy;
		this.alcoholContent=alcoholContent;
		this.name=name;
		this.price=price;
		this.capacity=capacity;
		this.size=size;
		this.weight=weight;
		System.out.println("Using All Variables");
		}
		
		public void display()
		{
			System.out.println("-----------------");
			System.out.println(this.brand);
			System.out.println(this.taste);
			System.out.println(this.healthy);
			System.out.println(this.alcoholContent);
			
			for (int i = 0; i < this.name.length; i++) {
				String name = this.name[i];
				System.out.println(name);	
			}
			
			for (int i = 0; i < this.price.length; i++) {
				double price = this.price[i];
				System.out.println(price);	
			}
			
			for (int i = 0; i < this.capacity.length; i++) {
				String capacity = this.capacity[i];
				System.out.println(capacity);	
			}
			for (int i = 0; i < this.size.length; i++) {
				char size = this.size[i];
				System.out.println(size);	
			}
			for (int i = 0; i < this.weight.length; i++) {
				double weight = this.weight[i];
				System.out.println(weight);	
			}
	}
	
}
