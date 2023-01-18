package com.Xworkz.preacher;

public class FaceWash {

	public double mfgYear;
	public double expYear;
	public String brand;
	public boolean goodForSkin;
	public double length;
	
	public String[] ingredients;
	public String[] names;
	public double[] weight;
	public char[] size;
	public String[] color;
	public int[] price;
	
	public FaceWash(double mfgYear, double expYear, String brand,boolean goodForSkin,double length,String[] ingredients,
						String[] names,double[] weight, char[] size, String[] color,int[] price)
	{
		this.mfgYear=mfgYear;
		this.expYear=expYear;
		this.brand=brand;
		this.goodForSkin=goodForSkin;
		this.length=length;
		this.ingredients=ingredients;
		this.names=names;
		this.weight=weight;
		this.size=size;
		this.color=color;
		this.price=price;
		System.out.println("Using All Variables");
		
	}
	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.mfgYear);
		System.out.println(this.expYear);
		System.out.println(this.brand);
		System.out.println(this.goodForSkin);
		System.out.println(this.length);
		
		for (int i = 0; i < this.ingredients.length; i++) {
			String ingredients = this.ingredients[i];
			System.out.println(ingredients);
		}
		
		
		for (int i = 0; i < this.names.length; i++) {
			String names = this.names[i];
			System.out.println(names);
		}
		
		
		for (int i = 0; i < this.weight.length; i++) {
			double weight = this.weight[i];
			System.out.println(weight);
		}
		
		
		for (int i = 0; i < this.size.length; i++) {
			char size = this.size[i];
			System.out.println(size);
		}
		
		
		for (int i = 0; i < this.color.length; i++) {
			String color = this.color[i];
			System.out.println(color);
		}
		
		
		for (int i = 0; i < this.price.length; i++) {
			int price = this.price[i];
			System.out.println(price);
		}
	}	
	
}
