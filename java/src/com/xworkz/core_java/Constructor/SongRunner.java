package Xworkz;

public class SongRunner {

	public static void main(String[] args) {

		Song kannada=new Song();
		System.out.println("Default Value is "+kannada.name);
		System.out.println("Default Value is "+kannada.language);
		System.out.println("Default Value is "+kannada.singer);
		System.out.println("Default Value is "+kannada.lyricst);
		System.out.println("Default Value is "+kannada.type);
		
		kannada.name="KGF Sulthana";
		kannada.language="Kannada";
		kannada.singer="Sachin Basrur";
		kannada.lyricst="Ravi Basrur";
		kannada.type="Dramatic";
				
		System.out.println("Name of the Song "+kannada.name);
		System.out.println("Language of the Song "+kannada.language);
		System.out.println("Singer of the Song "+kannada.singer);
		System.out.println("Lyricst of the Song "+kannada.lyricst);
		System.out.println("Type of the Song "+kannada.type);
	
		System.out.println("End of Details");
	}

}
