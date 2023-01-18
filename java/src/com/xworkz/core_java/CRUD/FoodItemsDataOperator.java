class FoodItemsDataOperator{
	
static String[] foodItems={null,null,null,null,null};
static int chips=0;

static void mart(String names)
{
	System.out.println("Enter into the Market");
	foodItems[chips]=names;
	System.out.println("Name of the FoodItem :"+names);
	chips++;
	System.out.println("Exit from the Market");
	
}
	
static void displayDetails()
{
	System.out.println("Begin the Details");
	for(int index=0; index<foodItems.length; index++)
	{
		System.out.println("No of Items :"+index);
	}
	
	
}	
	
	
	
}