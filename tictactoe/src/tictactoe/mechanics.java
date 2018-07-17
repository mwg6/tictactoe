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
		
		for(int i = 0;i<r;i++){
			for(int o = 0; i<c;i++){
				//checks (0,0),(1,1),(2,2) diagonal on traditional Tictac toe board
				if(playField[i][o].getSelectedItem().equals(playField[0][0].getSelectedItem())){
					
					System.out.println(playField[i][o].getSelectedItem() + " compared to column reference " + playField[0][0].getSelectedItem());
					count++;
				}
			}
		}
	}
}
