class GraduateDataOperator{
	
static String[] graduates={null,null,null,null,};
static int student=0;

static void performance(String details)
{
	System.out.println("Enter into the Info");
	graduates[student]=details;
	System.out.println("Name of the Students :"+details);
	student++;
	System.out.println("Exit from the Info");
	
}
	
static void displayDetails()
{
	System.out.println("Begin the Details");
	for(int index=0; index<graduates.length; index++)
	{
		System.out.println("No of Graduates :"+index);
	}
	
	
}	
	
	
	
}