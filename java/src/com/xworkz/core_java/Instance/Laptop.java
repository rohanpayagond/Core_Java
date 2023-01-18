package com.Xworkz.preacher;

public class Laptop {
	
	public String ownerName;
	public String brand;
	public double weight;
	public String quality;
	public boolean expensive;
	
	public double[] price;
	public String[] processor;
	public String[] modelNo;
	public String[] items;
	
	
	public Laptop(String ownerName,String brand,double weight,String quality,boolean expensive,double[] price,
				String[] processor,String[] modelNo,String[] items)
	{
		this.ownerName=ownerName;
		this.brand=brand;
		this.weight=weight;
		this.quality=quality;
		this.expensive=expensive;
		this.price=price;
		this.processor=processor;
		this.modelNo=modelNo;
		this.items=items;
		System.out.println("Using All Variables");
	}
	
	public void display()
	{
		System.out.println("-----------------");
		System.out.println(this.ownerName);
		System.out.println(this.brand);
		System.out.println(this.weight);
		System.out.println(this.quality);
		System.out.println(this.expensive);
		
		for (int i = 0; i < this.price.length; i++) {
			double price = this.price[i];
			System.out.println(price);
		}
		
		for (int i = 0; i < this.processor.length; i++) {
			String processor = this.processor[i];
			System.out.println(processor);
		}
		
		for (int i = 0; i < this.modelNo.length; i++) {
			String modelNo = this.modelNo[i];
			System.out.println(modelNo);
		}
		
		for (int i = 0; i < this.items.length; i++) {
			String items = this.items[i];
			System.out.println(items);
		}
		
	}
	
}
