package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	
	public ChessPiecce[][] getPieces(){
		ChessPiecce[][] mat = new ChessPiecce[board.getRows()][board.getColumns()];
	}
	
}
