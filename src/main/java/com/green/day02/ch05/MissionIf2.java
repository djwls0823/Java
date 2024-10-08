package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); // 0 ~ 100 사이의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score: %d\n", score);

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
