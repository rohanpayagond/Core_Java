package com.Xworkz.preacher;

public class Shoes {
	
	public int weight;
	public double mfgDate;
	public String companyName;
	public String ownerName;
	public boolean comfortable;
	
	public double[] price;
	public int[] no;
	public int[] size;
	public String[] country;
	public String[] color;
	
	public Shoes(int weight,double mfgDate,String companyName,String ownerName,boolean comfortable,double[] price,
				int[] no,int[] size,String[] country,String[] color)
	{
		this.weight=weight;
		this.mfgDate=mfgDate;
		this.companyName=companyName;
		this.ownerName=ownerName;
		this.comfortable=comfortable;
		this.price=price;
		this.color=color;
		this.no=no;
		this.size=size;
		this.country=country;
		this.color=color;
		System.out.println("Using All Variables");
	}
	
	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.weight);
		System.out.println(this.mfgDate);
		System.out.println(this.companyName);
		System.out.println(this.ownerName);
		System.out.println(this.comfortable);
		
		for (int i = 0; i < this.price.length; i++) {
			double price = this.price[i];
			System.out.println(price);
			
		}
		
		for (int i = 0; i < this.no.length; i++) {
			int no = this.no[i];
			System.out.println(no);
		}
	
		for (int i = 0; i < this.size.length; i++) {
			int size = this.size[i];
			System.out.println(size);
			
		}
		
		for (int i = 0; i < this.country.length; i++) {
			String count = this.country[i];
			System.out.println(count);
		}
		
		for (int i = 0; i < this.color.length; i++) {
			String banna = this.color[i];
			System.out.println(banna);
		}
	}
	}
