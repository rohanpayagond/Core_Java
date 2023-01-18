package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Passport;

public class PassportRunner {

	public static void main(String[] args) {

		Passport fly=new Passport();
		System.out.println("Default Value = "+fly.no);
		System.out.println("Default Value = "+fly.name);
		System.out.println("Default Value = "+fly.expDate);
		System.out.println("Default Value = "+fly.country);
		System.out.println("Default Value = "+fly.issuedDate);
		System.out.println("Default Value = "+fly.noOfLeaves);
		
		
		Passport fly1=new Passport(788479,"Raghu");
		System.out.println("No of Passport = "+fly1.no);
		System.out.println("Name of the Passport = "+fly1.name);
		
		
		Passport fly2=new Passport(2028.0,"India");
		System.out.println("Expiry Date of the Passport = "+fly2.expDate);
		System.out.println("Country of the Passport = "+fly2.country);
		

		Passport fly3=new Passport(2022.0,15);
		System.out.println("Issued Date of the Passport = "+fly3.issuedDate);
		System.out.println("No of Leaves = "+fly3.noOfLeaves);
		

		Passport fly4=new Passport(7854978,"Raghu");
		System.out.println("No of Passport = "+fly4.no);
		System.out.println("Expiry Date  of the Passport = "+fly4.expDate);
		
		
		Passport fly5=new Passport("Ajay",2023);
		System.out.println("Name of the Passport = "+fly5.name);
		System.out.println("Expiry Date  of the Passport = "+fly5.expDate);
		
		
		Passport fly6=new Passport(7869578,"Abhi",2029);
		System.out.println("No of Passport = "+fly6.no);
		System.out.println("Name of the Passport = "+fly6.name);
		System.out.println("Expiry Date  of the Passport = "+fly6.expDate);

		
		Passport fly7=new Passport("Samarth",2020,22);
		System.out.println("Name of the Passport = "+fly7.name);
		System.out.println("Issued Date  of the Passport = "+fly7.issuedDate);
		System.out.println("No of Leaves = "+fly7.noOfLeaves);


		Passport fly8=new Passport("Samarth","America",10);
		System.out.println("Name of the Passport = "+fly8.name);
		System.out.println("Country of the Passport = "+fly8.country);
		System.out.println("No of Leaves = "+fly8.noOfLeaves);


		
		System.out.println("End of Program");	
		
		
	}

}
