package exer_7;

import java.util.Date;
import java.util.Scanner;

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
        infinite();
    }

    //Following 4 methods are for chapter 10

    private static Account[] initialize() {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            Account account = new Account();
            account.setId(i);
            account.setBalance(100);
            accounts[i] = account;
        }
        return accounts;
    }

    private static boolean findId(Account[] accounts, int id) {
        boolean doExists = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getId() == id) {
                doExists = true;
                break;
            }
        }
        return doExists;
    }

    private static void infinite() {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = initialize();
        while (true) {
            System.out.print("Enter an id: ");
            int id = scanner.nextInt();
            if (findId(accounts, id)) {
                Account account = getAccount(id, accounts);
                System.out.print("Main Menu\n1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit\nEnter a Choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is: " + account.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        account.withdraw(scanner.nextInt());
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        account.deposit(scanner.nextDouble());
                        System.out.println(account.getBalance());
                        break;
                    case 4:

                }
            } else {
                System.out.println("You have entered incorrect id. Enter again: ");
            }
        }

    }

    private static Account getAccount(int id, Account[] accounts) {
        Account account = null;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getId() == id) {
                account = accounts[i];
                break;
            }
        }
        return account;
    }
}