class PoliticianDataOperator{
	
static String[] politicianNames={null,null,null,null};
static int vote=0;

static void publics(String names)
{
	System.out.println("Enter into the Politics");
	politicianNames[vote]=names;
	System.out.println("Name of the Politician :"+names);
	vote++;
	System.out.println("Exit from the Politics");
	
}
	
static void displayDetails()
{
	System.out.println("Begin the Details");
	for(int index=0; index<politicianNames.length; index++)
	{
		System.out.println("No of Politician :"+index);
	}
	
	
}	
	
	
	
}