package com.xworkz.java.collection.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomerBankMap {

	public static void main(String[] args) {

		Customers c = new Customers();
		c.setName("ROHAN");
		c.setAccountNumber(312587469547L);
		c.setLocation("HUBLI");

		Customers c1 = new Customers();
		c1.setName("RAGHU");
		c1.setAccountNumber(886478654781L);
		c1.setLocation("GADAG");

		Customers c2 = new Customers();
		c2.setName("MALATESH");
		c2.setAccountNumber(897458965747L);
		c2.setLocation("HAVERI");

		Customers c3 = new Customers();
		c3.setName("SHARATH");
		c3.setAccountNumber(886965784869L);
		c3.setLocation("MANDYA");

		Customers c4 = new Customers();
		c4.setName("MADHU");
		c4.setAccountNumber(886895768547L);
		c4.setLocation("SHIVMOGA");

		Customers c5 = new Customers();
		c5.setName("CHIDU");
		c5.setAccountNumber(684756895687L);
		c5.setLocation("BAGALKOT");

		Customers c6 = new Customers();
		c6.setName("MANOJ");
		c6.setAccountNumber(896987568965l);
		c6.setLocation("MADDUR");

		Customers c7 = new Customers();
		c7.setName("DARSHAN");
		c7.setAccountNumber(789658965748L);
		c7.setLocation("MYSORE");

		Bank b = new Bank();
		b.setName("KARNATAKA BANK");

		Bank b1 = new Bank();
		b1.setName("HDFC BANK");

		Bank b2 = new Bank();
		b2.setName("SBI BANK");

		ArrayList<Customers> arrayList = new ArrayList();
		arrayList.add(c);
		arrayList.add(c2);
		arrayList.add(c4);

		ArrayList<Customers> arrayList2 = new ArrayList();
		arrayList2.add(c1);
		arrayList2.add(c3);
		arrayList2.add(c7);

		ArrayList<Customers> arrayList3 = new ArrayList();
		arrayList3.add(c5);
		arrayList3.add(c6);

		HashMap<Bank, ArrayList<Customers>> hashMap = new HashMap();
		hashMap.put(b1, arrayList3);
		hashMap.put(b, arrayList);
		hashMap.put(b2, arrayList2);

		for (Map.Entry<Bank, ArrayList<Customers>> hm : hashMap.entrySet()) {

			if (hm.getKey().getName().equals("KARNATAKA BANK")) {
				System.out.println("DETAILS OF THE BANK : ");

				for (Customers customer : hm.getValue()) {

					System.out.println("Name of the Account Holder : " + customer.getName());
					System.out.println("Account Number : " + customer.getAccountNumber());
					System.out.println("Location of the Bank : " + customer.getLocation());
					System.out.println("       ");
				}
			}

		}

	}

}
