package oops;

class Account {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Account1 acc = new Account1();

        acc.setBalance(10000);

        System.out.println("Balance = " + acc.getBalance());
    }
}

