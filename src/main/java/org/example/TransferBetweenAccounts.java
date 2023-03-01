package org.example;

public class TransferBetweenAccounts {
    public void transfer(Account origin, Account destination, int value) {
        if (value <= 0)
            throw new IllegalArgumentException("value should be more than zero");

        destination.throwCredit(value);
        origin.throwDebt(value);
    }
}
