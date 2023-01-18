package Xworkz;

public class ChocolateRunner {

	public static void main(String[] args) {

		Chocolate milk=new Chocolate();
		System.out.println("Default value is "+milk.name);
		System.out.println("Default value is "+milk.brand);
		System.out.println("Default value is "+milk.price);
		System.out.println("Default value is "+milk.flavour);
		
		milk.name="Kitkat";
		milk.brand="Nestle";
		milk.price=25;
		milk.flavour="Blueberry";
		
		System.out.println("Name of the Chocolate is "+milk.name);
		System.out.println("Brand of the Chocolate is "+milk.brand);
		System.out.println("Price of the Chocolate is "+milk.price);
		System.out.println("Flavour of the Chocolate is "+milk.flavour);
	
		System.out.println("End of Properties");
	}

}
