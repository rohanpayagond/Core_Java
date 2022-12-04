package com.xworkz.java.collection.list;

import java.util.ArrayList;

public class Student {
	
	String name;
	String location;
	String college;
	
	
	public Student(String name, String location, String college) {
		
		this.name=name;
		this.location=location;
		this.college=college;
		
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", location=" + location + ", college=" + college + "]";
	}
	
	

}
