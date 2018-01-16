package com.vipin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vipin.point.Point;
import com.vipin.shapes.Circle;

@Configuration
@ComponentScan(basePackageClasses= {com.vipin.point.Point.class, com.vipin.shapes.Circle.class})
public class SpringConfig {
	
	@Bean
	Circle circleMehtodID() {
		return new Circle(pointMethodID());  // The dependency is taken care by calling the method??
	}
	
	@Bean
	Circle circleMehtodID1() {
		return new Circle(pointMethodID());  // The dependency is taken care by calling the method??
	}
	
	@Bean
	Point pointMethodID() {
		return new Point(200,300);
	}
}