package com.vipin.exception;

public class FinalConcepts {
	
	public FinalConcepts() {
		super();
	}
	public static void main(String s[]) {
		Test t = new Test(100);
		
		t.print();	
	}
}

class Test {
	
	public Test() {
		a = 10;
	}
	
	public Test(int a) {
		this.a = a;
	}
	final int a;
	
	public void print() {
		System.out.println("Value of a is " + a);
	}
}