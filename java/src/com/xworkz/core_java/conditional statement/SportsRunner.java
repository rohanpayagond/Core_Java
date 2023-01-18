class SportsRunner{
	
	public static void main(String[] games)
	{
		String[] names={"MS Dhoni","Virat Kohli","Rishabh Panth","Rohit Sharma","Surya Kumar","KL Rahul","Bhuvaneshwar kumar","Mohmd Shami","Hardik Pandya","Yuzi Chahal"};
		
		Sports.cricketTeamMembers(names);
		
		System.out.println("End of Cricket Team");
	
	
		int[] nos={99,199,97,55,101,255,201,222,111,155};
		
		Sports.kabaddiTeamJerseyNo(nos);
		
		System.out.println("End of Jersey nos");
		
		
		double[] salary={18000d,20000d,25000d,23000d,26000d,21000d,27000d,38000d,34000d,36000d};
		
		Sports.footballTeamMembersSalary(salary);
		
		System.out.println("End of Members Salary");
		
		
		long[] mobile={9980776548L,9845761895L,9745869547L,9980665478L,8865947568L,77959761980L,6362198125L,9845468957L,9845698759L,7259631589L};
		
		Sports.ludoTeamMobileNo(mobile);
		
		System.out.println("End of MobileNos");
		
		
		
		int[] matches={44,19,55,77,26,35,39,55,91,84};
		
		Sports.hockeyTeamMembersNoOfMatches(matches);
		
		System.out.println("End of Team Members Matches");
		
		
		long[] codes={9784565L,6895747L,6365466L,9756894L,9475686L,4758694L,8879569L,8856969L,8745968L,7485987L};
		
		Sports.kokoTeamMembersCountryCode(codes);
		
		System.out.println("End of Team Members Codes");
		
		
		
		boolean[] alive={true,true,false,true,false,false,false,true,true,false};
		
		Sports.lagoriTeamMembersAlive(alive);
		
		System.out.println("End of Lagori Team Members");
		
		
			
	}
	
	
}