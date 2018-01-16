package com.vipin.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vipin.cir.Circle;

public class MainApp {

	public static void main(String s[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean-config.xml");
		
		Circle c = (Circle) context.getBean("circle");
		
		/*System.out.println(c);
		
		System.out.println(c.getCenter());*/
		
		//System.out.println(c.getCenter().getPoint());
		
		//System.out.println(c.getCenter().getPoint().toString());
	}
}