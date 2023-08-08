package com.task10;

public class AccountTest {

	public static void main(String[] args) {
		//create account object
		Account account = new Account(5000.00);
		
		account.deposit(1000);
		account.withdraw(2220);
		
// access instance variable using getter method
		double balance1=account.getBalance();
		double balance2=account.getBalance();
		System.out.println("Balace after deposit:"+ balance1);
		System.out.println("Balace after withdraw:"+ balance2);
		
		
	}

}
