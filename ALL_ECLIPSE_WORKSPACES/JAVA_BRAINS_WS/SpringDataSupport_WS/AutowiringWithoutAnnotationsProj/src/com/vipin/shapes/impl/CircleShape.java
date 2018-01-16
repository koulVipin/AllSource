package com.vipin.shapes.impl;

import com.vipin.point.Point;
import com.vipin.shapes.GenericShapes;

public class CircleShape implements GenericShapes {

	private Point pointOfCircle;
	
	private Point A;
	private Point B;
	
		
	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public Point getPointOfCircle() {
		return pointOfCircle;
	}

	public void setPointOfCircle(Point pointOfCircle) {
		System.out.println("Point's setter called");
		this.pointOfCircle = pointOfCircle;
	}

	@Override
	public void printShape() {
		System.out.println("CicleShape printed");
	}
}