package model;

public class Bishop extends Piece {

	public static final int VALUE = 3;

	Color color;


	public Bishop(Color col) {
		this.color = col;
	}

	public String toString() {
		return "B   ";
	}
}
