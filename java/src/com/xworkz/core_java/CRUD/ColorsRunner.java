class ColorsRunner{

public static void main(String[] colornames)
{
	System.out.println("Beginning of Main");
	
	Colors.black("Red");
	Colors.black("Green");
	Colors.black("Blue");
	Colors.black("Orange");
	Colors.black("Yellow");
	Colors.black("Grey");
	Colors.black("Violet");
	
	Colors.displayColors();
	boolean right=Colors.findColor("Black");
	System.out.println("Color Found is : "+right);	
	
	System.out.println("End of Main");
	
}










}