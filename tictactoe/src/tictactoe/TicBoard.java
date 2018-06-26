package tictactoe;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TicBoard {

	public static void main(String[] args) {
		
		JFrame game = new JFrame("TicTacToe");
		game.setSize(400, 400);
		game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		game.setVisible(true);
		
		Field playZone = new Field(3);
		game.add(playZone.getArea());
		game.pack();
	}

}
