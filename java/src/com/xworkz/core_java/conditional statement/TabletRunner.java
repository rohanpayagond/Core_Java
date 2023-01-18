class TabletRunner{
	
	public static void main(String[] fever)
	{
		System.out.println("Entering the Characteristics Of Tablet");
		
		Tablet.tabletproperties();
		
		Tablet.weight=10.5d;
		Tablet.height=6;
		Tablet.manufactured=2020;
		Tablet.shipping="Bulk";
		Tablet.expiry=2025;
		Tablet.name="Dolo";
		
		String[] silver={"White","Yellow","Orange","Pale yellow"};
		Tablet.color=silver;
		
		String[] circle={"Egg Shape","Round","Rectangle"};
		Tablet.shape=circle;
		
		char[] sizes={'S','M','L'};	
		Tablet.size=sizes;
		
		int[] no={3,5,8,12};
		Tablet.width=no;	
		
		String[] black={"Aluminum Foil","Plastic"};	
		Tablet.packing=black;	
		
		String[] child={"Adults","Old Ones"};
		Tablet.used=child;
		
		String[] flame={"Paracetamol","Non Steroidal"};
		Tablet.type=flame;
		
		double[] rs={4.5d,3.5d};	
		Tablet.price=rs;
		
		String[] bus={"Truck","Palne"};
		Tablet.transport=bus;
		
		String[] acid={"Aceclofenac","Serratiopeptidase"};
		Tablet.chemicals=acid;
		
		Tablet.tabletproperties();

		System.out.println("Exit from Characters");
		

	}
	
}