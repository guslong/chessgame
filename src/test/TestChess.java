package test;

import static org.junit.Assert.*;

import org.junit.Test;
import model.*;



public class TestChess {
		

	/*
	@Test
	public void	test_game_constructs_a_board_when_instantiated() {
		Game g = new Game();
		assertNotNull(g.getBoard());
		
	}
	
	@Test
	public void test_board_has_64_squares() {
		Game g = new Game();
		assertEquals(64,g.getBoard().getSquares().length);
	
	}

	@Test
	public void position_a1_is_0 () {
		Game g = new Game();
		assertEquals(0, Position.A1.ordinal());
	}
	
	
/*	@Test
	public void set_piece_on_square_A1() {
		Game g = new Game();
		Piece whiterook1 = new Piece();
		g.getBoard().getSquares()[0].setPiece(whiterook1);
		assertEquals(whiterook1, g.getBoard().getSquares()[0].getPiece());
	} */
	
	@Test
	public void virgin_game() {
		Game g = new Game();
	}
	

	@Test
	public void create_whiteplayer() {
		Game g = new Game();
		WhitePlayer whitePlayer = new WhitePlayer();

		
	}
	
	@Test
	public void createBoardandAddTwoPlayers() {
		WhitePlayer p1 = new WhitePlayer();
		BlackPlayer p2 = new BlackPlayer();
		Board b = new Board(p1, p2);
	}
	
	@Test
	public void getAPieceObject() {
		WhitePlayer p1 = new WhitePlayer();
		assertNotNull(p1.bishop1);
			
	}

	@Test
	public void getAPlayerObjectFromBoardClass() {
		Game g = new Game();
		assertNotNull(g.getBoard().blackPlayer);
		
	}
	
	@Test
	public void getAPieceFromBoardClass() {
		Game g = new Game();
		assertNotNull(g.getBoard().blackPlayer.bishop1);
	}
	
	

}
