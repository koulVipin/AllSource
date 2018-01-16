package com.vipin.soap.impl;

import javax.jws.WebService;
import com.vipin.soap.HelloWorld;

@WebService(endpointInterface = "com.vipin.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World as String " + name;
	}
}