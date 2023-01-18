class Billionaires{

static String[] save={null,null,null,null,null,null,null,null,null,null};
static int money=0;

static void rich(String billionaire)
{
	System.out.println("Enter in to the Billionaire Group");
	if(money>=10)
	{
		System.out.println("Group will be Exceeded");
		return;
	}
	
	if(billionaire!=null && billionaire.length()>=5)
	{
		save[money]=billionaire;
		System.out.println("Name of the Billionaire : "+billionaire);
	}
	else{
		System.out.println("Name does not include");
	}
	
}
static void displayDetails()
{
	System.out.println("Begin the Details");
	for(int index=0; index<save.length; index++)
	{
		System.out.println("Element no is : "+index+" : "+"Name of Billionaire is "+save[index]);
	}
}

static boolean find(String billion)
{
	if(billion!=null && billion.length()>5)
	{
		System.out.println("Name is Valid");
		for(int index=0; index<save.length; index++)
		{
			String ref=save[index];
			if(ref==billion)
			{
				System.out.println("Billionaire found : "+index);
				return true;
			}
		}
	}
	return false;

}

static String update(String oldBillionaire,String newBillionaire)
{
	System.out.println("Begin the Update");

if(oldBillionaire!=null && newBillionaire!=null && oldBillionaire.length()>5 && newBillionaire.length()>5)
{
	System.out.println("Ready for Update");
	for(int index=0; index<save.length; index++)
	{
		String ref=save[index];
		if(ref==oldBillionaire)
		{
			System.out.println("Name is Found : "+oldBillionaire);
			save[index]=newBillionaire;
			
			System.out.println("Name is Updated");
			return newBillionaire;
			
		}
		else{
		System .out.println("Not valid For Update");
			}
	
	}
	
}
	return null;
}

static String update(int index,String newBillionaire)
{
	System.out.println("Update Started");
	if(newBillionaire!=null && newBillionaire.length()>5)
	{
		System.out.println("Name is valid for Update");
		save[index]=newBillionaire;
		return newBillionaire;
	}
	return null;
}

static boolean delete(String billion)
{
	System.out.println("Begin The Delete Process");
	if(billion!=null && billion.length()>5)
	{
		System.out.println("Name is Valid");
		for(int point=0; point<save.length; point++)
		{
			String ref=save[point];
			if(ref==billion)
			{
				System.out.println("Billionaire found Delete the Name : "+point);
				return true;
			}
		}
	}
	return false;
}

static boolean delete(int index,String billion)
{
	System.out.println("Delet Process Started");
	if(billion!=null && billion.length()>5)
	{
		System.out.println("Name is valid to Delete");
		save[index]=billion;
		return true;
	}
	return false;
}















}