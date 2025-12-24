package entities;

public class Account {
	public Integer number;
	public String name;
	public double balance;
	
	public Account() {}

	public Account(Integer number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(Integer number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public double doDeposit(double balance) {
		return this.balance += balance;
	}
	
	public double doWithdraw(double withdraw) {
		return this.balance -= withdraw + 5.00;
	}
}