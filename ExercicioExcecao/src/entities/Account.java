package entities;

import model.exceptions.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withDrawLimit) throws Exception {
	    if(withDrawLimit>balance) throw new DomainException("Withdrawerror: Not enough balance");
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumbe(Integer numbe) {
		this.number = numbe;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void depositAmout(double amount) throws Exception {
		if(amount<0) {
			throw new DomainException("Error!");
		}
		else balance+=amount;
	}
	
	public void withDraw(double amount) throws Exception {
		if(amount>withDrawLimit) {
			throw new DomainException("Withdrawerror: The amount exceeds withdraw limit");
		}
		
		else balance-=amount;
	}
	
	@Override 
	public String toString() {
		return "New balance: "
				+balance;
	}
}
