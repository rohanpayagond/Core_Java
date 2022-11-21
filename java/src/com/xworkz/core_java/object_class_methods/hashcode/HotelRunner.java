package com.xworkz.core_java.object_class_methods.hashcode;

public class HotelRunner {

	public static void main(String[] args) {

		Hotel hotel = new Hotel();
		int rohan = hotel.hashCode();
		System.out.println(rohan);

		Hotel hotel1 = new Hotel();
		int rp = hotel1.hashCode();
		System.out.println(rp);
		
		System.out.println(rohan +" + "+rp );
		
	//	rohan=rp;
		//System.out.println(rohan +" + "+rp);
		
		rp=rohan;
		System.out.println(rohan +" + "+rp);
		
		

	}

}
