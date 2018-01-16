package com.gontuseries.util;

//@Component(value="simpleUtilImpl")
public class SimpleUtilImpl implements SimpleUtil {

	@Override
	public void add(int a, int b) {
		System.out.println("The sum is --> " + (a+b));
	}
}