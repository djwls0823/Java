package com.green.day04.ch06;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1 = 113;
        boolean b = logicalOp1(n1);
        System.out.println("b : " + b);
        boolean b2 = logicalOp2(n1);
        System.out.println("b2 : " + b2);
    }

    static boolean logicalOp1(int n) {
        return (n >= 1 && n <= 100);
    }

    static boolean logicalOp2(int n) {
        return (n % 2 == 0) || (n % 3 == 0);
    }
}
