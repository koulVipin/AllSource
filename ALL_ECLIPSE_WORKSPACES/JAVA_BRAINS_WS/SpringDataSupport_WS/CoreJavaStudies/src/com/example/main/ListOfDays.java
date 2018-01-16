package com.example.main;

public enum ListOfDays {
	
	MONDAY(10), TUESDAY(20), WEDNESDAY(30), THURSDAY(40), FRIDAY(50), SATURDAY(60), SUNDAY(70);
	
	private int valueSet;
	
	private ListOfDays(int valueSet) {
		System.out.println("Constructor invoked");
		this.valueSet = valueSet;	
	}
}