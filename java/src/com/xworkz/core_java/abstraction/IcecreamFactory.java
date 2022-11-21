package com.xworkz.core_java.abstraction;

abstract class IcecreamFactory {

	void rawMaterial() {
		System.out.println("Raw is produced by this factory");
	}

	
	abstract void packing();
}
