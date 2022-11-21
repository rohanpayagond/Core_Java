package com.xworkz.core_java.string;

public class StringMethods {

	public static void main(String[] args) {

		String s = new String("Hi, ");
		String s1 = new String("I am ");
		String s2 = new String("Rohan");

		System.out.println(s.concat(s1 + s2)); // String concat method

		System.out.println("-----------");
		String s3 = new String("Hello Xworkz     ");
		System.out.println(s3.charAt(0));
		System.out.println(s3.charAt(6)); // String charAt

		System.out.println("-----------");
		System.out.println(s.compareTo(s1));
		System.out.println(s2.compareTo(s3)); // String compareTo method

		System.out.println("-----------");
		String s4 = new String("Hello Xworkz");
		System.out.println(s4.contentEquals(s3)); // String contentEquals method
		System.out.println(s1.contentEquals(s3));

		System.out.println("-----------");
		String s5 = "Java is a programming language";
		boolean by;
		by = s5.endsWith("language");
		System.out.println(by); // String endsWith method

		System.out.println("-----------");
		System.out.println(s4.equals(s5)); // String equals method

		System.out.println("-----------");
		String s6 = "JAVA IS A PROGRAMMING LANGUAGE";
		System.out.println(s6.equalsIgnoreCase(s5)); // String equalsIgnoreCase method

		System.out.println("-----------");
		System.out.println(s6.lastIndexOf('P')); // String lastIndexOf method

		System.out.println("-----------");
		System.out.println(s6.length()); // String length method

		System.out.println("-----------");
		System.out.println(s6.replace('A', 'a')); // String replace method

		System.out.println("-----------"); // String replaceAll method
		System.out.println(s6.replaceAll("JAVA IS A PROGRAMMING LANGUAGE", "C++ is also a language"));

		System.out.println("-----------");
		System.out.println(s5.startsWith("Java"));
		System.out.println(s5.startsWith("C++")); // String startsWith method

		System.out.println("-----------");
		System.out.println(s6.subSequence(0, 5));
		System.out.println(s6.subSequence(11, 20)); // String subSequence method

		System.out.println("-----------");
		System.out.println(s6.substring(10)); // String subString method
		
		System.out.println("-----------");
		System.out.println(s6.toLowerCase()); 	//String toLowerCase method
		
		System.out.println("-----------");
		System.out.println(s4.toUpperCase()); 	//String toUpperCase method
		
		System.out.println("-----------");
		System.out.println(s4.trim()); 		//String trim method

	}

}
