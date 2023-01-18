package com.Xworkz.preacher;

public class Passport {

	public float no;
	public String name;
	public double expDate;
	public String  country;
	public double issuedDate;
	public int noOfLeaves;

	public Passport()
	{
		System.out.println("Begin the Program");
	}
	
	
	public Passport(float no,String name)
	{
		this.no=no;
		this.name=name;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Passport(double expDate,String country)
	{
		this.expDate=expDate;
		this.country=country;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Passport(double issuedDate,int noOfLeaves)
	{
		this.issuedDate=issuedDate;
		this.noOfLeaves=noOfLeaves;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Passport(float no,double expDate)
	{
		this.no=no;
		this.expDate=expDate;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Passport(String name,double expDate)
	{
		this.name=name;
		this.expDate=expDate;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Passport(float no,String name,double expDate)
	{
		this.no=no;
		this.name=name;
		this.expDate=expDate;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Passport(String name,double issuedDate,int noOfLeaves)
	{
		this.name=name;
		this.issuedDate=issuedDate;
		this.noOfLeaves=noOfLeaves;
		System.out.println("Initializing using Parameter");
	}
	
	
	public Passport(String name,String country,int noOfLeaves)
	{
		this.name=name;
		this.country=country;
		this.noOfLeaves=noOfLeaves;
		System.out.println("Initializing using Parameter");
	}
	

	
}
