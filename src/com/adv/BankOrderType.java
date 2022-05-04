package com.adv;

enum BankOrderType {
	/*An Enum is a group of predefined named constants.
Enum is used when we know all possible values of the group before compiling the code.
Enum have instance variables, instance methods, and constructors.
Enum declarations are full classes, and the values listed are constant names referring to separate instances of these classes. The enum declaration can contain fields, constructors, and methods, just like other classes.
Enum declarations are classes, and enum values refer to objects.
For every declared enum value, an instance of the class is created and assigned to that value.
No other instances of this class can be created later.
Every different enum value will refer to a different object, and the same value will always refer to the same object; this cannot be changed.
Enums create their own namespace, so different enum classes may use the same value, but these are kept separate. If, for example, I have an enum class BoardGames, the enum values BoardGames.GO and CommandWords.GO are separate and do not interfere with each other.
	 *  */
	ORDERED("An order is being given"),
	SAVED("An order is saved"),
	PAID("An order is paid"),
	CANCELLED("An order is cancelled"),
	INPROGRESS("An order is in progress"),
	CHECKEDOUT("An order is checkedout"),
	ISSUES("An order is under issues");
	
	private String msg;

	BankOrderType(String msg){
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg=msg;
	}
	
	 public String toString ()
	   {
	return msg;
	   }

}
