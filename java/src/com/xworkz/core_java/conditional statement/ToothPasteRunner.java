class ToothPasteRunner{
	
	public static void main(String[] properties)
	{
		System.out.println("Properties of Paste");
		
		ToothPaste.setName("Colgate");
		ToothPaste.setPrice(125);
		ToothPaste.setManufacturing("2022");
		ToothPaste.setExpiry("2024");
		ToothPaste.setWeight(150d);
		ToothPaste.setColor("White");
		ToothPaste.setSize('L');		
		ToothPaste.setIngredients("Calcium Carbonate");
		ToothPaste.setFormula("Na2PO3F");
		ToothPaste.setDensity(1.33d);
		ToothPaste.setForKids(false);
		ToothPaste.setMainElement("Fluorine");
		ToothPaste.setPhValue(6.8d);
		ToothPaste.setAcidic(true);
		ToothPaste.setFunction("Remove Plaque");
		
		
		
		String ref1=ToothPaste.getName();
		System.out.println("Name of the Paste = "+ref1);
		
		int ref2=ToothPaste.getPrice();
		System.out.println("Amount in Rupees = "+ref2);
		
		String ref3=ToothPaste.getManufacturing();
		System.out.println("Year of Manufactured = "+ref3);
		
		String ref4=ToothPaste.getExpiry();
		System.out.println("Year Of Expiry = "+ref4);
		
		double ref5=ToothPaste.getWeight();
		System.out.println("Total Weight = "+ref5);
		
		String ref6=ToothPaste.getColor();
		System.out.println("Type of Color = "+ref6);
		
		char ref7=ToothPaste.getSize();
		System.out.println("Maximum Size = "+ref7);
		
		String ref8=ToothPaste.getIngredients();
		System.out.println("Various Ingredients = "+ref8);
		
		String ref9=ToothPaste.getFormula();
		System.out.println("Chemical Formula = "+ref9);
		
		double ref10=ToothPaste.getDensity();
		System.out.println("Density of Paste = "+ref10);
		
		boolean ref11=ToothPaste.isForKids();
		System.out.println("Is Paste for Kids= "+ref11);
		
		String ref12=ToothPaste.getMainElement();
		System.out.println("Main Substance of Paste = "+ref12);
		
		double ref13=ToothPaste.getPhValue();
		System.out.println("ph value Should be = "+ref13);
		
		boolean ref14=ToothPaste.isAcidic();
		System.out.println("Is Paste Acidic = "+ref14);
		
		String ref15=ToothPaste.getFunction();
		System.out.println("Main Function of Paste = "+ref15);
		
	
		System.out.println("End Of Properties");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}