class Vehicle{
	
	static double transport(String source,String destination)
	{
		System.out.println("Entered Source And Destination");
		if(source=="Hubli" && destination=="Bangalore")
	{
		System.out.println("Source= "+source+ " Destination= "+destination);
		return 455;
	}
		if(source=="Bangalore"  &&  destination=="Mysore")
	{
		System.out.println("Source= "+source +" Destination= "+destination);
		return 150;
	}
	
		if(source=="Hubli" && destination=="Haveri")
	{
		System.out.println("Source= "+source +" Destination= "+destination);
		return 85;
	}
		else
		System.out.println("no distance is calculated");
		return 0.0;
	}
	
	
	static double transport(String source,String destination, String ontime)
	{
		System.out.println("Entered Source, Destination And Ontime");
		if(ontime=="correct")
		{
		System.out.println("It will reach ontime");
		return 1;
		}
		
		else
		System.out.println("does not reach on time");
		return 0;
	}
 
 
 
	static boolean transport( String destination)
	{
		System.out.println("Entered Destination");
		if(destination=="reached")
	   {
		 System.out.println("Destination reached successfully");
			return true;
	   }
	 
		if(destination=="not reached")
	   {
		 System.out.println("Destination not reached");
		 return false;
	   }
		return false;
	}
  
 
	static boolean transport(String destination, boolean ONtime)
	{
		System.out.println("Entered Destination And Ontime");
		if(ONtime==true)
		{
		 System.out.println("Reaches on time");
		 return true;
		}
		
		if(ONtime==false)
		{
		 System.out.println("It doesn't  reach on time");
		 return false;
		}
		return false;	
	}
	
	
	static boolean transport( boolean Ontime)
	{
		System.out.println("Entered Ontime");
		if(Ontime==true)
		{
		 System.out.println("Vehicle reaches on time");
		 return true;
		}
		
		if(Ontime==false)
		{
		 System.out.println("Vehicle does not reach on time");
		 return false;
		}
		
		return(false); 
	 
	 
	}	
	

		


		
		
}