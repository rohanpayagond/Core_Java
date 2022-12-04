package com.xworkz.java.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentDetails {

	public static void main(String[] args) {
		
		Student sharath = new Student("Sharath", "Mysore", "ATME");
		Student chidu = new Student("Chidanand", "Bagalkot", "BSE");
		Student madhu = new Student("Madhu", "Shivmogga", "KSKC");
		Student raghu = new Student("Raghvendra", "Gadag", "SKSV");
		Student maltesh = new Student("Maltesh", "Dharwad", "SDM");
		Student darshan = new Student("Darshan", "Hubli", "BVB");
		
		ArrayList<Student> ashaStudents = new ArrayList<Student>();
		ashaStudents.add(maltesh);
		ashaStudents.add(sharath);
		ashaStudents.add(madhu);
		
		ArrayList<Student> omkarStudents = new ArrayList<Student>();
		omkarStudents.add(darshan);
		omkarStudents.add(raghu);
		omkarStudents.add(chidu);
		
		Trainer asha = new Trainer("Asha", ashaStudents);
		Trainer omkar = new Trainer("Omkar", omkarStudents);
		
		ArrayList<Trainer> trainer = new ArrayList<Trainer>();
		trainer.add(omkar);
		trainer.add(asha);
		
		ListIterator<Trainer> train = trainer.listIterator();
		while(train.hasNext()) {
			Trainer next = train.next();
			
			if(next.name.equals("Asha"))
			System.out.println(next);
			
		}

	}

}
