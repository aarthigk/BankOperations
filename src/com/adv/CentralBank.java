package com.adv;

public interface CentralBank {
	
	default void underCentral() {
		System.out.println("Banks are abiding the federal and global laws");
	}
	
	default void messageBoard() {
		System.out.println("Banks should follow GDPR rules");
	}
	
	

}
