package bilancio.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JFrame;

import bilancio.panel.ButtonPanel;
import bilancio.panel.SearchPanel;
import bilancio.panel.TablePanel;

public class BFrame extends JFrame{

	public BFrame(){
		this("");
	}
		
	public BFrame(String titolo){
		super(titolo);
		//setBounds(200,100, 300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		init();
		
		pack();
	}
	private void init(){
		//Inizializzo il menu
		initMenu();
		
		//imposto il layout "GridBagLayout"
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        
        //inserisco il pannello della data
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 0;
        //getContentPane().add(new DataPanel(), c);
        
        //inserisco il pannello della tabella
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        getContentPane().add(new TablePanel(), c);
        
        //inserisco il pannello della ricerca
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.NONE;
        getContentPane().add(new SearchPanel(), c);
        
        //inserisco il pannello dei bottoni
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0;
        c.weighty = 1;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.PAGE_END;
        getContentPane().add(new ButtonPanel(), c);
	}
	
	private void initMenu(){
		//TODO Non so se lasciare qui questa roba del menu o sposto.
		MenuItem open = new MenuItem("Open");
		MenuItem save = new MenuItem("Save");
		MenuItem csv = new MenuItem("CSV");
		MenuItem txt = new MenuItem("TXT");
		MenuItem excel = new MenuItem("EXCEL");
		MenuItem print = new MenuItem("Print");
		MenuItem exit = new MenuItem("Exit");
		MenuItem about = new MenuItem("About");
		
		Menu file = new Menu("File");
		file.add(open);
		file.add(save);
		file.add(print);
		file.add(exit);
		
		Menu export = new Menu("Export");
		export.add(csv);
		export.add(txt);
		export.add(excel);
		
		Menu info = new Menu("?");
		info.add(about);
		
		MenuBar mb = new MenuBar();
		mb.add(file);
		mb.add(export);
		mb.add(info);
		
		this.setMenuBar(mb);
		
		//Qui addo i vari listner
		//exit.addActionListener(new CloseListener());
		//save.addActionListener(new SaveListener());
	}
}
