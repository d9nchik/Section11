package exercise8;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();
    private ArrayList<Transaction> transactions = new ArrayList<>();


    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(int sum) {
        balance -= sum;
        transactions.add(new Transaction('W', sum, balance, "Withdrawing of money"));
    }

    public void deposit(int sum) {
        balance += sum;
        transactions.add(new Transaction('D', sum, balance, "Depositing of money"));
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("Deposit holder: " + getName() + "\n" +
                "Interest rate: " + getAnnualInterestRate() + "\n" +
                "Balance: " + getBalance() + "\n");
        for (int i = 0; i < transactions.size(); i++) {
            toReturn.append(i).append(") ").append(transactions.get(i)).append("\n");
        }
        return toReturn.toString();
    }
}
