package Xworkz;

public class DistCollectorRunner {

	public static void main(String[] args) {

		DistCollector police=new DistCollector();
		System.out.println("Default value is "+police.name);
		System.out.println("Default value is "+police.age);
		System.out.println("Default value is "+police.district);
		System.out.println("Default value is "+police.batchNo);
		
		police.name="Gurudath Hegde";
		police.age=48;
		police.district="Dharwad";
		police.batchNo=2018;
		
		System.out.println("DistCollector name is "+police.name);
		System.out.println("DistCollector age is "+police.age);
		System.out.println("DistCollector district is "+police.district);
		System.out.println("DistCollector batchNo is "+police.batchNo);
		
		
		System.out.println("End of Info");
		
	}

}
