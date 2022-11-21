package com.xworkz.core_java.array_programs;

public class LeastElement {

	public static void main(String[] args) {

		char[] a=new char[] {'A','B','C','D'};
		char least=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if (a[i]<least) 
				least=a[i];
			
		}
		System.out.println("Least Element is : "+least);
	}

}
