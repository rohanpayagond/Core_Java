class GroceryRunner{
	
	public static void main(String[] market)
	{
		System.out.println("Entering into the Store");
		
		Grocery.setPlace("EasyBuy");
		Grocery.setService("Self Service");
		Grocery.setHygenic(true);
		Grocery.setMinProfit(45);
		Grocery.setMinCustomers(150d);
		Grocery.setItems(3000d);
		Grocery.setDamage(true);
		Grocery.setAvgSize(40000d);
		Grocery.setName("SuperMarket");
		Grocery.setLiquour(false);
		Grocery.setFloors(3);
		Grocery.setType("Hypermarket And SuperCentres");
		Grocery.setModeOfTransactions("Cash And Card");
		Grocery.setNoOfWorkers(30);
		
		
		String ref1=Grocery.getPlace();
		System.out.println("Bangalore = "+ref1);
		
		String ref2=Grocery.getService();
		System.out.println("Type Of Service = "+ref2);
		
		boolean ref3=Grocery.isHygenic();
		System.out.println("Is Store Hygenic = "+ref3);
				
		int ref4=Grocery.getMinProfit();
		System.out.println("Stores Minimum Profit ="+ref4);
		
		double ref5=Grocery.getMinCustomers();
		System.out.println("No of Customers = "+ref5);
		
		double ref6=Grocery.getItems();
		System.out.println("Kinds of Items = "+ref6);
	
		boolean ref7=Grocery.isDamage();
		System.out.println("Does Items Get Damaged = "+ref7);
				
		double ref8=Grocery.getAvgSize();
		System.out.println("Minimum Size = "+ref8);
				
		String ref9=Grocery.getName();
		System.out.println("Name of the Store = "+ref9);
				
		boolean ref10=Grocery.isLiquour();
		System.out.println("Is Liquour Available = "+ref10);
				
		int ref11=Grocery.getFloors();
		System.out.println("Total Floors = "+ref11);
				
		String ref12=Grocery.getType();
		System.out.println("Types of Market = "+ref12);
				
		String ref13=Grocery.getModeOfTransactions();
		System.out.println("Mode of Charge = "+ref13);
		
		int ref14=Grocery.getNoOfWorkers();
		System.out.println("Total Workers = "+ref14);		
		
		
		System.out.println("Exiting the Store");
		
	}
	
	
}