package com.techelevator;

public class CheckingAccount extends BankAccount {



    // Constructor

    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }


    @Override
public int withdraw(int amountToWithdraw){

        if ((super.getBalance() < 0) && ((super.getBalance() - amountToWithdraw) > -100)){
            super.withdraw(amountToWithdraw);
            super.getBalance() = super.getBalance() - 10;
        }
    }

}
