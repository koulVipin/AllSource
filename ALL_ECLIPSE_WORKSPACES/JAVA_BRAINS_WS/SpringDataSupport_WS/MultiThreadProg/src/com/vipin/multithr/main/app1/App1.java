package com.vipin.multithr.main.app1;

import com.vipin.multithr.extthr.Thread1;

public class App1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread1 t1 = new Thread1();
		System.out.println("Inside the main thread, starting child thread");
		t1.start();
		
		Thread t = new Thread();
		t.start();
		
		//System.out.println("Inside the main thread, my id is " + Thread.currentThread().getId());
		
		return;
		
	}
}