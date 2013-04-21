package model;

public class WhitePlayer  {
	
	public Piece pawn1;
	public Piece pawn2;
	public Piece pawn3;
	public Piece pawn4;
	public Piece pawn5;
	public Piece pawn6;
	public Piece pawn7;
	public Piece pawn8;
	public Piece king;
	public Piece queen;
	public Piece rook1;
	public Piece rook2;
	public Piece knight1;
	public Piece knight2;
	public Piece bishop1;
	public Piece bishop2;
	
	public WhitePlayer() {
		initializePieces();
	}
	
	public void initializePieces() {
	 
		pawn1 = new Pawn(Color.WHITE);
		pawn2 = new Pawn(Color.WHITE);
		pawn3 = new Pawn(Color.WHITE);
		pawn4 = new Pawn(Color.WHITE);
		pawn5 = new Pawn(Color.WHITE);
		pawn6 = new Pawn(Color.WHITE);
		pawn7 = new Pawn(Color.WHITE);
		pawn8 = new Pawn(Color.WHITE);
			
		// make the other pieces
		king = new King(Color.WHITE);
		queen = new Queen(Color.WHITE);
		bishop1 = new Bishop(Color.WHITE);
		bishop2 = new Bishop(Color.WHITE);
		knight1 = new Knight(Color.WHITE);
		knight2 = new Knight(Color.WHITE);
		rook1 = new Rook(Color.WHITE);
		rook2 = new Rook(Color.WHITE);

		// initialise the white players positions
		
	}
	
}
