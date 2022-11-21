package com.xworkz.core_java.array_programs;

public class TwoDimArray1 {
	

			public static void main(String[] args) {
			
			int[][] a=new int[5][5];
			int num=1;
			for (int i = 0; i < a.length; i++) {
				
				for (int j = 0; j < a[i].length; j++) {
					
					a[i][j]=num;
					
				}
			}
			
			for (int i = 0; i < a.length; i++) {
				
				for (int j = 0; j < a[i].length; j++) {
					
					if((i==j) || (i==0 && j==4) || (i==1 && j==3) || (i==2 && j==2) || (i==3 && j==1) || (i==4 && j==0))
					{
						System.out.print("*"+"   ");
					}
					else {
						System.out.print(a[i][j]+ "   ");
					}
				}
				System.out.println();
			}
						
		}

	}

	
	

