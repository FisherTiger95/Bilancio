package bilancio.panel;

import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import bilancio.data.Transaction;
import bilancio.data.VectorTableModel;

public class TablePanel extends JPanel{
	
	public TablePanel(){
		
		init();
	}
	
	private void init(){
		this.setLayout(new GridLayout());
		
		Vector<Transaction> v = new Vector<Transaction>(3);
		
		//crea il modello di dati
		TableModel dataModel = new VectorTableModel(v);
		//crea la tabella
		JTable t = new JTable(dataModel);
		//aggiunge la tabella ad uno ScollPane
		JScrollPane scrollpane = new JScrollPane(t);
		//aggiunge lo ScrollPane al pannello
		add(scrollpane);
	}
}
