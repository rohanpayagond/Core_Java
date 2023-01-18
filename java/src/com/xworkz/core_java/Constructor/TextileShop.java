package com.Xworkz.preacher;

public class TextileShop {
	
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNo;
	public int ownerNoOfWifes;
	public int shopNo;
	public long contactNo;
	
	public TextileShop()
	{
		System.out.println("Default Constructors");
	}
	
	
	public TextileShop(String ownerName)
	{
		this();
		this.ownerName=ownerName;
		System.out.println("Using String Constructor");
	}

	
	public TextileShop(String ownerName,String ownerWifeName)
	{
		this(ownerName);
		this.ownerWifeName=ownerWifeName;
		System.out.println("Using String Constructor");
	}


	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName)
	{
		this(ownerName,ownerWifeName);
		this.ownerDaughterName=ownerDaughterName;
		System.out.println("Using String Constructor");
	}


	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNo)
	{
		this(ownerName,ownerWifeName,ownerDaughterName);
		this.ownerDaughterNo=ownerDaughterNo;
		System.out.println("Using String and Long Constructor");
	}


	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,
						long ownerDaughterNo,int ownerNoOfWifes)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNo);
		this.ownerNoOfWifes=ownerNoOfWifes;
		System.out.println("Using String,Long and Int Constructor");
	}


	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,
						long ownerDaughterNo,int ownerNoOfWifes,int shopNo)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNo,ownerNoOfWifes);
		this.shopNo=shopNo;
		System.out.println("Using String,Long and Int Constructor");
	}
	
	
	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,
						long ownerDaughterNo,int ownerNoOfWifes,int shopNo,long contactNo)
	{
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNo,ownerNoOfWifes,shopNo);
		this.contactNo=contactNo;
		System.out.println("Using All the Constructors");
	}

	
	
}
