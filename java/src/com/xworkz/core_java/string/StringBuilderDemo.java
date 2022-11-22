package com.xworkz.core_java.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder str=new StringBuilder("Xworkz branch is in BTM layout");
		System.out.println(str.capacity());
		
		StringBuilder str1=new StringBuilder("and other in Rajajinagar");
		
		System.out.println("-----------------");
		System.out.println(str.indexOf("branch"));
		
		System.out.println("----------------");
		System.out.println(str.indexOf("is", 0));
		
		System.out.println("----------------");
		System.out.println(str.lastIndexOf(" layout"));
		
		System.out.println("----------------");
		System.out.println(str1.lastIndexOf("other", 5));
		
		System.out.println("----------------");
		System.out.println(str.offsetByCodePoints(1, 8));
		
		System.out.println("----------------");
		System.out.println(str1.reverse());
		
		System.out.println("----------------");
		System.out.println(str.replace(0, 6, "Jspiders"));
		
		System.out.println("----------------");
		System.out.println(str.delete(0, 8));
		
		System.out.println("----------------");
		System.out.println(str.insert(13, 'a'));
		
		System.out.println("----------------");
		System.out.println(str.insert(10, false));
		
		System.out.println("----------------");
		System.out.println(str1.append(true));
		
		System.out.println("----------------");
		System.out.println(str.append('A'));
		
		System.out.println("----------------");
		System.out.println(str.append(str1));
		
		System.out.println("----------------");
		System.out.println(str.insert(7, "good"));
		
		
		
	}

}
