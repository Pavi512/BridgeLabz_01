package oops;

import java.util.Scanner;

class Bank{
	private int bal;

	public Bank() {
	}
	public Bank(int bal) {
		this.bal = bal;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	public void deposit(int amt) {
		System.out.println("Deposited : " + amt);
		bal = bal + amt;
		System.out.println("Balance : " + bal);
	}
	
	public void withdraw(int amt) {
		if(amt > bal) {
			System.out.println("Insufficient balance...");
		}
		else {
			System.out.println("Withdraw : " + amt);
			bal = bal - amt;
			System.out.println("Balance : " + bal);
		}
	}
}

public class BankApplication {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int bal = scan.nextInt();
		Bank b = new Bank();
		System.out.println("Enter amount to deposit");
		int amt = scan.nextInt();
		b.deposit(amt);
		System.out.println("Enter amount to withdraw");
		int amt2 = scan.nextInt();
		b.withdraw(amt2);
		
	}

}
