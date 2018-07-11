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
		System.out.println("Whoot");
	}
}
