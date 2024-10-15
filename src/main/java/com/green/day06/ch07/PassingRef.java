package com.green.day06.ch07;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.deposit(2000);

        BankAccount ba2 = ba;
        ba2.checkMyBalance();
        ba.checkMyBalance();

        ba2 = null; // null의 의미는 객체를 가르키고 있지 않다. (주소값 없다.)
        if(ba2 != null) { //null 체크
            ba2.checkMyBalance();
        }
        //null인 상태에서 메소드 호출을 하면 NullPointException 예외가 발생된다.
        //null인 상태에서 메소드 호출을 하면 안된다.

        //ba2 = new BankAccount(); //새롭게 주소값 저장할 수 있다.
        check(ba);

        //만약 아래처럼 적었다면 check 메소드는 non-static 메소드이다.
        //PassingRef pf = new PassingRef();
        //pf.check(ba);
    }
    static void check(BankAccount ba) {
        ba.checkMyBalance();
    }
}