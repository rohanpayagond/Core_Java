package com.Xworkz.preacher;

public class Chain {
	
	public String type;
	public int price;
	public double length;
	public String material;
	public double weight;
	public boolean stolen;
	public String usedFor;
	public boolean fresh;
	
	
	public Chain()
	{
		System.out.println("Default Values");
	}
	
	
	public Chain(String type)
	{
		this();
		this.type=type;
		System.out.println("Using String Constructor");
	}
	
	
	public Chain(String type,int price)
	{
		this(type);
		this.price=price;
		System.out.println("Using String and Int Constructor");
	}
	
	public Chain(String type,int price,double length)
	{
		this(type,price);
		this.length=length;
		System.out.println("Using String,Int and Double Constructor");
	}
	
	public Chain(String type,int price,double length,String material)
	{
		this(type,price,length);
		this.material=material;
		System.out.println("Using String,Int and Double Constructor");
	}
	

	public Chain(String type,int price,double length,String material,double weight)
	{
		this(type,price,length,material);
		this.weight=weight;
		System.out.println("Using String,Int and Double Constructor");
	}
	

	public Chain(String type,int price,double length,String material,double weight,boolean stolen)
	{
		this(type,price,length,material,weight);
		this.stolen=stolen;
		System.out.println("Using String,Int,Double and Boolean Constructor");
	}
	

	public Chain(String type,int price,double length,String material,double weight,
					boolean stolen,String usedFor)
	{
		this(type,price,length,material,weight,stolen);
		this.usedFor=usedFor;
		System.out.println("Using String,Int,Double and Boolean Constructor");
	}
	
	
	public Chain(String type,int price,double length,String material,double weight,
					boolean stolen,String usedFor,boolean fresh)
	{
		this(type,price,length,material,weight,stolen,usedFor);
		this.fresh=fresh;
		System.out.println("Using String,Int,Double and Boolean Constructor");
	}
	
	
	
	
	
	
}
