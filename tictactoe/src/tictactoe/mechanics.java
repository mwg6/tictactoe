package tictactoe;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
		boolean win = true;
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
						System.out.println(playField[i][o].getSelectedItem() + " compared to row reference " + playField[i][0].getSelectedItem());
						count++;
					}
					else{
						win = false;
						count=0;
					}
				}
				else{
					win=false;
					count=0;
				}
			}
			//handles cases where win is in middle/last row
			if(count == r){
				win = true;
				System.out.println(win);
				break;
			}
			else
			System.out.println(win);
		}
		System.out.println("END OF TEST");
	}
	public void checkColumns(JComboBox[][] playField){
		boolean win = true;
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
						System.out.println(playField[i][o].getSelectedItem() + " compared to column reference " + playField[0][o].getSelectedItem());
						count++;
					}
					else{
						win = false;
						count=0;
					}
				}
				else{
					win=false;
					count=0;
				}
			}
			//handles cases where win is in middle/last column
			if(count == r){
				win = true;
				System.out.println(win);
				break;
			}
			else
			System.out.println(win);
		}
		System.out.println("END OF TEST");
	}
	public void checkDiagonals(JComboBox[][] playField){
		boolean win = true;
		int r = playField.length;
		int c = playField[0].length;
		int count =0;
		int revCount = 0;
		
		for(int o = 0; o<c;o++){
				//checks (0,0),(1,1),(2,2) diagonal on traditional Tictac toe board
				if(playField[o][o].getSelectedItem().equals(playField[0][0].getSelectedItem())){
					
					System.out.println(playField[o][o].getSelectedItem() + " compared to diagonal reference " + playField[0][0].getSelectedItem());
					count++;
				}
				else{
					System.out.println("isn't diagonal");
					o=c;
										
					}
				}
		
	//checks the reverse diagonal of (2,0) (1,1) (0,2) in a traditional tic tac toe game
		for (int o= 0;o<c;o++){
			
			//protects from an all blank win
			if(playField[r-(1+o)][o].getSelectedItem() != ""){
			if (playField[r-(1+o)][o].getSelectedItem().equals(playField[r-1][0].getSelectedItem())){
				
				System.out.println(playField[r-(1+o)][o].getSelectedItem() + " compared to reverse diagonal reference " + playField[r-1][0].getSelectedItem());
				revCount++;
			}
			else{
				
				System.out.println("isn't diagonal");
				break;	
				
				}
			
		}
		}
		if(count == r){
			
			System.out.println("Forward Diagonal Win");
		}
		else if (revCount == r){
			
			System.out.println("Reverse Diagonal Win");
		}
	
	}
}
