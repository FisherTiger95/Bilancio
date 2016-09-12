package bilancio.data;

import java.util.Date;

public class Transaction {
	
	private float amount;
	private Date date;
	private String description;
	private boolean entry;
	
	public Transaction(){}
	
	public Transaction(Date date, String description, float amount, boolean entry){
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.entry = entry;
	}
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isEntry() {
		return entry;
	}

	public void setEntry(boolean entry) {
		this.entry = entry;
	}
}
