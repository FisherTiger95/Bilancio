package bilancio.data;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import bilancio.data.Transaction.TypeOfTransaction;

public class VectorTableModel  extends AbstractTableModel{

	//TODO: modifica questo file per cambiare i tipi di ritorno della tabella
		//TODO: vedi se in questo file è meglio usare i generics, secondo me si ma ad oggi non li so usare
		
		private static final long serialVersionUID = 1;

		private Vector<Transaction> v = null;
		private String[] COL_NAME = {"Date", "Description", "Amout", "Type"};

		public VectorTableModel(Vector<Transaction> v) {
			this.v = v;
		}
		
		public int getColumnCount() { return COL_NAME.length; }
		
		public int getRowCount() { return v.size(); } 
		
		public Object getValueAt(int row, int col) {
			//seleziona la translazione
			Transaction t = (Transaction)v.elementAt(row);
			// la stringa corrispondente alla colonna
			switch(col){
				case 0: return t.getDate();
				case 1: return t.getDescription();
				case 2: return t.getAmount();
				case 3: return t.getTypeOfTransaction();
				default: return "";
			}
		}
		
		public String getColumnName(int col) { return COL_NAME[col]; }
			
		/** ritorna il tipo dei valori serve per allineare correttamente i numeri */
		public Class getColumnClass(int col) { return getValueAt(0,col).getClass(); }
		
		/** specifica se le celle sono editabili */
		public boolean isCellEditable(int row, int col) {
			//tutte editabili per adesso
			return false;
		}
		
		/** metodo per gestire le modifiche dell'utente */
		public void setValueAt(Object value, int row, int col) {
			Transaction t = (Transaction)v.elementAt(row);
			
			switch (col){
				//case 0: t.setDate((String)value);
				case 1: t.setDescription((String)value);
				case 2: t.setAmount((Float)value);
				case 3: t.setTypeOfTransaction((TypeOfTransaction)value);
			}
		}
		
		//Controlla se sta roba funziona
		public void update(){
			this.fireTableDataChanged();
		}
		
		//Idem di sopra
		public void load(Vector<Transaction> v){
			this.v = v;
			update();
		}
		
}
