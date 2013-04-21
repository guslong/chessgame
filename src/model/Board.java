package model;

public class Board {

	public static final int NUM_SQUARES = 64;
	Square[] squares = new Square[NUM_SQUARES];

	public Player whitePlayer;
	public Player blackPlayer;
	
	public Board (Player white, Player black) {
		setUpBoard();
		this.whitePlayer = white;
		this.blackPlayer = black;

	}

	// initialise the chessboard with 64 squares
	// v1: does not add pieces in their default positions yet
	public void setUpBoard() {
		for (int i = 0; i < squares.length; i++) {
			squares[i] = new Square();
			
			// give each square its color starting at A1 which is black
			if (i % 2 == 0) {
				squares[i].setColor(Color.BLACK);
			} else {
				squares[i].setColor(Color.WHITE);
			}
		}
	}

	

	public Square[] getSquares() {
		return squares;
	}

	public void setSquares(Square[] squares) {
		this.squares = squares;
	}

}
