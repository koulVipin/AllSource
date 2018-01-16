package com.vipin.shapes;

import com.vipin.point.Point;

public class Circle {
	
	private Point point;
	
	public Circle() {
		
	}

	public Circle (Point pointConArg) {
		this.point = pointConArg;
	}
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point pointSetterArg) {
		this.point = pointSetterArg;
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + "]";
	}
}