package com.vipin.point;

public class Point {

	int x, y;

	public Point() {
		
	}
	
	public Point(int xx, int yy) {
		this.x = xx;
		this.y = yy;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}