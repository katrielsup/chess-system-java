package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiecce extends Piece {

	private Color color;

	public ChessPiecce(Board board, Color color) {
		super(board); // Repassa chamada para super classe
		this.color = color;

	}

	public Color getColor() {
		return color;
	}

}
