package com.example.main;

public class MainApp {

	public static void main(String[] args) {
		
		ListOfDays lods[] = ListOfDays.values();
		
		for(ListOfDays lod :lods) {
			System.out.println(lod);
			
			System.out.println(lod.ordinal());
		}
	}
}