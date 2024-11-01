package com.green.day16.ch26;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> cons = n -> System.out.println(n > 0 ? n : -n) ;

        cons.accept(10);
        cons.accept(-20);
        cons.accept(-30);
        cons.accept(30);

        Consumer<String> cons2 = str -> System.out.printf("%s는(은) %d글자입니다.\n", str, str.length());

        cons2.accept("abc"); //"abc는(은) 3글자입니다."
        cons2.accept("dddd"); //"dddd는(은) 4글자입니다."
    }
}
