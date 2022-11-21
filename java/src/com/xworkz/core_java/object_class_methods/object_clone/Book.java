package com.xworkz.core_java.object_class_methods.object_clone;

public class Book implements Cloneable{
	
	String brand;
	int price;
	int noOfPages;
	
	
	public Book(String brand, int price, int noOfPages) {
		this.brand = brand;
		this.price = price;
		this.noOfPages = noOfPages;
	}
	
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
		
	@Override
	public String toString() {
		return "Book [brand=" + brand +",price=" + price +",noOfPages=" + noOfPages +"]";
	}	 
	 }
	


