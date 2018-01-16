package com.vipin.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExcepLearningProg1 {

	public static void main(String[] args) {
		
		if(true) {
			
			try {
				main(null);
			}
			catch(StackOverflowError sef) {
				System.out.println("In catch block");
				sef.printStackTrace();
			}
		}
		
		System.out.println("Am i here now?");
		
		Object o  = new Object();
		
		String s = new String();
		
		//s = (String)o;
		
		//s.length();
		
		PrintWriter pw;
		try {
			pw = new PrintWriter("test.txt");
			pw.println("hello");
			pw.close();
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new ArithmeticException();
		}
		finally {
			System.out.println();
			System.out.println("I will always be executed");
		}
	}
}