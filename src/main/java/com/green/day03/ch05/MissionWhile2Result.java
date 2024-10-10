package com.green.day03.ch05;

public class MissionWhile2Result {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 100) {
            System.out.println(n++);
        }
        System.out.println("-------");
        do {
            System.out.println(--n);
        } while (n > 1);
    }
}
