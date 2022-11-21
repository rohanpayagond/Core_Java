package com.xworkz.core_java.array_programs;

public class SingleDimArray {

	public static void main(String[] args) {

		int[] a = new int[10];
		int x = 100;

		for (int i = 0; i < a.length; i++) {
			a[i] = x;
			x += 10;
			System.out.println(x);  //Store elements 
		}
		System.out.println("------------");

		System.out.println("Sum : " + x);  //Sum of an array

		System.out.println("------------");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);  //Read elements 

		}
	}

}
