package com.vipin.specification.impl;

public class SpecificationImpl implements com.sample.specification.SampleSpecificationInterface {

	@Override
	public int add(int a, int b) {
		return (a+b);
	}

	@Override
	public int sub(int a, int b) {
		return (a-b);
	}
}