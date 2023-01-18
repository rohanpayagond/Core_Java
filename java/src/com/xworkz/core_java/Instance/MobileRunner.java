package com.Xworkz.preacher.boot;

import com.Xworkz.preacher.Mobile;

public class MobileRunner {

	public static void main(String[] args) {

		String[] name= {"Galaxy,Galaxy Note,Star Pro"};
		double[] price= {58000,67000,25000};
		int[] storage= {64,128,256};
		String[] color= {"White,Black,Blue"};
		
		Mobile set=new Mobile("Samsung", "78EA47", 2020, 316, true, name, price, storage, color);
		set.display();
		
		}

}
