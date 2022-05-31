package com.techelevator.challenge;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        CheckingAccount checkingAccountOne = new CheckingAccount("Alex", "12345", new BigDecimal(1000.00) );

        checkingAccountOne.withdraw(new BigDecimal(100));

        System.out.println(checkingAccountOne.getBalance());

        SavingsAccount savingsAccountOne = new SavingsAccount("Alex", "123456", new BigDecimal(150.00));

        savingsAccountOne.withdraw(new BigDecimal(50));

        System.out.println(savingsAccountOne.getBalance());



    }





}
