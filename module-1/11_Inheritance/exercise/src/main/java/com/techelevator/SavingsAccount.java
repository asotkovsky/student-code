package com.techelevator;

public class SavingsAccount extends BankAccount {

    // Constructors

    public SavingsAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    public int withdraw(int amountToWithdraw){
        if ((super.getBalance() - (amountToWithdraw +2) < 0)){
            return super.getBalance();
        }
        else if ((super.getBalance() - (amountToWithdraw) < 150)){
            return super.withdraw(amountToWithdraw + 2);
        }
        else {
            return super.withdraw(amountToWithdraw);
        }
    }

}
