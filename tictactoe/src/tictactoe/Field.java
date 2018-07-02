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
	
	JComboBox[] playField;
	
	int rowAndColumn;
	
	
	public Field(int size){
		
		rowAndColumn = size;
		
		//this area sets up a size*size grid of boxes for the play field held in a JPanel
		holdField.setLayout(new GridLayout(size,size));
		playField = new JComboBox[size*size];
		for(int i =0;i<size*size;i++){
			
			JComboBox<String> optionsList = new JComboBox<>(options);
			playField[i] = optionsList;
			holdField.add(playField[i]);
		}
		area.add(holdField);
		// end area
		
		//This area 
		JButton done = new JButton("Next Turn");
		done.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				//in here add code to check columns, rows, diagnols, before indicating whose turn it is
				System.out.println("I <3 u");
			}
		});
		area.add(done, BorderLayout.SOUTH);
	}
	
	public JPanel getArea(){
		
		return area;
	}
	
	public int countX(){
		int countOfX=0;
		String hold;
		
		for(JComboBox item:playField){
			hold = (String) item.getSelectedItem();
			if(hold.equals("X")){
				countOfX++;
			}
		}
		return countOfX;
	}
	
	public boolean checkRows(){
		
		boolean win = false;
		
		String[] checkArray= new String[rowAndColumn];
		//cycle through increments of rowAndcolumn size, checking the contents of each row
		//the loop below will select row to look at and then analyze whether there is a win
		for(int rowNum = 0; rowNum<rowAndColumn;rowNum++){
		
		//the loop below will go through the actual row indicated and add indicated row to checkArray
		for(int i =0;i<rowAndColumn;i++){
			
			checkArray[i] = (String) playField[i+(rowNum*rowAndColumn-1)].getSelectedItem();
		}
		
		//the for loop below will check the checkArray for a win condition
		for(int i = 0; i<rowAndColumn;i++){
			
		}
		}
		return win;
	}
}
