package com.Xworkz.preacher;

public class SoftDrinks {
	
	
	public double weight;
	public double mfgYear;
	public int expYear;
	public boolean taste;
	public boolean disposable;
	
	public String[] color;
	public String[] name;
	public char[] size;
	public double[] price;

	
	public SoftDrinks(double weight,double mfgYear,int expYear,boolean taste,boolean disposable,String[] color,
						String[] name,char[] size,double[] price)
	{
		this.weight=weight;
		this.mfgYear=mfgYear;
		this.expYear=expYear;
		this.taste=taste;
		this.disposable=disposable;
		this.color=color;
		this.name=name;
		this.size=size;
		this.price=price;
		System.out.println("Using All Variables");
	}
	

	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.weight);
		System.out.println(this.mfgYear);
		System.out.println(this.expYear);
		System.out.println(this.taste);
		System.out.println(this.disposable);
		
		for (int i = 0; i < this.color.length; i++) {
			String color = this.color[i];
			System.out.println(color);
			
		}
		
		for (int i = 0; i < this.name.length; i++) {
			String name = this.name[i];
			System.out.println(name);

			
		}
		
		for (int i = 0; i < this.size.length; i++) {
			char size = this.size[i];
			System.out.println(size);

			
		}
		
		for (int i = 0; i < this.price.length; i++) {
			double price = this.price[i];
			System.out.println(price);

			
		}
	}

}
