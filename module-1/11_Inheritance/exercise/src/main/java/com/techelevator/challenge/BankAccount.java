package com.techelevator.challenge;

public class BankAccount {

    // Defining member variables

    private String accountHolderName = "";
    private String accountNumber = "";
    private int balance;

    // Constructors

    public BankAccount(String accountHolderName, String accountNumber){
        this. accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Methods

    public int deposit(int amountToDeposit){
        this.balance += amountToDeposit;
        return this.balance;
    }

    public int withdraw(int amountToWithdraw){
        this.balance -= amountToWithdraw;
        return this.balance;
    }

    // Getters


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
    
}
