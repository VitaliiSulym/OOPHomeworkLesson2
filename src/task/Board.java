package task;

public class Board {

	private Shape board[] = new Shape[4];

	public Board(Shape[] board) {
		super();
		this.board = board;
	}

	public Board() {
		super();
	}

	public void addFigure(Shape shape, int i) {
		if (i >= 0 && i < board.length) {
			if (board[i] == null) {
				board[i] = shape;
			} else {
				System.out.println("There is a figure in this part of board");
			}
			} else {
			System.out.println("Oops, sorry, board has 4 parts only");
		}
	}

	public void removeFigure(int i) {
		if (i >= 0 && i < board.length) {
			if (board[i] != null) {
				board[i] = null;
			} else {
				System.out.println("There is no figure in this part of board");
			}
		}
	}

	public double getAreaSum() {
		double sum = 0;

		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
			sum += board[i].getArea();
		}
		}
		return sum;
		
	}

	public void getInfo() {
		System.out.println("Board:");
		for (int i = 0; i < board.length; i++) {
			if (board[i] != null) {
				System.out.println("Part" + i + ":" + board[i].toString());
			} else {
				System.out.println("Part" + i + ":There is no figure in this part of board");
			}

		}
	}

}
