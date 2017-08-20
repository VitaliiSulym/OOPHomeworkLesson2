package figures;

import task.Point;
import task.Shape;

public class Square extends Shape {
	
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	
	private double a;
	private double b;
	private double c;
	private double d;
	
	
	public Square(Point point1, Point point2, Point point3, Point point4) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
	}
	
	public Square() {
		super();
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



	public Point getPoint4() {
		return point4;
	}



	public void setPoint4(Point point4) {
		this.point4 = point4;
	}

	public void calculateSquareSides() {
		a = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
		b = Math.sqrt(Math.pow(point3.getX() - point2.getX(), 2) + Math.pow(point3.getY() - point2.getY(), 2));
		c = Math.sqrt(Math.pow(point4.getX() - point3.getX(), 2) + Math.pow(point4.getY() - point3.getY(), 2));
		d = Math.sqrt(Math.pow(point4.getX() - point1.getX(), 2) + Math.pow(point4.getY() - point1.getY(), 2));
	}

	@Override
	public double getPerimetr() {
		calculateSquareSides();
		return a+b+c+d;
	}

	@Override
	public double getArea() {
		calculateSquareSides();
		return a*b;
	}

	@Override
	public String toString() {
		return "Square [point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + ", point4=" + point4
				+ ", Perimetr=" + getPerimetr() + ", Area=" + getArea() + "]";
	}

	

}
