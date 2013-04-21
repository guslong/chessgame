package model;

public enum Color {
	
WHITE, BLACK;

	public String toString() {
		
		switch (this) {
		case WHITE:
			return "white";
		default:
			return "black";
		}
	}

}
