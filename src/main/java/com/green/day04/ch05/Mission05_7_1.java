package com.green.day04.ch05;

// p.135
public class Mission05_7_1 {
    public static void main(String[] args) {
        for (int dan = 2; dan <= 8; dan += 2) {
            for (int i = 1; i <= dan; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
            }
            System.out.println("----------");
        }
    }
}