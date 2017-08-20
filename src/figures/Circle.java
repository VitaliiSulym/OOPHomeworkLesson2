package figures;

import task.Point;
import task.Shape;

public class Circle extends Shape {
	
	private Point point1;
	private Point point2;
	
	private double rad;
	
	public Circle(Point point1, Point point2) {
		super();
		this.point1 = point1;
		this.point2 = point2;
	}
	
	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public double calculateRadius() {
		rad = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
	return rad;
	}

	@Override
	public double getPerimetr() {
		calculateRadius();
		return 2*Math.PI*rad;
	}

	@Override
	public double getArea() {
		calculateRadius();
		return Math.PI*rad*rad;
	}

	@Override
	public String toString() {
		return "Circle [point1=" + point1 + ", point2=" + point2 + ", Radius=" + calculateRadius()
				+ ", Perimetr=" + getPerimetr() + ", Area=" + getArea() + "]";
	}

	
}
