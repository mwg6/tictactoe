package tictactoe;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class mechanics extends JPanel{

	JButton done = new JButton("Done");
	
	public mechanics(){
		add(done);
	}
	
	public void addDoneActionListener(ActionListener listener) {
	      done.addActionListener(listener);
	     
	   }
	public void checkRows(JComboBox[][] playField){
	
		int r = playField.length;
		int c = playField[0].length;
		int count = 0;
		
		
		//i is for row number
		for(int i = 0; i<r;i++){
			//o is for column number
			for(int o = 0; o<c;o++){
				if(playField[i][o].getSelectedItem() != ""){
					//will allow loop to keep performing if everything equals first index
					if(playField[i][o].getSelectedItem().equals(playField[i][0].getSelectedItem())){
						
						count++;
					}
					else{
						
						count=0;
					}
				}
				else{
					
					count=0;
				}
			}
			//handles cases where win is in middle/last row
			if(count == r){
				JOptionPane.showMessageDialog(null, playField[i][0].getSelectedItem() + " wins with a row!");
				break;
			}
			
		
		}
		
	}
	public void checkColumns(JComboBox[][] playField){
		
		int r = playField.length;
		int c = playField[0].length;
		int count = 0;
		
		
		//o is for row number
		for(int o = 0; o<c;o++){
			//i is for column number
			for(int i = 0; i<r;i++){
				if(playField[i][o].getSelectedItem() != ""){
					//will allow loop to keep performing if everything equals first index
					if(playField[i][o].getSelectedItem().equals(playField[0][o].getSelectedItem())){
						
						count++;
					}
					else{
						
						count=0;
					}
				}
				else{
				
					count=0;
				}
			}
			//handles cases where win is in middle/last column
			if(count == r){
				
				JOptionPane.showMessageDialog(null, playField[0][o].getSelectedItem() + " wins with a column!");
				break;
			}
	
		
		}

	}
	public void checkDiagonals(JComboBox[][] playField){
	
		int r = playField.length;
		int c = playField[0].length;
		int count =0;
		int revCount = 0;
		
		for(int o = 0; o<c;o++){
				//checks (0,0),(1,1),(2,2) diagonal on traditional Tictac toe board
				if(playField[o][o].getSelectedItem().equals(playField[0][0].getSelectedItem())){
					
					count++;
				}
				else{
					
					o=c;
										
					}
				}
		
	//checks the reverse diagonal of (2,0) (1,1) (0,2) in a traditional tic tac toe game
		for (int o= 0;o<c;o++){
			
			//protects from an all blank win
			if(playField[r-(1+o)][o].getSelectedItem() != ""){
			if (playField[r-(1+o)][o].getSelectedItem().equals(playField[r-1][0].getSelectedItem())){
				
				revCount++;
			}
			else{
				
				break;	
				
				}
			
		}
		}
		if(count == r){
			JOptionPane.showMessageDialog(null, playField[0][0].getSelectedItem() + " has a forward diagonal");
			
		}
		else if (revCount == r){
			
			JOptionPane.showMessageDialog(null, playField[r-1][0].getSelectedItem() + " has a reverse diagonal");
			
		}
	
	}
}
