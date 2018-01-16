package in.vevaan.simple.impl;

import com.specification.simple.SimpleTasks;

public class SimpleImpl implements SimpleTasks{

	@Override
	public void print(String arg0) {
		System.out.println("Hellow from the first implementation " + arg0);
		
	}
}
