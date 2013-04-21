package model;

public class BlackPlayer {
	
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
	
	
public BlackPlayer() {
	initializePieces();
}

public void initializePieces() {
 
	pawn1 = new Pawn(Color.BLACK);
	pawn2 = new Pawn(Color.BLACK);
	pawn3 = new Pawn(Color.BLACK);
	pawn4 = new Pawn(Color.BLACK);
	pawn5 = new Pawn(Color.BLACK);
	pawn6 = new Pawn(Color.BLACK);
	pawn7 = new Pawn(Color.BLACK);
	pawn8 = new Pawn(Color.BLACK);
		
	// make the other pieces
	king = new King(Color.BLACK);
	queen = new Queen(Color.BLACK);
	bishop1 = new Bishop(Color.BLACK);
	bishop2 = new Bishop(Color.BLACK);
	knight1 = new Knight(Color.BLACK);
	knight2 = new Knight(Color.BLACK);
	rook1 = new Rook(Color.BLACK);
	rook2 = new Rook(Color.BLACK);

	// initialise the BLACK players positions
	
}
	

}
