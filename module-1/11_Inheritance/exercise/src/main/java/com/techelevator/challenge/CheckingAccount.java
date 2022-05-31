package com.techelevator.challenge;

import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {

        // Constructor

    public CheckingAccount(String accountHolderName, String accountNumber){
            super(accountHolderName, accountNumber);
        }

    public CheckingAccount(String accountHolderName, String accountNumber, BigDecimal balance){
            super(accountHolderName, accountNumber, balance);
        }


        public BigDecimal withdraw(BigDecimal amountToWithdraw){
            if ((super.getBalance().subtract(amountToWithdraw)).compareTo(new BigDecimal(-100)) == -1){
                return super.getBalance();
            }
            else if ((super.getBalance().subtract(amountToWithdraw).compareTo(BigDecimal.ZERO) == -1) && (super.getBalance().subtract(amountToWithdraw).compareTo(new BigDecimal(-100)) == 1)) {
                return super.withdraw(amountToWithdraw.add(BigDecimal.TEN));
            }
            else {
                return super.withdraw(amountToWithdraw);
            }
        }

    }
