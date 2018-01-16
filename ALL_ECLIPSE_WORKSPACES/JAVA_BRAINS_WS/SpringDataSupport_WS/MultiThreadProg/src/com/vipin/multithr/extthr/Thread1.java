package com.vipin.multithr.extthr;

public class Thread1 extends Thread {
	
	@Override
	public void run() {
		System.out.println("I am child thread");
		System.out.println("My id is " + Thread.currentThread().getId());
		System.out.println("Inside child, thread, going to sleep for 10 seconds");
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Inside child, awoken after sleep");
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("Back to over-rided start() method");
	}
	
	public void run(int a) {
		System.out.println("Inside the run(int a) method");
		
	}
}