package com.vipin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vipin.config.SpringConfig;
import com.vipin.shapes.Circle;

public class AppEntryPoint {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Circle circle = context.getBean(Circle.class);
		System.out.println(circle.toString());
		
	}
}