package questioone;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account1 = new Account("Jane Green", 42.00);
		Account account2 = new Account("John Blue", 0.00);
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f", account2.getName(), account2.getBalance());
		
		System.out.printf("%nEnter the amount to be deposited in %s account: ", account1.getName());
		double depositAmount = input.nextDouble();
		System.out.printf("%nAdding $%.2f to account balance.%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
		
		System.out.printf("%nEnter the amount to be deposited in %s account: ", account2.getName());
		depositAmount = input.nextDouble();
		System.out.printf("%nAdding $%.2f to account balance.%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f", account2.getName(), account2.getBalance());
		
		System.out.printf("%n%nEnter a value to be withdrawn from %s account: ", account1.getName());
		double withdrawnAmount = input.nextDouble();
		account1.withdraw(withdrawnAmount);
		
		System.out.printf("%n%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f", account2.getName(), account2.getBalance());
		
		input.close();
		
	}

}
