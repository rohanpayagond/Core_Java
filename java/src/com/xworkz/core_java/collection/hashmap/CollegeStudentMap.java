package com.xworkz.java.collection.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CollegeStudentMap {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.setName("ROHAN");
		stu.setMobileNo(9886765895l);
		stu.setLocation("HUBLI");

		Student stu1 = new Student();
		stu1.setName("SHARATH");
		stu1.setMobileNo(968568956l);
		stu1.setLocation("MANDYA");

		Student stu2 = new Student();
		stu2.setName("CHIDU");
		stu2.setMobileNo(8316589647l);
		stu2.setLocation("BAGALKOT");

		Student stu3 = new Student();
		stu3.setName("MADHU");
		stu3.setMobileNo(8869657896l);
		stu3.setLocation("SHIVMOGGA");

		Student stu4 = new Student();
		stu4.setName("MALATESH");
		stu4.setMobileNo(9879685987l);
		stu4.setLocation("KUSAGALL");

		College clg = new College();
		clg.setName("RV");
		clg.setLocation("BANGALORE");
		clg.setPincode(580038);

		College clg1 = new College();
		clg1.setName("SKSV");
		clg1.setLocation("LAXMESHWAR");
		clg1.setPincode(583116);

		ArrayList<Student> al = new ArrayList();
		al.add(stu4);
		al.add(stu2);
		al.add(stu);

		ArrayList<Student> al1 = new ArrayList();
		al1.add(stu1);
		al1.add(stu3);

		HashMap<College, ArrayList<Student>> hm = new HashMap();
		hm.put(clg1, al1);
		hm.put(clg, al);

		for (Map.Entry<College, ArrayList<Student>> map : hm.entrySet()) {

			if (map.getKey().getName().equals("RV")) {
				for (Student std : map.getValue()) {
					System.out.println("Name : "+std.getName() +"  "+ "Mobile Number : " + std.getMobileNo()+"  " + "Location : " + std.getLocation());
				}

			}

		}
	}

}
