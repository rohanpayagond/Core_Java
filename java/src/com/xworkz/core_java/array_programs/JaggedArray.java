package com.xworkz.core_java.array_programs;

public class JaggedArray {

	public static void main(String[] args) {

		int arr[][]=new int[4][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[1];
		arr[3]=new int[3];
		
		arr[0][0]=11;
		arr[0][1]=12;
		arr[0][2]=13;
		arr[0][3]=14;
		
		arr[1][0]=21;
		arr[1][1]=22;
		
		arr[2][0]=31;
		
		arr[3][0]=41;
		arr[3][1]=42;
		arr[3][2]=43;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
