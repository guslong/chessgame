package model;

import java.util.ArrayList;

public class WhitePlayer extends Player {
		
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
