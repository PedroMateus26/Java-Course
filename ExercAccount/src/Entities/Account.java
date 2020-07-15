package Entities;

public class Account {
	
	private String holder;
	private int number;
	private double value;
	
	public Account() {
		
	}
	
	public Account(String holder, int number) {
		this.holder = holder;
		this.number = number;
		
	}
	
	public Account(String holder, int number, double value) {
		this.holder = holder;
		this.number = number;
		deposit(value);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getValue() {
		return value;
	}
	
	public void deposit(double value) {
		this.value+=value;
	}
	
	public void withDraw(double value) {
		this.value-=value+5;
	}

		public String toString() {
			return "Account: "
					+number
					+", Holder: "
					+holder
					+", Balance: $"
					+String.format("%.2f", value);
		}
}
