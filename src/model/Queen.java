package model;


public class Queen extends Piece {
	
	
	public static final int VALUE = 9;
	Color color;
	
	public Queen(Color c) {
		this.color = c;
	}
	
	public String toString() {
		return "Q   ";
	}
}
