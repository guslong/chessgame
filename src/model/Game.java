package model;

public class Game {

	Board board;

	public Game () {
		
		// initializes the board and creates two players
		setBoard(new Board(new WhitePlayer(), new BlackPlayer()));
		
	}
	
		// loops through the array of squares and prints the piece that is on that square
			// does not yet show the color of the piece
	public void printGameState() {

		
		System.out.println("----------- game state ---------\n");
		System.out.println("   a   b   c   d   e   f   g   h");

		for (int i = 63; i > 0; i -= 8) {
			System.out.print(((i / 8) + 1) + "  ");
			for (int j = 7; j >= 0; j--) {
				if (board.getSquares()[i - j].hasPiece()) {
					System.out.print(board.getSquares()[i - j].getPiece().toString());
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}

	}
	
	// getters and setters
	
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

}
