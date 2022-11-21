package com.xworkz.core_java.object_class_methods.equals_method;

public class BakeryRunner {

	public static void main(String[] args) {

		Bakery a = new Bakery("Iyengar", 580021, "Bangalore");
		Bakery b=new Bakery("Udupi", 580030, "Hubli");
		Bakery a1 = new Bakery("Iyengar", 580021, "Bangalore");

		System.out.println(a.equals(a1));   //equals(Object o)
		
		System.out.println(a.getClass().getSimpleName());   //getClass
	}

}
