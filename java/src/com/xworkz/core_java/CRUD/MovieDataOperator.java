class MovieDataOperator{
	
static String[] movieName={null,null,null,null,null};
static int avengers=0;

static void ticket(String name)
{
	System.out.println("Enter into the Movie");
	movieName[avengers]=name;
	System.out.println("Name of the Movie :"+name);
	avengers++;
	System.out.println("Exit form the Movie");
	
}
	
static void displayDetails()
{
	System.out.println("Begin the Details");
	for(int index=0; index<movieName.length; index++)
	{
		System.out.println("Total Movies :"+index);
	}
}	
	
	
	
	
	
	
}