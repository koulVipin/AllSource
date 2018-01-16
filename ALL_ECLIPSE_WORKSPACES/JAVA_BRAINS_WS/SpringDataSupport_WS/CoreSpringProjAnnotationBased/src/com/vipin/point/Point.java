package com.vipin.point;

import org.springframework.stereotype.Component;

//@Component("pointID")
@Component
public class Point {

	int x, y;

	public Point() {
		x=10;
		y=20;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}