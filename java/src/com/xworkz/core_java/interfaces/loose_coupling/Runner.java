package com.xworkz.core_java.interfaces.loose_coupling;

public class Runner {

	public static void main(String[] args) {
		
		Sony sony=new Sony();
		Cannon cannon=new Cannon();
		Hp hp=new Hp();
		Ricoh ricoh=new Ricoh();
		
		Computer computer=new Computer();
		
		computer.slot(cannon);
	}

}
