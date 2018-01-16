package com.vipin.shapes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vipin.point.Point;

@Component("circleID")
public class Circle {
	
	//@Resource(name="pointID")
	@Autowired
	private Point point;
	
	@Override
	public String toString() {
		return "Circle [point=" + point + "]";
	}
}