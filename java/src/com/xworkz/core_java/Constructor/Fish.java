package com.Xworkz.preacher;

public class Fish {

	
		public String name;
		public String type;
		public int price;
		public double length;
		public double weight;
		
		public Fish()
		{
			System.out.println("Begin the Program");
		}
		
		
		public Fish(String name)
		{
			this.name=name;
			System.out.println("Value using Parameter");
		}
		
		
		public Fish(String name,String type)
		{
			this.name=name;
			this.type=type;
			System.out.println("Value using Parameter");
		}
			
			
			public Fish(String name,int price)
			{
				this.name=name;
				this.price=price;
				System.out.println("Value using Parameter");
			}
			
			public Fish(int price,double weight)
			{
				this.price=price;
				this.weight=weight;
				System.out.println("Value using Parameter");
			}	
			
			
			public Fish(String name,double length)
			{
				this.name=name;
				this.length=length;
				System.out.println("Value using Parameter");
			}
			
			
			public Fish(String name,int price,double weight)
			{
				this.name=name;
				this.price=price;
				this.weight=weight;
				System.out.println("Value using Parameter");
			}
			
	
			public Fish(double length,double weight)
			{
				this.length=length;
				this.weight=weight;
				System.out.println("Value using Parameter");
			}
				
			
			public Fish(String name,double weight,double length)
			{
				this.name=name;
				this.weight=weight;
				this.length=length;
				System.out.println("Value using Parameter");
			}
			
			
			
			
		}
		


