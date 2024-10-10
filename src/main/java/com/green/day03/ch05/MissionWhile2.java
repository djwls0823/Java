package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        int n = 1;
        while (n < 101) {
            System.out.println(n++);
        }
        System.out.println("-------");
        int n2 = 100;
        do {
            System.out.println(n2--);
        } while (n2 > 0);
    }
}
