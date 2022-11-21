package com.xworkz.core_java.object_class_methods.equals_method;

public class Bakery {
	
	String name;
	double pinCode;
	String location;
	
	
	public Bakery(String name, double pinCode, String location) {
		this.name = name;
		this.pinCode = pinCode;
		this.location = location;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pinCode);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bakery other = (Bakery) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(pinCode) != Double.doubleToLongBits(other.pinCode))
			return false;
		return true;
	}
	
	
	

}
