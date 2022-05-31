package com.techelevator.challenge;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount{

    // Constructors

    public SavingsAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, BigDecimal balance){
        super(accountHolderName, accountNumber, balance);
    }

    public BigDecimal withdraw(BigDecimal amountToWithdraw){
        if ((super.getBalance().subtract(amountToWithdraw.add(new BigDecimal(2))).compareTo(BigDecimal.ZERO)) == - 1){
            return super.getBalance();
        }
        else if ((super.getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal(150))) == -1){
            return super.withdraw(amountToWithdraw.add(new BigDecimal(2)));
        }
        else {
            return super.withdraw(amountToWithdraw);
        }
    }

}
