package exer_3;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0; // assume all accounts have the same interest rate
    private Date dateCreated = new Date();

    public Account() {

    }

    public Account(int id, double balance) {
        this.id = id;
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public int getId() {
        return id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12.0;
    }

    public double getMonthlyInterest() {
        return balance * (this.getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }


    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        System.out.println("the initial account balance is: " + account.getBalance() + "$");
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        System.out.println("the balance after withdraw is: " + account.getBalance() + "$");

        account.deposit(3000);
        System.out.println("the balance after deposit is: " + account.getBalance() + "$");

        System.out.println("the monthly interest is: " + account.getMonthlyInterest() + "$");
        System.out.println("the account was created on date and time: " + account.getDateCreated().toString());
    }
}

