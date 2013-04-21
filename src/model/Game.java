package model;

public class Game {

	Board board;
	public Player whitePlayer;
	public Player blackPlayer;
	
	
	// default constructor initialises a new Board and players and initialises the pieces
	public Game () {
		setBoard(new Board());
		whitePlayer = new WhitePlayer();
		blackPlayer = new BlackPlayer();
		
		// instead of initailizePieces(), we need some kind of game loop which constantly redraws and gets input
		
	initializePieces();
	}
	
	// remove all this up to line 47 - we should be putting the responsibility for managing
	// the pieces with the Player objects
	
	private void initializePieces() {
		// WHITE
		board.getSquares()[0].setPiece(new Rook(Color.WHITE));
		board.getSquares()[1].setPiece(new Knight(Color.WHITE));
		board.getSquares()[2].setPiece(new Bishop(Color.WHITE));
		board.getSquares()[3].setPiece(new Queen(Color.WHITE));
		board.getSquares()[4].setPiece(new King(Color.WHITE));
		board.getSquares()[5].setPiece(new Bishop(Color.WHITE));
		board.getSquares()[6].setPiece(new Knight(Color.WHITE));
		board.getSquares()[7].setPiece(new Rook(Color.WHITE));

		for (int i = 8; i < 16; i++) {
			board.getSquares()[i].setPiece(new Pawn(Color.WHITE));
		}
		
		// BLACK
		board.getSquares()[56].setPiece(new Rook(Color.BLACK));
		board.getSquares()[57].setPiece(new Knight(Color.BLACK));
		board.getSquares()[58].setPiece(new Bishop(Color.BLACK));
		board.getSquares()[59].setPiece(new Queen(Color.BLACK));
		board.getSquares()[60].setPiece(new King(Color.BLACK));
		board.getSquares()[61].setPiece(new Bishop(Color.BLACK));
		board.getSquares()[62].setPiece(new Knight(Color.BLACK));
		board.getSquares()[63].setPiece(new Rook(Color.BLACK));

		for (int i = 48; i < 56; i++) {
			board.getSquares()[i].setPiece(new Pawn(Color.BLACK));
		}
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
