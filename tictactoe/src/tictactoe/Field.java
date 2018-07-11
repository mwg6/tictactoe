package tictactoe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;

public class Field {

	JPanel area = new JPanel();
	
	String[] options = new String[] {"","X","O"};
	
	JPanel holdField = new JPanel();
	
	JComboBox[][] playField;
	
	int rowAndColumn;
	
	JButton done = new JButton("Next Turn");
	
	public Field(int size){
		
		rowAndColumn = size;
		
		//this area sets up a size*size grid of boxes for the play field held in a JPanel
		holdField.setLayout(new GridLayout(size,size));
		playField = new JComboBox[size][size];
		//outer loop will cycle through [i][], inner through [][u]
		for(int i =0;i<size;i++){
			
			for(int u=0;u<size;u++){
				
			JComboBox<String> optionsList = new JComboBox<>(options);
			playField[i][u] = optionsList;
			holdField.add(playField[i][u]);
			}
		}
		area.add(holdField);
		// end area
		
		//This area 
		
		
		
	}
	
	
	public JPanel getArea(){
		
		return area;
	}
	
	public JComboBox[][] getField(){
		return playField;
	}
	
	public boolean checkRows(){
		
		boolean win = false;
		
		String[] rowHolder = new String[rowAndColumn];
		//cycle through increments of rowAndcolumn size, checking the contents of each row
		//the loop below will select row to look at and then analyze whether there is a win
		for(int rowNum = 0; rowNum<rowAndColumn;rowNum++){
		
		//the loop below will go through the actual row indicated and add indicated row to checkArray
		for(int i =0;i<rowAndColumn;i++){
			
			rowHolder[i] = String.valueOf(playField[rowNum][i].getSelectedItem());
		}
		
		//the for loop below will check the checkArray for a win condition
		for(int i = 0; i<rowAndColumn;i++){
			
		}
		}
		return win;
	}
}
