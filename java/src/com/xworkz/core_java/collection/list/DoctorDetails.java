package com.xworkz.java.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class DoctorDetails {

	public static void main(String[] args) {

		Doctor veer = new Doctor("Veeresh", "Hubli", "Cardiologist");
		Doctor dharam = new Doctor("Dharam", "Bangalore", "Dentist");
		Doctor pradee = new Doctor("Pradeep", "Mysore", "Psychiatry");
		Doctor kartik = new Doctor("Kartik", "Haveri", "Gynecologist");
		Doctor manoj = new Doctor("Manoj", "Mandya", "Dermatology");
		Doctor rahul = new Doctor("Rahul", "Dharwad", "Allergist");
		Doctor sanket = new Doctor("Sanket", "Gokak", "Neurologist");
		Doctor rp = new Doctor("Rohan", "Hubli", "Pediatrics");
		
		ArrayList<Doctor> arrayList = new ArrayList<Doctor>();
		arrayList.add(pradee);
		arrayList.add(veer);
		
		ArrayList<Doctor> arrayList2 = new ArrayList<Doctor>();
		arrayList2.add(manoj);
		arrayList2.add(kartik);
		arrayList2.add(dharam);
		
		ArrayList<Doctor> arrayList3 = new ArrayList<Doctor>();
		arrayList3.add(sanket);
		arrayList3.add(rahul);
		
		ArrayList<Doctor> arrayList4 = new ArrayList<Doctor>();
		arrayList4.add(rp);
		
		Hospital hospital = new Hospital("Jayadev", arrayList);
		Hospital hospital2 = new Hospital("ESI", arrayList2);
		Hospital hospital3 = new Hospital("Primecare", arrayList4);
		Hospital hospital4 = new Hospital("Wellcare Centre", arrayList3);
		
		ArrayList<Hospital> hosp = new ArrayList<Hospital>();
		hosp.add(hospital);
		hosp.add(hospital2);
		hosp.add(hospital3);
		hosp.add(hospital4);
		
		ListIterator<Hospital> list = hosp.listIterator();
		while(list.hasNext()) {
			Hospital itr = list.next();
			
			if(itr.name.equals("Primecare"))
				System.out.println(itr);
		}

		
		
	}

}
