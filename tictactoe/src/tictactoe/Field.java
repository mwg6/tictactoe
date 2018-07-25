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
	
	
}
