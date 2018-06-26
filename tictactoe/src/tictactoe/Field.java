package tictactoe;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Field {

	JPanel area = new JPanel();
	
	String[] options = new String[] {"","X","O"};
	
	JComboBox[] playField;
	
	
	public Field(int size){
		
		area.setLayout(new GridLayout(size,size));
		playField = new JComboBox[size*size];
		for(int i =0;i<size*size;i++){
			
			JComboBox<String> optionsList = new JComboBox<>(options);
			playField[i] = optionsList;
			area.add(playField[i]);
		}
		
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
	
}
