package com.green.day04.ch06;

public class MethodGugudan {
    public static void main(String[] args) {
        gugudan(4);
        System.out.println("----------");
        gugudan(6);
        System.out.println("----------");
        gugudanFromTo(5, 9);
        System.out.println("----------");
        gugudanFromTo(2, 4);
    }
    static void gugudan(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
    }

    static void gugudanFromTo(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }
        }
    }
}
