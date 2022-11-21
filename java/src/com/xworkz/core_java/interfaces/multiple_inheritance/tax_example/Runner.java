package com.xworkz.core_java.interfaces.multiple_inheritance.tax_example;

public class Runner {

	public static void main(String[] args) {
		TaxCollector tax=new TaxCollector();
		tax.electricityTax();
		tax.incomeTax();
	}
}
