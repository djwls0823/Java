package com.green.day04.ch05;

public class Mission05_7_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i + j == 9) {
                    System.out.printf("%d, %d\n",i, j);
                }
            }
        }
    }
}
