class TempleDataOperator{

static String[] templeName={null,null,null,null,null,null};
static int parmathma=0;

static void peace(String name)
{
	System.out.println("Enter into the Temple");
	templeName[parmathma]=name;
	System.out.println("Name of the Temple : "+name);
	parmathma++;
	System.out.println("Exit from the Temple");
	
}

static void displayDetails()
{
	System.out.println("Start of displayDetails");
	for(int index=0; index<templeName.length; index++)
	{
		System.out.println("No of Temples : "+index);
	}
} 





}