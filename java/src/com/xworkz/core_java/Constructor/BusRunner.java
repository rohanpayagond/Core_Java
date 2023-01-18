package Xworkz;

public class BusRunner {

	public static void main(String[] args) {
		

		Bus ticket=new Bus();
		System.out.println("Default value is " +ticket.no);
		System.out.println("Default value is " +ticket.starting);
		System.out.println("Default value is " +ticket.destination);
		
		
		ticket.no="KA25R4695";
		ticket.starting="Bangalore";
		ticket.destination="Hubli";
		
		System.out.println("Bus no is "+ ticket.no);
		System.out.println("Bus Starting point is "+ ticket.starting);
		System.out.println("Bus Destination is "+ ticket.destination);
		
		System.out.println("End of Journey");
		
		
	}

}
