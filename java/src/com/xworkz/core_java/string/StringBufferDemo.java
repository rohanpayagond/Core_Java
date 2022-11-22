package com.xworkz.core_java.string;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer s=new StringBuffer("Laptop is a electronic ");
		StringBuffer s1 = new StringBuffer(" and a portable device");
		
		System.out.println(s.append("Gadget"));		//adds string to the object
		
		System.out.println("----------------");
		System.out.println(s.append(1));			//adds int type to an object
		
		System.out.println("----------------");
		System.out.println(s.append(s1));			//adds 2objects
		
		System.out.println("----------------");
		System.out.println(s.append(123));			//adds long type to an object
		
		System.out.println("----------------");
		System.out.println(s.capacity());			//capacity of an object
		
		System.out.println("----------------");
		System.out.println(s.codePointAt(0));		
		
		System.out.println("----------------");
		System.out.println(s.codePointCount(1,10));		
		
		System.out.println("----------------");
		System.out.println(s.codePointBefore(1));
		
		System.out.println("----------------");
		System.out.println(s.offsetByCodePoints(5, 15));
		
		System.out.println("----------------");
		System.out.println(s.substring(6));
		
		System.out.println("----------------");
		System.out.println(s.substring(1, 10));
		
		System.out.println("----------------");
		System.out.println(s1.delete(1, 15));		//deletes char in an object
		
		System.out.println("----------------");
		System.out.println(s.deleteCharAt(2));		//removes char in an object
		
		System.out.println("----------------");
		System.out.println(s.insert(7, true));		//removes char and adds boolean to an object
		
		System.out.println("----------------");
		System.out.println(s.insert(2, "p"));		//removes and adds char to an object
		
		System.out.println("----------------");
		System.out.println(s.replace(0, 6, "Mobile"));		//removes and adds string to an object
		
		System.out.println("----------------");		//eliminates the characters of an object
		System.out.println(s.subSequence(1, 55));
		
		System.out.println("----------------");		//returns in reverse object
		System.out.println(s1.reverse());
		
		System.out.println("----------------");
		System.out.println(s.indexOf("electronic"));	//index of an string

		
		
		
	}

}
