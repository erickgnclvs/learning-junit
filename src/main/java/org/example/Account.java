package org.example;

public class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void throwCredit(int value) {
        this.balance += value;
    }

    public void throwDebt(int value) {
        this.balance -= value;
    }
}
