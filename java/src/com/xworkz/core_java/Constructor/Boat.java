package com.Xworkz.preacher;

public class Boat {

	public String name;
	public String color;
	public String companyName;
	public char  type;
	public String owner;
	
	public Boat()
	{
		System.out.println("Begin the Program");
	}

	
	public Boat(String name)
	{
		this.name=name;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Boat(String name,String color)
	{
		this.name=name;
		this.color=color;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Boat(String name,String color,String companyName)
	{
		this.name=name;
		this.color=color;
		this.companyName=companyName;
		System.out.println("Initializing using Parameter");
	}
	

	public Boat(String companyName,char type)
	{
		this.companyName=companyName;
		this.type=type;
		System.out.println("Initializing using Parameter");
	}
	
	public Boat(char type,String name)
	{
		this.type=type;
		this.name=name;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Boat(char type,String owner,String companyName)
	{
		this.type=type;
		this.owner=owner;
		this.companyName=companyName;
		System.out.println("Initializing using Parameter");
	}

	
	
	public Boat(String color,char type,String companyName)
	{
		this.color=color;
		this.type=type;
		this.companyName=companyName;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Boat(String color,String owner,char type)
	{
		this.color=color;
		this.owner=owner;
		this.type=type;
		System.out.println("Initializing using Parameter");
	}

	
	
	
}

