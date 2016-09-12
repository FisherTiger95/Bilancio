package bilancio.panel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
	
	private JButton add;
	private JButton remove;
	private JButton edit;
	private JButton print;
	private JButton exit;
	
	public ButtonPanel(){
		init();
	}
	
	private void init(){
		setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        
		
		add = new JButton("Add");
		remove = new JButton("Remove");
		edit = new JButton("Edit");
		print = new JButton("Print");
		exit = new JButton("Exit");
		
		//Aggiungo i vari listner
		//exit.addActionListener(new CloseListener());
		
		
		c.gridx = 0;
	    c.gridy = 0;
	    c.insets = new Insets(0, 10, 2, 10);
		add(add, c);
		
		c.gridx = 0;
	    c.gridy = 1;
	    c.insets = new Insets(2, 10, 2, 10);
		add(remove, c);
		
		c.gridx = 0;
	    c.gridy = 2;
	    c.insets = new Insets(2, 10, 2, 10);
		add(edit, c);
		
		c.gridx = 0;
	    c.gridy = 3;
	    c.insets = new Insets(2, 10, 2, 10);
	    add(print, c);
		
		c.gridx = 0;
	    c.gridy = 4;
	    c.insets = new Insets(2, 10, 4, 10);
		add(exit, c);
		
		setBackground(Color.orange);
	}


}
