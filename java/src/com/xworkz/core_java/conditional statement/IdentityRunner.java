class IdentityRunner{
	
	public static void main(String[] info)
	{
		System.out.println("Name of the Cricketers");
		String no1="Dhoni";
		Identity.printName(no1);
		String no2="Kohli";
		Identity.printName(no2);
		
		Identity.printName("Karthik");
		Identity.printName("Shreyas");
		Identity.printName("Jadeja");
		Identity.printName("Rishab");
		Identity.printName("Rohit");
		Identity.printName("KL Rahul");
		Identity.printName("Bhuvi");
		Identity.printName("Suryakumar");
		Identity.printName("Hardik");
		Identity.printName("Chahal");
		
		
		System.out.println("Execution of Name And Email");
		String name1="Ajay";
		String email1="ajaysk@gmail.com";
		Identity.nameAndEmail(name1,email1);

		String name2="Sanjay";
		String email2="ssanjay@gmail.com";
		Identity.nameAndEmail(name2,email2);
		
		Identity.nameAndEmail("Rahul","rahul97@gamil.com");
		Identity.nameAndEmail("Raju","rraju@gamil.com");
		Identity.nameAndEmail("Rajat","rajat15@gamil.com");
		Identity.nameAndEmail("Akash","lakash@gamil.com");
		Identity.nameAndEmail("Vijay","rvijay@gamil.com");
		Identity.nameAndEmail("Darshan","darshan74@gamil.com");
		Identity.nameAndEmail("Veeresh","bveeresh@gamil.com");
		Identity.nameAndEmail("Dharam","ndharam98@gamil.com");
		Identity.nameAndEmail("Goutam","gouti94@gamil.com");
		Identity.nameAndEmail("Shivu","shivu@gamil.com");
		
		
		System.out.println("Execution of Name And MobileNo");
		String name1="Sujay";
		long mobileno1=9847564518L;
		Identity.nameAndMobile(name1,mobileno1);

		String name2="Pradeep";
		long mobileno2=8033478957L;
		Identity.nameAndMobile(name2,mobileno2);

		Identity.nameAndMobile("Ashok",9784567894L);
		Identity.nameAndMobile("Santhosh",96978454789L);
		Identity.nameAndMobile("Ambarish",9457984647L);
		Identity.nameAndMobile("Suman",9845761928L);
		Identity.nameAndMobile("Abhi",9887465898L);
		Identity.nameAndMobile("Manju",9778479647L);
		Identity.nameAndMobile("Pankaj",9667821697L);
		Identity.nameAndMobile("Shantesh",9978465962L);
		Identity.nameAndMobile("Manoj",9987458762L);
		Identity.nameAndMobile("Rana",9887468957L);
		
		
		System.out.println("Execution of Name And Age");
		String name1="Ashutosh";
		int age1=35;
		Identity.nameAndAge(name1,age1);

		String name2="Amir";
		int age2=32;
		Identity.nameAndAge(name2,age2);

		Identity.nameAndAge("Sanket",28);
		Identity.nameAndAge("Aman",29);
		Identity.nameAndAge("Sudeep",47);
		Identity.nameAndAge("Anil",44);
		Identity.nameAndAge("Oman",36);
		Identity.nameAndAge("Chidanand",25);
		Identity.nameAndAge("Raghu",31);
		Identity.nameAndAge("Maltesh",24);
		Identity.nameAndAge("Sangmesh",23);
		Identity.nameAndAge("Ram",27);
		
		
		System.out.println("Execution of Name And Address");
		String name1="Ashutosh";
		String address1="Rajajinagar";
		Identity.nameAndAddress(name1,address1);

		String name2="Amir";
		String address2="Yalahanka";
		Identity.nameAndAddress(name2,address2);

		Identity.nameAndAddress("Sanket","MG Road");
		Identity.nameAndAddress("Mahesh","Magadi");
		Identity.nameAndAddress("Kiran","RR Nagar");
		Identity.nameAndAddress("Shankar","Silicon City");
		Identity.nameAndAddress("Ravi","Jayanagar");
		Identity.nameAndAddress("Ajay","Vijaynagar");
		Identity.nameAndAddress("Sanath","Banashankari");
		Identity.nameAndAddress("Abhay","Koramangala");
		Identity.nameAndAddress("Chinmay","Yeshwantpura");
		Identity.nameAndAddress("Prasad","Hebbal");
		
		
		System.out.println("Execution of Name And Address");
		String name1="Ashutosh";
		String email1="ashutosh14@gmail.com";
		String address1="Rajajinagar";
		int age1=35;
		Identity.nameAndEmailAndAddressAndAge(name1,email1,address1,age1);

		String name2="Amir";
		String email2="amirsj@gmail.com";
		String address2="Yalahanka";
		int age2=37;
		Identity.nameAndEmailAndAddressAndAge(name2,email1,address2,age2);
		
		Identity.nameAndEmailAndAddressAndAge("Sanket","sanket12@gmail.com","MG Road",36);
		Identity.nameAndEmailAndAddressAndAge("Mahesh","mahesh98@gmail.com","Magadi",33);
		Identity.nameAndEmailAndAddressAndAge("Kiran","kiran44@gmail.com","RR Nagar",31);
		Identity.nameAndEmailAndAddressAndAge("Shankar","sshankar@gmail.com","Silicon City",30);
		Identity.nameAndEmailAndAddressAndAge("Ravi","rravi14@gmail.com","Jayanagar",25);
		Identity.nameAndEmailAndAddressAndAge("Ajay","ajayc@gmail.com","Vijaynagar",21);
		Identity.nameAndEmailAndAddressAndAge("Sanath","ksanath47@gmail.com","Banashankari",26);
		Identity.nameAndEmailAndAddressAndAge("Abhay","abhay96@gmail.com","Koramangala",29);
		Identity.nameAndEmailAndAddressAndAge("Chinmay","chinmay66@gmail.com","Yeshwantpura",27);
		Identity.nameAndEmailAndAddressAndAge("Prasad","prasad99@gmail.com","Hebbal",30);
		
		
		System.out.println("Execution of Name And Gender");
		String name1="Ajay";
		char gender1='M';
		Identity.nameAndGender(name1,gender1);

		String name2="Sanjay";
		char gender2='M';
		Identity.nameAndGender(name2,gender2);

		
		Identity.nameAndGender("Rahul",'M');
		Identity.nameAndGender("Manjula",'F');
		Identity.nameAndGender("Laxmi",'F');
		Identity.nameAndGender("Akash",'M');
		Identity.nameAndGender("Saaket",'M');
		Identity.nameAndGender("Aditi",'F');
		Identity.nameAndGender("Arjun",'M');
		Identity.nameAndGender("Laxman",'M');
		Identity.nameAndGender("Nishvika",'F');
		Identity.nameAndGender("Krishna",'M');
		
		
		System.out.println("Execution of Name And Working");
		String name1="Akash";
		String working1="Working";
		Identity.nameAndWorking(name1,working1);

		String name2="Shivu";
		String working2="Not Working";
		Identity.nameAndWorking(name2,working2);

		Identity.nameAndWorking("Rajesh","Not Working");
		Identity.nameAndWorking("Rakesh","Working");
		Identity.nameAndWorking("Suresh","Working");
		Identity.nameAndWorking("Basavraj","Working");
		Identity.nameAndWorking("Sourabh","Not Working");
		Identity.nameAndWorking("Nikhil","Working");
		Identity.nameAndWorking("Prakash","Not Working");
		Identity.nameAndWorking("Ramesh","Not Working");
		Identity.nameAndWorking("Niroop","Working");
		Identity.nameAndWorking("Gagan","Working");
		
		
		System.out.println("Execution of Name And Shirt Size");
		String name1="Adarsh";
		char shirtsize1='L';
		Identity.nameAndShirtSize(name1,shirtsize1);

		String name2="Shivu";
		char shirtsize2='S';
		Identity.nameAndShirtSize(name2,shirtsize2);

		
		Identity.nameAndShirtSize("Rajesh",'XS');
		Identity.nameAndShirtSize("Rakesh",'XL');
		Identity.nameAndShirtSize("Suresh",'L');
		Identity.nameAndShirtSize("Basavraj",'M');
		Identity.nameAndShirtSize("Sourabh",'XM');
		Identity.nameAndShirtSize("Nikhil",'XL');
		Identity.nameAndShirtSize("Prakash",'XS');
		Identity.nameAndShirtSize("Ramesh",'XM');
		Identity.nameAndShirtSize("Niroop",'M');
		Identity.nameAndShirtSize("Gagan",'L');
		
		
		System.out.println("Execution of Name And Pant Size");
		String name1="Adarsh";
		int pantsize1=36;
		Identity.nameAndPantSize(name1,pantsize1);

		String name2="Shivu";
		int pantsize2=34;
		Identity.nameAndPantSize(name2,pantsize2);

		Identity.nameAndPantSize("Rajesh",30);
		Identity.nameAndPantSize("Rakesh",30);
		Identity.nameAndPantSize("Suresh",28);
		Identity.nameAndPantSize("Basavraj",34);
		Identity.nameAndPantSize("Sourabh",34);
		Identity.nameAndPantSize("Nikhil",36);
		Identity.nameAndPantSize("Prakash",38);
		Identity.nameAndPantSize("Ramesh",32);
		Identity.nameAndPantSize("Niroop",40);
		Identity.nameAndPantSize("Gagan",42);
		
		
		System.out.println("Execution of Name,Wieght And Height");
		String name1="Bheem";
		float weight1=65f;
		float height1=5'5f;
		Identity.nameAndWeightAndHeight(name1,weight1,height1);

		String name2="Shivu";
		float weight2=58f;
		float height2=5'3f;
		Identity.nameAndWeightAndHeight(name2,weight2,height2);

		
		Identity.nameAndWeightAndHeight("Rajesh",55f,5'1f);
		Identity.nameAndWeightAndHeight("Rakesh",68f,5'0f);
		Identity.nameAndWeightAndHeight("Suresh",74f,5'5f);
		Identity.nameAndWeightAndHeight("Basavraj",64f,5'4f);
		Identity.nameAndWeightAndHeight("Sourabh",59f,5'0f);
		Identity.nameAndWeightAndHeight("Nikhil",66f,5'7f);
		Identity.nameAndWeightAndHeight("Prakash",77f,5'9f);
		Identity.nameAndWeightAndHeight("Ramesh",67f,6'0f);
		Identity.nameAndWeightAndHeight("Niroop",49f,5'5f);
		Identity.nameAndWeightAndHeight("Gagan",51f,5'8f);
		

		
	}
	
	
	
}