package com.techelevator;

public class CreditCardAccount implements Accountable {

    //Defining member variables

    private String accountHolder = "";
    private String accountNumber = "";
    private int balance;
    private int debt = 0;


    //Getters

    public int getBalance(){
        return balance - debt;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    //Constructor

    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this. accountNumber = accountNumber;
    }

    // Methods

    public int pay(int amountToPay){
        this.debt -= amountToPay;
        return this.debt;
    }

    public int charge(int amountToCharge){
        this.debt += amountToCharge;
        return this.debt;
    }



}
