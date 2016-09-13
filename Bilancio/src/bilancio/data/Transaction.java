package bilancio.data;

import java.util.Date;

public class Transaction {
	
	public enum TypeOfTransaction{
		income,
		expense;
	}
	
	private float amount;
	private Date date;
	private String description;
	private TypeOfTransaction type;
	
	public Transaction(){}
	
	public Transaction(Date date, String description, float amount, TypeOfTransaction type){
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.type = type;
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
	
	public TypeOfTransaction getTypeOfTransaction() {
		return type;
	}

	public void setTypeOfTransaction(TypeOfTransaction type) {
		this.type = type;
	}
}
