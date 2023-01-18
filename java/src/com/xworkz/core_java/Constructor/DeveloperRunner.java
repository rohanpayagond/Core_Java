package Xworkz;

public class DeveloperRunner {

	public static void main(String[] args) {

		Developer tech=new Developer();
		System.out.println("Default value is "+tech.name);
		System.out.println("Default value is "+tech.education);
		System.out.println("Default value is "+tech.experience);
		System.out.println("Default value is "+tech.salary);
		System.out.println("Default value is "+tech.company);
		
		tech.name="Omkar";
		tech.education="BCA";
		tech.experience=15;
		tech.salary=2500000;
		tech.company="Microsoft";
		
		System.out.println("Name of the Developer "+tech.name);
		System.out.println("Education of the Developer "+tech.education);
		System.out.println("Experience of the Developer "+tech.experience);
		System.out.println("Salary of the Developer "+tech.salary);
		System.out.println("Company of the Developer "+tech.company);
		
		System.out.println("End of Info");
	}

}
