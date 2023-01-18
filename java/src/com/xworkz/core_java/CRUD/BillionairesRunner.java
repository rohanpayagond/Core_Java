class BillionairesRunner{

public static void main(String[] args)
{
	System.out.println("Benginning of Main");
	Billionaires.rich("Elon Musk");
	Billionaires.rich("Gautam Adani");
	Billionaires.rich("Bernard Arnault");
	Billionaires.rich("Jeff Bezos");
	Billionaires.rich("Bill Gates");
	Billionaires.rich("Warner Buffet");
	Billionaires.rich("Larry Ellison");
	Billionaires.rich("Mukesh Ambani");
	Billionaires.rich("Larry Page");
	Billionaires.rich("Sergey Brin");
	
	
	Billionaires.displayDetails();
	boolean right=Billionaires.find("Bill Gates");
	System.out.println("Name of the Billionaire : "+right);
	
	Billionaires.update("Elon Musk","Rob Walton");
	Billionaires.displayDetails();

	Billionaires.update(2,"Michael Bloomberg");
	Billionaires.displayDetails();
	
	boolean wrong=Billionaires.delete("Warner Buffet");
	System.out.println("Name of the Billionaire Deleted : "+wrong);
	
	boolean fine=Billionaires.delete(9,"Larry Page");
	System.out.println("Name of the Billionaire Deleted : "+fine);
	Billionaires.displayDetails();

	System.out.println("End of Main");
	
}




}