package com.Xworkz.preacher;

public class Tractor {
	
	public String ownerName;
	public String brand;
	public double price;
	public String color;
	public int hp;
	public String model;
	
	public Tractor()
	{
		System.out.println("Default Constructors");
	}
	
	
	public Tractor(String ownerName)
	{
		this();
		this.ownerName=ownerName;
		System.out.println("Using String Constructor");
	}
	
	
	public Tractor(String ownerName,String brand)
	{
		this(ownerName);
		this.brand=brand;
		System.out.println("Using Two String Constructors");
	}
	
	
	public Tractor(String ownerName,String brand,double price)
	{
		this(ownerName,brand);
		this.price=price;
		System.out.println("Using String and Double Constructors");
	}

	public Tractor(String ownerName,String brand,double price,String color)
	{
		this(ownerName,brand,price);
		this.color=color;
		System.out.println("Using String and Double Constructors");
	}
	
	public Tractor(String ownerName,String brand,double price,String color,int hp)
	{
		this(ownerName,brand,price,color);
		this.hp=hp;
		System.out.println("Using String,Int and Double Constructors");
	}
	
	public Tractor(String ownerName,String brand,double price,String color,int hp,String model)
	{
		this(ownerName,brand,price,color,hp);
		this.model=model;
		System.out.println("Using All the Constructors");
	}
		
	
}
