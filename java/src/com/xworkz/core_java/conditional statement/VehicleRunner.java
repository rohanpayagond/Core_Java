class VehicleRunner{
	
 public static void main(String[]travel){
	 
	double distance=Vehicle.transport("Hubli","Bangalore");
	System.out.println("distance= "+distance);
	
	
	double ontime=Vehicle.transport("Hubli","Bangalore","correct");
	
	boolean destination=Vehicle.transport("not reached");
	
	boolean ONtime=Vehicle.transport("true");
	
	boolean Ontime=Vehicle.transport("false");
	
 }
 
 
 
 }