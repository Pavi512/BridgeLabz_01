package oops;

import java.util.Scanner;

class Account1 {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int i) {
        this.balance = balance;
    }
}

public class ATMApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account1 acc = new Account1();

        while (true) {

            System.out.println("\n1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Balance");
            System.out.println("4.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    double depositAmount = sc.nextDouble();
                    acc.deposit(depositAmount);
                    break;

                case 2:
                    double withdrawAmount = sc.nextDouble();
                    acc.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Balance = " + acc.getBalance());
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
