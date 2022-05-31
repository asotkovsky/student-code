package com.techelevator;

public class CheckingAccount extends BankAccount {

    // Constructor

    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }


    public int withdraw(int amountToWithdraw){
        if ((super.getBalance() - amountToWithdraw <= -100)){
            return super.getBalance();
        }
        else if ((super.getBalance() - amountToWithdraw < 0) && ((super.getBalance() - amountToWithdraw) > -100)){
            return super.withdraw(amountToWithdraw + 10);
        }
        else {
            return super.withdraw(amountToWithdraw);
        }
    }

}
