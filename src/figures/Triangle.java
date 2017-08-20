package figures;

import task.Point;
import task.Shape;

public class Triangle extends Shape {

	private Point point1;
	private Point point2;
	private Point point3;

	private double a;
	private double b;
	private double c;

	public Triangle(Point point1, Point point2, Point point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
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

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public void calculateTriangleSides() {
		a = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
		b = Math.sqrt(Math.pow(point3.getX() - point2.getX(), 2) + Math.pow(point3.getY() - point2.getY(), 2));
		c = Math.sqrt(Math.pow(point3.getX() - point1.getX(), 2) + Math.pow(point3.getY() - point1.getY(), 2));
	}

	@Override
	public double getPerimetr() {
		this.calculateTriangleSides();
		if (a + b > c && a + c > b && b + c > a) {
			return a + b + c;
		} else {
			System.out.println("This triangle does not exist");
			return 0.0;
		}

	}

	@Override
	public double getArea() {
		this.calculateTriangleSides();
		double p = getPerimetr() / 2;
		double area = p * (p - a) * (p - b) * (p - c);
		return Math.sqrt(area);
	}

	@Override
	public String toString() {
		return "Triangle [point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + ", Perimetr="
				+ getPerimetr() + ", Area=" + getArea() + "]";
	}

	
	}

