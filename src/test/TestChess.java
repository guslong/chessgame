package test;

import static org.junit.Assert.*;

import org.junit.Test;
import model.*;

public class TestChess {
		
	@Test
	public void test_new_board() {
		Board b = new Board();
		assertNotNull(b);
	}
	
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
	
/*	@Test
	public void square_A1_has_type_Rook () {
		// create a subclass of piece rook. make piece abstract (will break test above)
		Game g = new Game();
		Piece whiterook1 = new Rook();
		g.getBoard().getSquares()[0].setPiece(whiterook1);
		assertEquals(whiterook1, g.getBoard().getSquares()[0].getPiece());

	}
*/	
	
	@Test
	public void virgin_game() {
		Game g = new Game();
		g.printGameState();
		assertEquals("white rook on A1", "R   ", g.getBoard().getSquares()[0].getPiece().toString());
		assertEquals("black rook on H8", "R   ", g.getBoard().getSquares()[63].getPiece().toString());
		assertEquals("random pawn on b7", "p   ", g.getBoard().getSquares()[Position.B7.ordinal()].getPiece().toString());
	}
	
	@Test
	public void player_initialises_his_pieces() {
		Game g = new Game();
		g.printGameState();
	}
	
}
