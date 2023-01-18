class Sports{
	
	static void cricketTeamMembers(String[] names)
	{
		System.out.println("Entering the Names of Team Members");
		System.out.println("Total Members = "+names.length);
		
		for(int index=0; index<names.length; index++)
		{
			String ref=names[index];
			System.out.println("Name of Team Member = "+ref);
		}

	}
	
	
	static void kabaddiTeamJerseyNo(int[] nos)
	{
		System.out.println("Entering the Jersey Nos");
		System.out.println("Total Nos = "+nos.length);
		
		for(int index=0; index<nos.length; index++)
		{
			int ref=nos[index];
			System.out.println("Jersey No = "+ref);
		}
	}
	
	
	static void footballTeamMembersSalary(double[] salary)
	{
		System.out.println("Entering the FootBall Team");
		System.out.println("Total Team Members = "+salary.length);
		
		for(int index=0; index<salary.length; index++)
		{
			double ref=salary[index];
			System.out.println("Team Member Salary = "+ref);
		}
	}
	
	
	static void ludoTeamMobileNo(long[] mobile)
	{
		System.out.println("Entering the Ludo Team");
		System.out.println("Total Team Members = "+mobile.length);
		
		for(int index=0; index<mobile.length; index++)
		{
			long ref=mobile[index];
			System.out.println("Team Members MobileNo = "+ref);
		}
	}
	
	
	static void hockeyTeamMembersNoOfMatches(int[] matches)
	{
		System.out.println("Entering the Hockey Team");
		System.out.println("Total No of Team = "+matches.length);
		
		for(int index=0; index<matches.length; index++)
		{
			int ref=matches[index];
			System.out.println("Team Members Match No  = "+ref);
		}
	}
	
	
	static void kokoTeamMembersCountryCode(long[] codes)
	{
		System.out.println("Entering the Koko Team Members");
		System.out.println("Total Nos = "+codes.length);
		
		for(int index=0; index<codes.length; index++)
		{
			long ref=codes[index];
			System.out.println("Team Members Code  = "+ref);
		}
	}
	
	
	static void lagoriTeamMembersAlive(boolean[] alive)
	{
		System.out.println("Entering the Lagori Team Members");
		System.out.println("Total Nos = "+alive.length);
		
		for(int index=0; index<alive.length; index++)
		{
			boolean ref=alive[index];
			System.out.println("Team Members Alive = "+ref);
		}
		
			System.out.println("End of Program");

	}
	
	
	
}