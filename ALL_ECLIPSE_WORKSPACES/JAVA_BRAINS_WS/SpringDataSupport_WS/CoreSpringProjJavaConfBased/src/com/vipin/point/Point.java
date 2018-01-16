package com.vipin.point;

public class Point {

	int x, y;

	public Point() {
		x=100;
		y=200;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}