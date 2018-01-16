package com.vipin.apps;

import java.util.Stack;

import com.vipin.ds.BasicStack;

public class BasicStackMainApp {

	public static void main(String[] args) {
		
		BasicStack<Integer> bsi = new BasicStack<Integer>();
		
		Stack<String> s = new Stack<>();
		
		bsi.push(1);
		bsi.push(2);
		bsi.push(3);
		bsi.push(4);
		bsi.push(5);
		
		bsi.pop();
		bsi.pop();
		bsi.pop();
		
		
		BasicStack<String> bss = new BasicStack<String>();
		bss.push("first");
		bss.push("two");
		bss.push("three");
		
		bss.pop();
		bss.pop();
		bss.pop();
		
	}

}
