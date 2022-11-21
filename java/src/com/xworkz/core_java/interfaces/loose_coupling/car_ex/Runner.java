package com.xworkz.core_java.interfaces.loose_coupling.car_ex;

public class Runner {
	
	public static void main(String[] args) {
		
		RangeRover range=new RangeRover();
		Suzuki suzuki=new Suzuki();
		Tata tata=new Tata();
		Toyota toyota=new Toyota();
		
		Distributors distributors=new Distributors();
		
		distributors.distribute(tata);
	}

}
