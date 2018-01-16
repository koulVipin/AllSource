package com.vipin.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vipin.point.Point;

public class Circle {
	
	@Autowired
	private Point point;
	
	
	public Circle (Point p) {
		this.point = p;
	}
	@Override
	public String toString() {
		return "Circle [point=" + point + "]";
	}
}