package com.vipin.exception;

import java.io.FileNotFoundException;

public class ChainedExceptionsDemo {
	
	static {
		System.out.println("This is static block..");
	}

	public static void main(String s[]) throws Exception {
		
		System.out.println("In main...");
		int a = 1;
		
		try {
			if (a==0) {
				throw new ArithmeticException();
			}
			else {
				throw new FileNotFoundException();
			}
		}
		catch (ArithmeticException ae) {
			throw new Exception(ae);
		}
		catch (FileNotFoundException fe) {
			throw new Exception(fe);
		}
	}
}