package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {

		
		TextileShop cloth=new TextileShop();
		System.out.println("Default value = "+cloth.ownerName);
		System.out.println("Default value = "+cloth.ownerWifeName);
		System.out.println("Default value = "+cloth.ownerDaughterName);
		System.out.println("Default value = "+cloth.ownerDaughterNo);
		System.out.println("Default value = "+cloth.ownerNoOfWifes);
		System.out.println("Default value = "+cloth.shopNo);
		System.out.println("Default value = "+cloth.contactNo);
		
		TextileShop cloth1=new TextileShop("Raghu");
		System.out.println("Owner Name of TextileShop = "+cloth1.ownerName);
		
		System.out.println(System.lineSeparator());
		
		
		TextileShop cloth2=new TextileShop("Raghu","Shahsi");
		System.out.println("Owner Name of TextileShop = "+cloth2.ownerName);
		System.out.println("Owner WifeName = "+cloth2.ownerWifeName);
		
		System.out.println(System.lineSeparator());
		
		
		TextileShop cloth3=new TextileShop("Raghu","Shahsi","Sudha");
		System.out.println("Owner Name of TextileShop = "+cloth3.ownerName);
		System.out.println("Owner WifeName = "+cloth3.ownerWifeName);
		System.out.println("Owner DaughterName = "+cloth3.ownerDaughterName);
		
		System.out.println(System.lineSeparator());
		
		
		TextileShop cloth4=new TextileShop("Raghu","Shahsi","Sudha",9847567854L);
		System.out.println("Owner Name of TextileShop = "+cloth4.ownerName);
		System.out.println("Owner WifeName = "+cloth4.ownerWifeName);
		System.out.println("Owner DaughterName = "+cloth4.ownerDaughterName);
		System.out.println("Owner DaughterNo = "+cloth4.ownerDaughterNo);
		
		System.out.println(System.lineSeparator());
		
		
		TextileShop cloth5=new TextileShop("Raghu","Shahsi","Sudha",9847567854L,2);
		System.out.println("Owner Name of TextileShop = "+cloth5.ownerName);
		System.out.println("Owner WifeName = "+cloth5.ownerWifeName);
		System.out.println("Owner DaughterName = "+cloth5.ownerDaughterName);
		System.out.println("Owner DaughterNo = "+cloth5.ownerDaughterNo);
		System.out.println("Owner No of Wifes = "+cloth5.ownerNoOfWifes);
		
		System.out.println(System.lineSeparator());
		

		TextileShop cloth6=new TextileShop("Raghu","Shahsi","Sudha",9847567854L,2,95478);
		System.out.println("Owner Name of TextileShop = "+cloth6.ownerName);
		System.out.println("Owner WifeName = "+cloth6.ownerWifeName);
		System.out.println("Owner DaughterName = "+cloth6.ownerDaughterName);
		System.out.println("Owner DaughterNo = "+cloth6.ownerDaughterNo);
		System.out.println("Owner No of Wifes = "+cloth6.ownerNoOfWifes);
		System.out.println("Shop No = "+cloth6.shopNo);
	
		System.out.println(System.lineSeparator());
		
		
		TextileShop cloth7=new TextileShop("Raghu","Shahsi","Sudha",9847567854L,2,95478,94457699876L);
		System.out.println("Owner Name of TextileShop = "+cloth7.ownerName);
		System.out.println("Owner WifeName = "+cloth7.ownerWifeName);
		System.out.println("Owner DaughterName = "+cloth7.ownerDaughterName);
		System.out.println("Owner DaughterNo = "+cloth7.ownerDaughterNo);
		System.out.println("Owner No of Wifes = "+cloth7.ownerNoOfWifes);
		System.out.println("Shop No = "+cloth7.shopNo);
		System.out.println("Contact No = "+cloth7.contactNo);

	}

}
