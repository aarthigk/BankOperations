package com.adv;

import java.lang.reflect.Constructor;
import java.util.HashMap;

// java.lang.Class.getConstructors();

public class BankConstructorDetails {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class itsobject = Bank.class;
		
		Constructor[] cons =itsobject.getConstructors();
	    String str = cons[0].toString();
	    String str1 = cons[1].toString();
	    String str2 = cons[1].toString();
	    

	    System.out.println("Banks constructor : " + str +" "+str1+ " " + str2);
	  
	    
	    Class stringObj = HashMap.class;
	    
	    Constructor[] a =stringObj.getConstructors();
	    
	    for (int i=0;i<a.length;i++) {
	    
	    	String as = a[i].toString();
	    	 System.out.println(as);
	}

}
}