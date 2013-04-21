package model;


public class King extends Piece {
	
	public static final int VALUE = 100_000;
	
	Color color;
	
	public King(Color c) {
		this.color = c;
	}
	
	public String toString() {
		return "K   ";
	}
}
