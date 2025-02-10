package questioone;

public class Account {
	
	String name;
	double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>0.0) {
			this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		if(depositAmount>0.0) {
			balance += depositAmount;
		}
	}
	
	// create the withdraw method that checks if the value declared is valid accordingly to the balance.
	
	
}
