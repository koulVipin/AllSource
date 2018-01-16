package com.vipin.ds;

import java.lang.reflect.Array;

public class BasicStack<T> {

	private T[] array;
	private int stackpointer = -1;
	
	public BasicStack() {
		array = (T[])new Object[5];  // How to make this Generic??
	}
	
	public T pop() {
		
		T t;
		
		t = array[stackpointer];
		stackpointer--;
		return t;
	}
	
	public void push(T t) {
		
		stackpointer++;
		array[stackpointer] = t;	
	}
	
}