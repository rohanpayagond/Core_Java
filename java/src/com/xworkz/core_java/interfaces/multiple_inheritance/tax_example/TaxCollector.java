package com.xworkz.core_java.interfaces.multiple_inheritance.tax_example;

public class TaxCollector implements StateTax,CentralTax{

	
	public void incomeTax() {
		System.out.println("Income tax is collected by StateTax...");
	}

	public void electricityTax() {
		System.out.println("Electricity Tax will be collected by Central Tax...");
	}

}
