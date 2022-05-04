package com.adv;

class Sbranch{
	String name="TownCenter";
	
	public void names() {
		System.out.println (name);
	}
	
}

class  Abranch extends Sbranch{
	String name="Lansdown";
	public void names() {
		System.out.println (name);
	}
	
}


public class MainBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sbranch b = new Abranch();
		System.out.println (b.name);
		b.names();
		
		

	}

}
