package model;


public class Pawn extends Piece {
	
	public static final int VALUE = 1;
	private Color color;
	
	
		
	public Pawn (Color c) {
		this.color = c;
	}
	public String toString() {
		return "p   ";
	}
	


}
