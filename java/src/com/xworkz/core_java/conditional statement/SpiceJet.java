class SpiceJet{
	
	static void flightNos(String[] flights)
	{
		System.out.println("Entering into the Runway");
		
		System.out.println("Total Number of flights "+flights.length);
		
		for(int index=0; index<flights.length; index++)
		{
			String ref=flights[index];
			System.out.println("Flight no = "+ref);
		}
		
	}
	
	
}