class Card{
	
	static char size;
	static String shape;
	static String material;
	static double height;
	static double width;
	static int weight;
	static String location;
	static int year;
	static String name;
	static int price;
	static String type;
	static String[] colors;
	
	
	
	static void displayDetails()
	{
		System.out.println(size);
		System.out.println(shape);
		System.out.println(material);
		System.out.println(height);
		System.out.println(width);
		System.out.println(weight);
		System.out.println(location);
		System.out.println(year);
		System.out.println(name);
		System.out.println(price);
		System.out.println(type);
		if(colors!=null)
		{
			System.out.println("Array pointiong to Memory");
			for(int index=0; index<colors.length; index++)
			{
				String ref=colors[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
		

	}
	
	
}