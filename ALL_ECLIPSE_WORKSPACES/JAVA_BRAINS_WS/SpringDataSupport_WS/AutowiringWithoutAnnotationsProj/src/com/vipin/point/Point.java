package com.vipin.point;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		System.out.println("Point's default consturctor called");
		this.x = 10;
		this.y = 20;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	void print() {
		System.out.println("Inside point");
	}
}
