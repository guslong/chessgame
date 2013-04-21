package model;


public class Knight extends Piece {
	
	
	public static final int VALUE = 3;
	Color color;
	
	public Knight (Color col) {
		this.color = col;
	}
	
	public String toString() {
		return "N   ";
	}
}
