package bilancio.panel;

import java.awt.Color;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SearchPanel extends JPanel{
	private JTextField text;
	private JButton b;
	
	public SearchPanel(){
		init();
	}
	
	private void init(){
		text = new JTextField(10);
		
		//TODO Sistema che mi sembra una porcata
		b = new JButton();
		ImageIcon icon = new ImageIcon("resources/search_icon.png");
		Image img = icon.getImage() ;  
		Image newimg = img.getScaledInstance( 25, 25,  java.awt.Image.SCALE_SMOOTH );  
		icon = new ImageIcon(newimg);
		b.setIcon(icon);
		b.setMargin(new Insets(0, 0, 0, 0));

		
		add(text);
		add(b);
		
		setBackground(Color.red);
	}
}
