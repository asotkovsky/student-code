package com.techelevator.challenge;

import java.math.BigDecimal;

public class BankAccount {

    // Defining member variables

    private String accountHolderName = "";
    private String accountNumber = "";
    private BigDecimal balance;

    // Constructors

    public BankAccount(String accountHolderName, String accountNumber){
        this. accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance.equals(balance);
    }

    public BankAccount(String accountHolderName, String accountNumber, BigDecimal balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods

    public BigDecimal deposit(BigDecimal amountToDeposit){

        BigDecimal newBalance = new BigDecimal("");
        newBalance = (balance.add(amountToDeposit));

        return newBalance;
    }

    public BigDecimal withdraw(BigDecimal amountToWithdraw){

        balance =  balance.subtract(amountToWithdraw);
        return balance;
    }

    // Getters


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

}
