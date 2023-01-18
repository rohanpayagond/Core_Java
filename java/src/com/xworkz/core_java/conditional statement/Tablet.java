class Tablet{
	
	static double weight;
	static int height;
	static int manufactured;
	static String shipping;
	static int expiry;
	static String name;
	static String[] color;
	static String[] shape;
	static char[] size;
	static int[] width;							
	static String[] packing;
	static String[] used;
	static String[] type;
	static double[] price;
	static String[] transport;
	static String[] chemicals;
	
	
	static void tabletproperties()
	{
		System.out.println(weight);
		System.out.println(height);
		System.out.println(manufactured);
		System.out.println(shipping);
		System.out.println(expiry);
		System.out.println(name);
		
		
		if(color!=null)
		{
			System.out.println("Types of Colors");
			for(int index=0; index<color.length; index++)
			{
				String ref=color[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}	
			

		if(shape!=null)
		{
			System.out.println("Types of Shapes");
			for(int index=0; index<shape.length; index++)
			{
				String ref=shape[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}			
		

		if(size!=null)
		{
			System.out.println("Different Types Of Sizes");
			for(int index=0; index<size.length; index++)
			{
				char ref=size[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
		

		if(width!=null)
		{
			System.out.println("Various in Width");
			for(int index=0; index<width.length; index++)
			{
				int ref=width[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
		
		
		if(packing!=null)
		{
			System.out.println("Kinds of Packing");
			for(int index=0; index<packing.length; index++)
			{
				String ref=packing[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
		
		if(used!=null)
		{
			System.out.println("People Using");
			for(int index=0; index<used.length; index++)
			{
				String ref=used[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
		

		if(type!=null)
		{
			System.out.println("Different Type of Tablets");
			for(int index=0; index<type.length; index++)
			{
				String ref=type[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
		
		
		if(price!=null)
		{
			System.out.println("Charges of Tablet");
			for(int index=0; index<price.length; index++)
			{
				double ref=price[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
		
		
		if(transport!=null)
		{
			System.out.println("Kinds of Transport");
			for(int index=0; index<transport.length; index++)
			{
				String ref=transport[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
		
		
		if(chemicals!=null)
		{
			System.out.println("Types of Chemicals");
			for(int index=0; index<chemicals.length; index++)
			{
				String ref=chemicals[index];
				System.out.println(ref);
			}
		}
		else
			{
			System.out.println("Array not pointing to Memory");
			}		
	












		
	}
	
	
	
	
	
	
}