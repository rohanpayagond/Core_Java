package com.Xworkz.preacher;

public class Mobile {
	
	public String brand;
	public String modelNo;
	public double mfgYear;
	public double weight;
	public boolean expensive;
	
	public String[] name;
	public double[] price;
	public int [] storage;
	public String[] color;


	public Mobile(String brand,String modelNo,double mfgYear,double weight,boolean expensive,String[] name,double[] price,
					int[] storage,String[] color)
	{
		this.brand=brand;
		this.modelNo=modelNo;
		this.mfgYear=mfgYear;
		this.weight=weight;
		this.expensive=expensive;
		this.name=name;
		this.price=price;
		this.storage=storage;
		this.brand=brand;
		this.color=color;
		System.out.println("Using All Variables");
		
	}

	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.brand);
		System.out.println(this.modelNo);
		System.out.println(this.mfgYear);
		System.out.println(this.weight);
		System.out.println(this.expensive);
		
		for (int i = 0; i < this.name.length; i++) {
			String name = this.name[i];
			System.out.println(name);
			
		}
		
		for (int i = 0; i < this.price.length; i++) {
			double price = this.price[i];
			System.out.println(price);

			
		}
		
		for (int i = 0; i < this.storage.length; i++) {
			int storage = this.storage[i];
			System.out.println(storage);

			
		}
		
		for (int i = 0; i < this.color.length; i++) {
			String color = this.color[i];
			System.out.println(color);

			
		}
		
	}

}
