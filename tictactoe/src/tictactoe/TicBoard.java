package tictactoe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TicBoard {

	static JTextField turn = new JTextField("X");
	
	public static void main(String[] args) {
		
		JFrame game = new JFrame("TicTacToe");
		
		JPanel gameBoard = new JPanel();
		
		JPanel buttons = new JPanel();
		
	
		
		game.setSize(400, 400);
		game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		game.setVisible(true);
		
		Field playZone = new Field(3);
		mechanics doneBut = new mechanics();
		
		doneBut.addDoneActionListener(new ActionListener(){
	    	  public void actionPerformed(ActionEvent e){
	    		 doneBut.checkRows(playZone.getField());
	    		 doneBut.checkColumns(playZone.getField());
	    		 doneBut.checkDiagonals(playZone.getField());
	    		 changeTurn();
	    	  }
	      });
		buttons.add(doneBut);
		turn.setEditable(false);
		buttons.add(turn);
		
		gameBoard.add(playZone.getArea());
		
		game.add(buttons, BorderLayout.PAGE_END);
		game.add(gameBoard, BorderLayout.PAGE_START);
		game.pack();
		
		
	}
	
	public static void changeTurn(){
		
		if(turn.getText().equals("X")){
			
			turn.setText("O");
		}
		else{
			turn.setText("X");
		}
	}
}
