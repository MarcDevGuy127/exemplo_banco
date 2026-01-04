package entities;

public class Account {
	public int number;
	public String name;
	public double balance;
	
	//receber conta e titular
	public Account(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit); // encapsulando  um metodo para facilitar manutencao
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
}