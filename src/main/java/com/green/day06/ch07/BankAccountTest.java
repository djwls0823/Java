package com.green.day06.ch07;

public class BankAccountTest {
    public static void main(String[] args) {
        //ba는 BankAccount 객체 주소값만 담을 수 있는 참조변수이다.
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();

        BankAccount ba3 = new BankAccount();
        ba3.checkMyBalance();
        ba3.deposit(40000);
        ba3.withdraw(1000);
        ba3.checkMyBalance();

        ba.checkMyBalance();
        //BankAccount ba2 = new String("안녕"); // ba2는 String 객체 주소값을 담을 수 없다.
        String str = new String("안녕");
    }
}
