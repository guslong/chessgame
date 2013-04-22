package model;

public class Board {

	public WhitePlayer whitePlayer;
	public BlackPlayer blackPlayer;

	// squares
	public static final int A1 = 0;
	public static final int B1 = 1;
	public static final int C1 = 2;
	public static final int D1 = 3;
	public static final int E1 = 4;
	public static final int F1 = 5;
	public static final int G1 = 6;
	public static final int H1 = 7;

	
	public Board (WhitePlayer white, BlackPlayer black) {
		this.whitePlayer = white;
		this.blackPlayer = black;

	}
	
	
	
	

}
