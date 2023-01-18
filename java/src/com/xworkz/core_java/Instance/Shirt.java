package com.Xworkz.preacher;

public class Shirt {
	
	public boolean cotton;
	public boolean comfortable;
	public double length;
	public String brand;
	public boolean quality;
	
	
	public String[] name;
	public double[] price;
	public char [] size;
	public String[] color;
	public String[] design;
	
	
	public Shirt(boolean cotton,boolean comfortable,double length,String brand,boolean quality,String[] name,
				double[] price,char [] size,String[] color,String[] design)
	{
		this.cotton=cotton;
		this.comfortable=comfortable;
		this.length=length;
		this.brand=brand;
		this.quality=quality;
		this.name=name;
		this.price=price;
		this.size=size;
		this.color=color;
		this.design=design;
		System.out.println("Using All Variables");
	}


	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.cotton);
		System.out.println(this.comfortable);
		System.out.println(this.length);
		System.out.println(this.brand);
		System.out.println(this.quality);
		
		for (int i = 0; i < this.name.length; i++) {
			String string = this.name[i];
			System.out.println(string);
		}
		
		for (int i = 0; i < this.price.length; i++) {
			double price = this.price[i];
			System.out.println(price);
		}
		
		for (int i = 0; i < this.size.length; i++) {
			char size = this.size[i];
			System.out.println(size);
		}
		
		for (int i = 0; i < this.color.length; i++) {
			String color = this.color[i];
			System.out.println(color);
		}
		
		
		for (int i = 0; i < this.design.length; i++) {
			String design = this.design[i];
			System.out.println(design);
		}
		
	}
	

}
