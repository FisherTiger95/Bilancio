package bilancio.panel;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class TablePanel extends JPanel{
	
	public TablePanel(){
		
		init();
	}
	
	private void init(){
		this.setLayout(new GridLayout());
		
		//crea il modello di dati
		//TableModel dataModel = new VectorTableModel(v);
		//crea la tabella
		//JTable t = new JTable(dataModel);
		//aggiunge la tabella ad uno ScollPane
		//JScrollPane scrollpane = new JScrollPane(t);
		//aggiunge lo ScrollPane al pannello
		//add(scrollpane);
	}
}
