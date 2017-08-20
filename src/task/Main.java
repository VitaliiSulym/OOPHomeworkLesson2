package task;

import figures.Circle;
import figures.Square;
import figures.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Board board = new Board ();
		
		 Triangle triangle = new Triangle(new Point(0, 0), new Point(5, 0), new Point(5, 5));
		 Square sq = new Square(new Point(0,0), new Point(3,0), new Point(3,3), new Point (0,3));
		 Circle circle = new Circle(new Point (0,0), new Point(4,0));
		 
		 board.addFigure(triangle, 0);
		 board.addFigure(sq, 1);
		 board.addFigure(circle, 2);
		 
		 
		 board.getInfo();
		 System.out.println();
		 System.out.println("Total sum of all of the figure`s area: " +board.getAreaSum());
		 System.out.println();
		 
		 board.removeFigure(0);
		 board.removeFigure(1);
		 board.removeFigure(2);
		
		 board.getInfo();
		 System.out.println();
		 System.out.println("Total sum of all of the figure`s area: " +board.getAreaSum());
	
		 

	 
	}

		
	}

