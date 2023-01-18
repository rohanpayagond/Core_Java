package com.Xworkz.preacher;

public class Earphone {
	
	public String brand;
	public boolean wireless;
	public boolean microphone;
	public double mfgYear;
	public int warranty;
	
	public String[] color;
	public String[] country;
	public int[] price;
	public double[] weight;
	
	
	public Earphone(String brand,boolean wireless,boolean microphone,double mfgYear,int warranty,String[] color,
						String[] country,int[] price,double[] weight)
	{
		this.brand=brand;
		this.wireless=wireless;
		this.microphone=microphone;
		this.mfgYear=mfgYear;
		this.warranty=warranty;
		this.color=color;
		this.country=country;
		this.price=price;
		this.weight=weight;
		System.out.println("Using All Variables");
	}
	
	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.brand);
		System.out.println(this.wireless);
		System.out.println(this.microphone);
		System.out.println(this.mfgYear);
		System.out.println(this.warranty);
		
		for (int i = 0; i < this.color.length; i++) {
			String color = this.color[i];
			System.out.println(color);
		}
	
		for (int i = 0; i < this.country.length; i++) {
			String country = this.country[i];
			System.out.println(country);
		}
		
		for (int i = 0; i < this.price.length; i++) {
			int price = this.price[i];
			System.out.println(price);
		}
		
		for (int i = 0; i < this.weight.length; i++) {
			double weight = this.weight[i];
			System.out.println(weight);
		}
}
	
}