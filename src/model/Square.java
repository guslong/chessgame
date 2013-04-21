package model;

public class Square {

	private Piece piece;
	private Color color;
	
	// returns true is there is a piece on the square
	
	public boolean hasPiece() {
		if (this.piece != null) {
			return true;
		}
		return false;
	}
	
	
	// getters and setters
	
	public Piece getPiece() {
		return piece;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

	
}
