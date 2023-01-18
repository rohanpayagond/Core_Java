class Colors{
	
static String[] colors={null,null,null,null,null,null,null};
static int indigo=0;

static void black(String banna)
{
	System.out.println("Enter into the Colors");
	if(indigo>=7)
	{
		System.out.println("Colors Name is Exceeded");
		return;
	}

if(banna!=null  &&  banna.length()>=3)
{
	colors[indigo]=banna;
	System.out.println("Name of the Color : "+banna);
	indigo++;
}	
else
{
	System.err.println("Color name not valid");
}

}
	
static void displayColors()
{
	System.out.println("Begin the Display");
	for(int index=0; index<colors.length; index++)
	{
		System.out.println("Color Name is : "+index);
	}
}	
	
static boolean findColor(String name)
{
	for(int find=0; find<colors.length; find++)
	{
		String ref=colors[find];
		if (ref==name)
		{
			System.out.println("Color Name Found : "+name);
			return true;
		}
	}
	return false;
}
	
	
	
	
}