package com.vipin.exception;

public class FinalizeProg {

	public static void main(String s[]) throws InterruptedException {

		FinalizeProg f = new FinalizeProg();
		f.print();
		
		//PrintWriter pw = new PrintWriter("test.txt");
		
		//Thread.sleep(10000);
		
		//System.out.println(10/0);
		
		float A = (float) 0.6;
		
		int key = 101;
		
		System.out.println("Value is " + (float) (key*A)%1);
		
		System.out.println("value is  " +(0.6) %1);
		
		f.printMe();
		
		int a = 0;
		
		if(a==0) {
			try {
				throw new MyException1();
			} catch (MyException1 e) {
				e.printStackTrace();
			}
		}
		throw new MyException();		
	}
	
	public void print() {
		System.out.println("Test");
	}
	
	public void printMe() throws InterruptedException {
	//public void printMe() {
		//try {
		
			throw new InterruptedException();
		//}
		
		//catch (Exception e) {
			
		//}
	}
}

class MyException extends RuntimeException {

	private static final long serialVersionUID = 1L;
}

class MyException1 extends Exception {

	private static final long serialVersionUID = 1L;	
}