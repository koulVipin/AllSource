package com.vipin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vipin.shapes.Circle;

public class MainXMLConfig {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("config/spring-config.xml");
		
		Circle circle = (Circle) appContext.getBean("circleId");
		
		System.out.println(circle.toString());
	}
}