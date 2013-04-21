package model;

public class Rook extends Piece {
	
	Color color;
	
	public static final int VALUE = 5;
	
	public Rook (Color col) {
		this.color = col;
	}
	
	public String toString() {
		return "R   ";
	}
}
