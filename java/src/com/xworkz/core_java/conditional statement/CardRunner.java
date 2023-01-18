class CardRunner{
	
	public static void main(String[] invitation)
	{
		System.out.println("Entering into the Invitation Card");
		
		Card.displayDetails();
		
		Card.size='M';
		Card.shape="Rectangle";
		Card.material="Cotton cardstock";
		Card.height=12.5d;
		Card.width=22.5d;
		Card.weight=55;
		Card.location="Bangalore";
		Card.year=2022;
		Card.name="X-Wokz";
		Card.price=35;
		Card.type="Business Event";
		String[] gold={"Red","Blue","Yellow","Orange","Grey"};
		Card.colors=gold;
		
		Card.displayDetails();

		System.out.println("Exiting the Card");
				
	}
	
}