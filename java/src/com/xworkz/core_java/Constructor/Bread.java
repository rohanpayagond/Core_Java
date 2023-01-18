package com.Xworkz.preacher;

public class Bread {

	public char type;
	public String shape;
	public int price;
	public double  quantity;
	public String companyName;
	
	public Bread()
	{
		System.out.println("Begin the Program");
	}
	
	
	public Bread(char type,String shape)
	{
		this.type=type;
		this.shape=shape;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Bread(int price,double quantity)
	{
		this.price=price;
		this.quantity=quantity;
		System.out.println("Initializing using Parameter");
	}
	
	public Bread(double quantity,String companyName)
	{
		this.quantity=quantity;
		this.companyName=companyName;
		System.out.println("Initializing using Parameter");
	}

	
	public Bread(String companyName,String shape,char type)
	{
		this.companyName=companyName;
		this.shape=shape;
		this.type=type;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Bread(String companyName,double quantity,int price)
	{
		this.companyName=companyName;
		this.quantity=quantity;
		this.price=price;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Bread(char type,int price)
	{
		this.type=type;
		this.price=price;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Bread(double quantity,int price)
	{
		this.quantity=quantity;
		this.price=price;
		System.out.println("Initializing using Parameter");
	}
	
	public Bread(char type,double quantity,int price)
	{
		this.type=type;
		this.quantity=quantity;
		this.price=price;
		System.out.println("Initializing using Parameter");
	}
	
	
}
