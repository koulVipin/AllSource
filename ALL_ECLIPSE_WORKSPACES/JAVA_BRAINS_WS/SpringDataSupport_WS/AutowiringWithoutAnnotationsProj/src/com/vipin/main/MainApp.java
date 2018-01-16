package com.vipin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vipin.shapes.impl.CircleShape;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		CircleShape circleShape = (CircleShape) ctx.getBean("circleShapeBean");
		
		System.out.println(circleShape.getPointOfCircle().toString());
		
		System.out.println(circleShape.getA().toString());
		
		System.out.println(circleShape.getB().toString());
	}
}