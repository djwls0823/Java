package com.green.day05.ch07;

public class BankAccountPOTest {
    public static void main(String[] args) {
        System.out.println("balance : " + BankAccountPO.balance);
        int deposit = BankAccountPO.deposit(4000);
        deposit = BankAccountPO.deposit(4000);
        System.out.println("balance : " + BankAccountPO.balance);
        System.out.println("deposit : " + deposit);

        deposit = BankAccountPO.withdraw(2000);
        System.out.println("deposit : " + deposit);

        BankAccountPO.checkMyBalance();
    }
}
