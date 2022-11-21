package com.xworkz.core_java.string;

public class StringDemo {

	public static void main(String[] args) {

		String a = "India";
		String b = "Karnataka";
		String c = "Bangalore";
		String d = "Dharwad";

		System.out.println(b == c);	//false
		System.out.println(a == d);	//false

		d = "Karnataka";
		System.out.println(d == b);	//true

		a = "Hubli";
		System.out.println(a == a);	//true

		String s = new String("Mysore");
		String intern = s.intern();
		System.out.println(s.equals(intern));	//true
		System.out.println(s == intern);	//false
		
		String s1="Mysore";
		System.out.println(s1==intern);	//true
		System.out.println(s1==s);	//false

		
		System.out.println("------------------");
		
		
		 
		

	}

}
